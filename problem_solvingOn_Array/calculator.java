package problem_solvingOn_Array;

import java.util.Scanner;

public class calculator {
    static int multiply (int num1, int num2) {
        return num1 * num2;
    }
    static int divide (int num1, int num2) {
        return num1 / num2;
    }
    static int Subtract (int num1, int num2) {
        return num1 - num2;
    }
    static int Addition (int num1, int num2) {
        return num1 + num2;
    }
    static int module (int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Two number :) ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(multiply(num1,num2));

//        System.out.println(divide(num1,num2));

//        System.out.println(Subtract(num1,num2));

//        System.out.println(Addition(num1,num2));

//        System.out.println(module(num1,num2));



    }
}
