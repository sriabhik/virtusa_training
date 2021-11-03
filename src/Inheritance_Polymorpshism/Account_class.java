package Inheritance_Polymorpshism;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

abstract class Account{
    String name;
    int number;
    int balance;
    Date startDate;
    Account(String name,int n,int b,Date d){
        name = name;number = n;balance = b;startDate = d;
    }
    abstract double Interest(long diff);
}
class Saving extends Account{
    Saving(String n,int a,int b,Date d){
        super(n,a,b,d);
    }
    @Override
    double Interest(long diff) {
        return ((double)balance * diff* 12)/100;
    }
}
class Current extends Account{
    Current(String n,int a,int b,Date d){
        super(n,a,b,d);
    }
    @Override
    double Interest(long diff) {
        return ((double)balance * diff* 5)/100;
    }
}
public class Account_class {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int An = sc.nextInt();
        int Bal = sc.nextInt();
        sc.nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String d1= sc.nextLine(); String d2 = sc.nextLine();

        Date date1 = df.parse(d1); Date date2= df.parse(d2);

        long diff = (date2.getTime()-date1.getTime())/(24 *60 *60 *1000);

        Saving s = new Saving(name,An,Bal,date1);
        Current c = new Current(name,An,Bal,date2);
        if(Case == 1)
            System.out.println(s.Interest(diff/365));
        else
            System.out.println(c.Interest(diff/365));
    }
}
