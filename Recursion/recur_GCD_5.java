package Recursion;
import java.util.Scanner;
public class recur_GCD_5 {
    static int IterativeGreatestCommonDiviser (int n, int m) {
        while (n % m != 0) {
            int rem = n % m;
            n = m;
            m = rem;
        }
        return m;
    }
    static int GreatestCommonDiviser(int n, int m ) {
        if (m == 0) return n;
        return GreatestCommonDiviser(m, n % m);
    }
    static int pow(int a, int b) {
        if(b==0) return 1;
        if(b % 2 == 0) {
            return pow(a, b / 2) * pow(a, b / 2);
        }
        return a * pow(a, b / 2) * pow(a, b / 2);
    }
    static int armStrongNumber (int n,int dig) {
        if (n == 0) {
           return n;
        }
        return pow(n % 10, dig) + armStrongNumber(n/10, dig);
    }
    static void leapYear (int n) {
        boolean leap = false;
        // if the year is divided by 4
        if (n % 4 == 0) {
            // if the year is century
            if (n % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if(n % 400 == 0) {
                    leap = true;
                }
                // if the year is not century
            }else
                leap = true;
        }
        System.out.println(leap);
    }
    public static int product(int x, int y) {
        // if x is less than y swap the numbers
        if (x < y)
            return product(y, x);
            // iteratively calculate y times sum of x
        else if (y != 0)
            return (x + product(x, y - 1));
            // if any of the two numbers is zero return zero
        else
            return 0;
    }
    static int iterativeProduct(int x, int y) {
        if (y != 0 && x != 0) {
           return x * y;
        }
        return 0;
    }
    public static boolean isPrime(int n, int i) {
        if (n <= 2)
//            return (n == 2) ? true : false;
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }

    public static int find(int decimal_number) {
        if (decimal_number == 0)
            return 0;
        else
            return (decimal_number % 2 + 10 * find(decimal_number / 2));
    }
    public static int binary_to_gray(int n, int i) {
        int a, b;
        int result = 0;
        if (n != 0) {
            // Taking last digit
            a = n % 10;
            n = n / 10;
            // Taking second last digit
            b = n % 10;
            if ((a & ~b) == 1 || (~a & b) == 1) {
                result = (int)(result + Math.pow(10, i));
            }
            return binary_to_gray(n, ++i) + result;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n and m :( ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        System.out.println("IterativeGreatestCommonDiviser :( " + IterativeGreatestCommonDiviser(n,m));
//        System.out.println("GreatestCommonDiviser :( " + GreatestCommonDiviser(n,m));

        //ArmStrong number using recursion
//        int n = sc.nextInt();
//        int digits = 0;
//        int temp = n;
//        while(temp > 0) {
//            digits++;
//            temp /= 10;
//        }
//        if (n == armStrongNumber(n , digits))
//            System.out.println("Yes");
//        else
//            System.out.println("No");

//        checking leapYear
//        System.out.println("Enter year :( ");
//        int n = sc.nextInt();
//        leapYear(n);

        //product using recursion
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(product(a,b));
//        System.out.println("The product is :(" + iterativeProduct(a,b));
//        System.out.println(pow(a,b));
//        System.out.printf("%d is a power of %d", a, b);

        //Prime number or not
//        System.out.println("Enter n :( ");
//        int n = sc.nextInt();
//        if (isPrime(n, 2))
//            System.out.println("Yes");
//        else
//            System.out.println("No");


//decimal number converting to binary 1 Or 0
//        System.out.println("Enter the number n: ");
//        int n = sc.nextInt();
//        System.out.println(find(n));

//        Binary to Gary Conversion
        System.out.println("Enter the binary number n: ");
        int n = sc.nextInt();
        System.out.println(binary_to_gray(n, 0));





    }
}
