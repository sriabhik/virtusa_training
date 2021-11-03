package Inheritance_Polymorpshism;

import java.util.Scanner;

class Matrixx{
    static int row;
    static int col;
    void setVal(int r,int c){
        row = r;
        col = c;
    }
    int[][] mat ;
    Scanner sc = new Scanner(System.in);

    void setMat(){
        System.out.println(row+" "+col);
        mat = new int[row][col];
        for(int i = 0; i < row;i++){
            for(int j = 0; j < col;j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    void Display(){
        for(int[] a : mat){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
    void rotate(){};
}
class ClockWise extends Matrixx{
    @Override
    void rotate() {
        System.out.println("Hello");
    }
}
class AntiClockWise extends  Matrixx{
    @Override
    void rotate() {
        System.out.println("Anti");
    }
}
class Matrix{
    public static void main(String[] args) {
        Matrixx m = new Matrixx();
        m.setVal(2,2);
        m.setMat();
        ClockWise c = new ClockWise();
        c.rotate();
        AntiClockWise an = new AntiClockWise();
        an.rotate();
    }
}