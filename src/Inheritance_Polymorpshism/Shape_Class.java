package Inheritance_Polymorpshism;

import java.util.Scanner;

class Shape{
    double area;

    public void computeArea(){
        area = 0;
    }
}
class Circle extends Shape{
    double radius;
    public void computeArea(){
        area = (3.14)*(radius)*(radius);
        System.out.println(area);
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public void computeArea(){
        area = (length * breadth);
        System.out.println(area);
    }
}
class Triangle extends Shape{
    double base;
    double height;
    public void computeArea(){
        area = ((double)1/2)*(base * height);
        System.out.println(String.format("%.2f",area));
    }
}
public class Shape_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ch = sc.nextInt();
        if(Ch == 1){

            Circle c = new Circle();
            c.radius = sc.nextInt();
            c.computeArea();
        }
        else if(Ch == 2){
            Rectangle r = new Rectangle();
            r.length = sc.nextInt();
            r.breadth = sc.nextInt();
            r.computeArea();
        }
        else{
            Triangle t = new Triangle();
            t.base = sc.nextInt();
            t.height = sc.nextInt();
            t.computeArea();
        }
    }
}
