package Inheritance_Polymorpshism;

import java.io.*;
import java.text.*;
import java.util.*;

class Event {
    String name;

    Double cost;
    void setName(String n){
        name = n;
    }
    String getName(){return  name;}

    void setCost(double c){cost = c;}
    Double getCost(){return cost;}
    double CalGST_E(long d){
        double total = d * getCost();
        return (total *5)/100;
    }
    double CalGST_EV(long d){
        double total = d * getCost();
        return (total *15)/100;
    }
    void ans(long  diff){
        System.out.println(getName());
        if(getName().contains("Exhibition")){
            System.out.println("ex ");
            System.out.println(CalGST_E(diff));
        }
        else{
            System.out.println(CalGST_EV(diff));
        }
    }
}

class Event_Class{
    public static void main(String[] args) throws IOException, ParseException{

        Event e = new Event();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc. nextLine();

        String n = sc.nextLine();

        e.setName(n);
        String detail_ = sc.nextLine();

        String type_ = sc.nextLine(); String o_n = sc.nextLine();

        double d = sc.nextDouble(); e.setCost (d);

        int k = sc.nextInt ();
        sc.nextLine();
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String d1= sc.nextLine(); String d2 = sc.nextLine();

        Date date1 = df.parse(d1); Date date2= df.parse(d2);

        long diff = (date2.getTime()-date1.getTime())/(24 *60 *60 *1000);
        e. ans (diff);

    }

}