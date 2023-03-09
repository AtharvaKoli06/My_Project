package Basic_program;

import java.util.Scanner;

public class Fetching_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Problem 1: Count the number of digits in the given number n.

//        int count = 0;
//
//        while (n > 0) {
//            count = count + 1;
//            n /= 10;
//            System.out.println("The count Number of current iteration is:" + count);
//        }
//        System.out.println("The all count Number is: " + count);

        //Problem 2: Find the sum of digits in a given number n.
        int sum = 0;

       while(n > 0) {
           sum += (n%10);
           n /= 10;
           System.out.println("The current iteration sum is: " + sum);
       }
        System.out.println("The number of sum is: " + sum);


        //Problem 3: Reverse the digits of a number.

//        int ans = 0;
//        while (n > 0) {
//            int remainder = n % 10;
//            ans = ans * 10 + remainder;
//            n /= 10;
//        }
//        System.out.println(ans);

        //Problem4: Find the sum of the following series
        // 1 - 2 + 3 - 4 ... n

//        int ans = 0;
//        for (int i = 1; i <= n; i++) {
//            if(i % 2 == 0) {
//                ans -= i;
//            }else {
//                ans += i;
//            }
//        }
//        System.out.println(ans);

        //Problem 2: Given 2 numbers a and b. Find a raise to the power b.
//        int b = sc.nextInt();
//
//        int ans = 1;
//        for (int i = 1; i <= b; i++) {
//            ans *= n;
//        }
//        System.out.println(ans);

        // Problem 3: Print the nth Factorial number.

//        int fact = 1;
//
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
////            System.out.println("The factorial of current iteration "+ n + "is" + fact);
//        }
//        System.out.println("The factorial of" + n + " is:" + fact);

//      int sum = 0;
//      while (n > 0) {
//          sum += (n%10);
//          n /= 10;
//          System.out.println("The current iteration :( "+sum);
//      }
//        System.out.println(sum);
    }
}
