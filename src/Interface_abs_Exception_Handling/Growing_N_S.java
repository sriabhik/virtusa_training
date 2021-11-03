package Interface_abs_Exception_Handling;

import java.util.Scanner;

interface Growing {
    void isGrowning(String s,int n);
}
class GrowingNumber implements Growing{
    public void isGrowning(String s,int n){
        int temp = n;
        int i = 1;
        int flag = 0;
        int n1 = n / 10;
        int tmp = 0;
        while(n != 0){

            if(i == 1) {
                tmp = n % 10;
                i++;
            }
            else{

                int tmp1 = n % 10;
                if(tmp1 > tmp){
                    System.out.println("Not Growing String");
                    flag = 1;
                    break;
                }
                tmp = tmp1;
            }
            n = n /10;
        }
        if(flag == 0) System.out.println("Growing number");
    }
}
class GrowingString implements Growing{
    public void isGrowning(String s,int n ){
        int flag = 0;
        for(int i = 0; i < s.length() -1 ;i++){
            if((int)(s.charAt(i))>(int)(s.charAt(i+1))){
                System.out.println("Not growing string");
                flag =1;
                break;
            }
        }
        if(flag == 0) System.out.println("Growing string");
    }
}
public class Growing_N_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        GrowingNumber g = new GrowingNumber();
        g.isGrowning(s,n);
        GrowingString g1 = new GrowingString();
        g1.isGrowning(s,n);
    }
}
