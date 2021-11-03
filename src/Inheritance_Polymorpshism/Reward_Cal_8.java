package Inheritance_Polymorpshism;

import java.util.Scanner;

class VISACard{
    String holder_n;
    String cvv;
    public double computeRewardPoint(String PurchaseType,double amount){
        return (amount * 1)/100;
    }
}
class HPVISACard{
    String holder_n;
    String cvv;
    public double computeRewardPoint(String PurchaseType,double amount){
        return ((amount * 1)/100)+10;
    }
}

public class Reward_Cal_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ccv_n = sc.nextLine();

        double amt = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        int ch = sc.nextInt();
        if(ch == 1){
            VISACard v = new VISACard();
            System.out.println(v.computeRewardPoint(type,amt));
        }
        else if(ch == 2){
            HPVISACard v = new HPVISACard();
            System.out.println(v.computeRewardPoint(type,amt));
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
