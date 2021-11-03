package Interface_abs_Exception_Handling;

import java.util.Scanner;

interface A1{
     void Store_Array(int n);
}
public class QUES1_MIN_MAX implements A1 {
    public void Store_Array(int n){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[n];
        int sum_o = 0;int sum_e = 0;
        for(int i=0;i < n;i++){
            A[i] = sc.nextInt();
            if(i % 2 == 0){
                sum_o += A[i];
            }
            else{
                sum_e += A[i];
            }
        }
        System.out.println(sum_o + " " + sum_e);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n % 2 != 0){
            System.out.println("Enter valid number");
        }
        else{
            QUES1_MIN_MAX q = new QUES1_MIN_MAX();

            q.Store_Array(n);
        }
    }

}
