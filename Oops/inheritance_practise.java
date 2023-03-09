package Oops;

import java.util.Scanner;

abstract class shape {
    float area;

    abstract public void compute();
    abstract public void input();
    public void disp() {
        System.out.println("The area of rectangle is " + area);
    }

}

class Rectangle extends shape{
    float length;
    float breadth;

    public void input() {
        System.out.println("Calculation of rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        length = sc.nextFloat();
        breadth = sc.nextFloat();

    }
    public void compute() {
        area = length * breadth;
    }
}
class square extends shape{
    float length;

    public void input() {
        System.out.println("Calculation of square");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of square");
        length = sc.nextFloat();


    }
    public void compute() {
        area = length * length;
    }

}
class Circle extends shape {
    float radius;
    float area;

    public void input() {
        System.out.println("Calculation of Circle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
       radius = sc.nextFloat();


    }
    public void compute() {
        area = 3.14f * radius * radius;
    }

}

class Geometry {
    public void poly(shape s) {
        s.input();
        s.compute();
        s.disp();
    }
}

public class inheritance_practise {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
//        rec.input();
//        rec.compute();
//        rec.disp();
        square sq = new square();
//        sq.input();
//        sq.compute();
//        sq.disp();
        Circle c = new Circle();
//        c.input();
//        c.compute();
//        c.disp();

//        polymorphism
        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(c);

    }
}
