package Recursion;

import java.util.Scanner;

public class recur_basic_1 {
    static void func1() {
        int x = 1;
        func2();
        System.out.println("This is func1 :) " + x);
    }
    static void func2() {
        int x = 2;
        func3();
        System.out.println("This is func two :) " + x);
    }
    static void func3() {
        int x = 3;
        System.out.println("This is func three :) " + x);
    }
    static void printIncreasing(int n) {
        //halting condition or base case
        if(n==0) {
            System.out.println(0);
            return;
        }
//        smaller problem or sub problem, recursive work
        printIncreasing(n-1);//1, 2, ................ n-1
//        self work
        System.out.println(n);
    }
    static void printDecreasing(int n) {
        //halting condition or base case
        if(n==1) {
            System.out.println(1);
            return;
        }
//        self work
        System.out.println(n);
//        smaller problem or sub problem, recursive work
        printDecreasing(n-1);//1, 2, ................ n-1
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :) ");
        int n = sc.nextInt();
        System.out.println("N is :) " + n);
//        printIncreasing(n);
        printDecreasing(n);
//        func1();
//        Recursion: The function calls itself with different parameter and base case to terminate the infinite loop
//        In Recursion, we solve bigger problem by solving sub problem
    }
}
