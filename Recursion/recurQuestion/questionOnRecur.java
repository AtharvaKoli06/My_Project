package Recursion.recurQuestion;

import java.util.Scanner;

public class questionOnRecur {
    static int factorial (int n) { // 4 3 2 1 0
        //Base Case
        if (n==0) return 1;
        //Small problem ---> to solve big problem
        int smallAns = factorial(n-1);
        //Self Work
        return n * smallAns; //4 * 3 2 1 = 24
    }
    static int sumDigits (int n) {
        //Base Case
        if (n>=0 && n <= 9) return n;
        // smaller problem ---> to solve Bigger problem
        int smallAns = sumDigits(n/10);
        //Self Work
        return smallAns + n % 10;
//        return sumDigits(n/10) + n % 10;
    }
    static int decToBinary (int n) {
        //Base Case
       if (n > 0) return 1;
        // smaller problem ---> to solve Bigger problem
//         int smallAns = decToBinary(n/2);
        //Self Work
       return decToBinary(n/2);
    }
//    https://leetcode.com/tag/Recursion/

    public static void main(String[] args) {
//        How to find factorial of a number using recursion ? (Solution)
        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the factorial number :)");
//        int n = sc.nextInt();
//        System.out.println(factorial(n));

//        How to find the sum of digits of a number using recursion ? (Solution)
//        System.out.println("Enter the numbers to sum them :)");
//        int m = sc.nextInt();
//        System.out.println(sumDigits(m));

//        How to convert a number from Decimal to Binary using recursion ? (Solution)
        System.out.println("Enter the numbers to convert them decimal to binary :) ");
        int b = sc.nextInt();
        System.out.println(decToBinary(b));


    }
}
