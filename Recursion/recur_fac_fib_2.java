package Recursion;

import java.util.Scanner;

public class recur_fac_fib_2 {
    static void factorialInForLoop (int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + "is :) " + fact);
    }
    static int factorialInRecursion (int n) {
        //Base Case
       if(n==0) {
           return 1;
       }
       //Smaller Problem: recursive Work
//        int smallAns = factorialInRecursion(n-1);
        //Big problem: Self Work
//        int ans = n * smallAns; //n * factorial(n-1)
//        return ans;

        //In factorial we have first remove recurrence relations
        //Upper All lines in one line
        return n * factorialInRecursion(n-1);
    }
    static int fibonacciSeries (int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return n;
        }
        //Sub problem
//        int prev = fibonacciSeries(n-1);
//        int prevPrev = fibonacciSeries(n-2);

        //Self Work
//        return prev + prevPrev;

        //Upper All lines in one line
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :) ");
        int n = sc.nextInt();
//        factorialInForLoop(n);
//        System.out.println(factorialInRecursion(4));
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacciSeries(i));
        }
    }
}
