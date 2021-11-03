package Interface_abs_Exception_Handling;

import java.util.Scanner;

interface A{
    void diagonalMinMx(int[][] m,int n);
}
class Diagonal_Min_Max implements A{
    public void diagonalMinMx(int[][]m ,int n){
        int [][] mat = new int[n][n];
        int R_min1 = Integer.MAX_VALUE;

        int R_max1 = Integer.MIN_VALUE;
        int R_min2 = Integer.MAX_VALUE;

        int R_max2 = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < n ; i++){
            for(int j = 0; j < n;j++){
                mat[i][j] = sc.nextInt();

            }
        }

        for(int i =0;i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    R_min1 = Math.min(R_min1,mat[i][j]);
                    R_max1 = Math.max(R_max1,mat[i][j]);
                }
                if(i+j == n-1){
                    R_min2 = Math.min(R_min2,mat[i][j]);
                    R_max2 = Math.max(R_max2,mat[i][j]);
                }
            }
        }
        System.out.println(R_min1+"\n"+R_max1+"\n"+R_min2+" "+R_max2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diagonal_Min_Max m = new Diagonal_Min_Max();
        int n = sc.nextInt();
        int[][] m1 = new int[n][n];
        m.diagonalMinMx(m1,n);

    }
}
