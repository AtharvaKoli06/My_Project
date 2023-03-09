package Recursion;

import java.util.Scanner;
public class recur_series_sum_pattern_4 {
    static void multiples (int n, int k) {
        //Base Case
           if (k == 0) {
               return;
           }
        //recursive work
        multiples(n,k-1); //5 10 25
        //self Work
        System.out.print(n * k + " ");

    }
    static void multiplicationTable (int n) {
        for (int i = 0; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    static int seriesSum1 (int n) {
        //BAse case
        if (n == 0) {
            return n;
        }
        //recursive work
        return seriesSum1(n-1) + n;
    }
//    Main question --> Alternate sum
    static int seriesSum (int n) {
        //BAse case
        if (n == 0) return n;
        //recursive work
       if (n % 2 == 0) { //even
           return seriesSum(n-1) - n;
       }else { //odd
           return seriesSum(n-1) + n;
       }
    }
    public static void rec(int n, int m, boolean flag) {
        System.out.print(m + " ");
        // If we are moving back towards n and we have reached there, then we are done
        if (!flag && n == m)
            return;

        // If we are moving towards 0 or negative.
        if (flag) {
            // If m is greater, then 5, recur with true flag
            if (m - 5 > 0)
                rec(n, m - 5, true);

            else // recur with false flag
                rec(n, m - 5, false);
        }

        else // If flag is false.
            rec(n, m + 5, false);
    }
    static void pattern(int n, int m, boolean flag) {
    System.out.print(m + " ");
    //if we are moving back towards n and we have reached there, then we are done
    if(!flag &&  n == m) return;
    //if we are moving towards 0 or negative
    if(flag) {
        //if m is greater, then 5, recur with true flag
        if (m - 5 > 0) {
            pattern(n, m - 5, true);
        }else { // recur with false flag
            pattern(n, m - 5,false);
        }
    }else {
        //if flag is false
        pattern(n, m + 5, false);
    }

}

//Sum of m-th summation
    public static int recOfMthSummation(int n, int m) {
    //base case
    if (m == 1)
        return sumofn(n);
// recursive work
    int sum = recOfMthSummation(n, m - 1);
//    self work
    return sumofn(sum);
}
    public static int sumofn(int n){
        int ans = 0;
        //base case
        if(n == 1){
            ans++;
            return ans;
        }
//        recursive work
        ans += n + sumofn(n-1);
//        self work
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n and k :) ");
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        multiples(n,k);
//        System.out.println("Printing the table :) ");
//        multiplicationTable(n);

//        System.out.println("Enter n :(");
//        int n = sc.nextInt();
//        System.out.println(seriesSum1(n));

        System.out.println("Enter n :(");
        int n = sc.nextInt();
//        System.out.println(seriesSum(n));
        System.out.println(sumofn(n));

//
//        System.out.println("Enter the number n: ");
//        int n = sc.nextInt();
//        pattern(n, n, true);

//        System.out.println("Enter the number n: ");
//        int m = sc.nextInt();
//        rec(m, m, true);

//Sum of m-th summation
//        System.out.println("Enter the number n: ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        System.out.println(recOfMthSummation(n, m));
    }

}
