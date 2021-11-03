package String_;

import java.util.ArrayList;
import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> chola = new ArrayList<String>();
        ArrayList<String> cheera = new ArrayList<String>();
        ArrayList<String> pall = new ArrayList<String>();
        ArrayList<String> pand = new ArrayList<String>();
        ArrayList<String> ren = new ArrayList<String>();
        while(n-- != 0){
            sc.nextLine();
            String str = sc.nextLine();
            int a = sc.nextInt();int b = sc.nextInt();
            if(a > 0 && b > 0){
                chola.add(str);
            }
            else if(a < 0 && b < 0){
                pall.add(str);
            }
            else if( a==b){
                ren.add(str);
            }
            else if(a < 0 && b > 0){
                cheera.add(str);
            }
            else if(a > 0 && b < 0){
                pand.add(str);
            }
        }
        for(String s : chola){
            System.out.println("["+s+",");
        }
        System.out.print("]");
        for(String s : cheera){
            System.out.println(s);
        }
    }
}
