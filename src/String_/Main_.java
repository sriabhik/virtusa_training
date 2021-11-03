package String_;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n+1];
        sc.nextLine();
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLine();
            System.out.println(i);
        }
        int j;
        String s = "";
        for(int i = 1;i < n;i++){
            int key = arr[i].length();
            s = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j].length() > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = s;

        }
        for(int i = 0; i < n;i++)
            System.out.print(arr[i] + " ");
        }
}
