package Oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        /*
        int a = 6;
        int b = 2;
        int result = 0;
        int[] value = {7,2,9,1};
        String name = null;
        try
        {
            result = a / name.length();
            System.out.println(value[5]);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(value[value.length-1]);
            System.out.println("Stay in your limit...");
        }catch (Exception e) {
            System.out.println("Something went wrong:");
        }
        System.out.println(result);
        System.out.println("THis statements is working now");

         */
        int num = 0;
       //try with resource
        try (Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Plzz Enter number:)");
        }finally {//mostly we close the resource in this finally block
            System.out.println("Exception");
        }


        System.out.println(num);
    }
}
