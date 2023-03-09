package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class recur_subsequence9 {
    static ArrayList<String> subSequences1 (String s) {
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if (s.length() == 0) {
            ans.add("");
        return ans;
        }
        char currChar = s.charAt(0);
        ArrayList<String> smallAns = subSequences1(s.substring(1));
        for (String ss :smallAns) {
            ans.add(ss);
            ans.add(currChar + ss);
        }
        return ans;
    }
    static void subsequences2 (String s, String currAns) { //s = "abd"
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr  = s.charAt(0); // a
        String remString = s.substring(1); //bc
        //curr char --> choose to be part of currAns
        subsequences2(remString, currAns + curr); //bc , a
        //curr char --> does not choose to be part of currAns
        subsequences2(remString,currAns); //bc, ""
    }
    static void sumOfSubset (int[] a,int n, int idx, int currSubsetSum) {
       if (idx >= n) {
           System.out.println(currSubsetSum);
           return;
       }
        sumOfSubset(a, n, idx + 1, currSubsetSum);//curr ans //exclude
        sumOfSubset(a, n, idx + 1, currSubsetSum + a[idx]);//curr idx + currSubsetSum //include
    }
   // Q1. Given the number of digits n in a number, print all n-digit numbers whose digits are strictly
   // increasing from left to right.
   public static void printNDigitNumber(int start, String out, int n) {
       if (n == 0) {
           System.out.print(out + " ");
           return;
       }
       for (int i = start; i <= 8; i++) {
           String str = out + i;
           printNDigitNumber(i + 1, str, n - 1);
       }
   }
   /*
   Q2. A string is called special if it consists of only stars(‘*’) and dashes(‘-’), and the number of stars is
   more than the number of dashes for any prefix of the string. Given a positive integer n, print all the
   special strings of size n.
    */
   static void printBinaryNumber (int remainingChars,String ans,int numberOfOnes, int numberOfZeroes) {
       if (remainingChars == 0) {
           System.out.println(ans);
           return;
       }
       printBinaryNumber(remainingChars - 1, ans + "1", numberOfOnes + 1, numberOfZeroes);
       if (numberOfZeroes + 1 <= numberOfOnes) {
           printBinaryNumber(remainingChars - 1, ans + "0", numberOfOnes,
                   numberOfZeroes + 1);
       }
   }
//    Q3. Given a set of characters and a positive integer k, print all possible strings of length k that can be formed
//    from the given set.
   public static void printStringsOfLengthK(Character[] chars, int remainingChars, String ans) {
        if (remainingChars == 0) {
        System.out.println(ans);
        return;
    }
        for (int i = 0; i < chars.length; i++) {
            printStringsOfLengthK(chars, remainingChars - 1, ans + chars[i]);
        }
   }

//    Q4. Given an input strinS of diSits, find all combinations of numbers that can be formed usinS diSits in the
//    same order.
    public static void printAllCombinations1(String nums, int idx, String ans) {
        if (idx == nums.length()) {
            System.out.println(ans);
            return;
        }
        printAllCombinations1(nums, idx + 1, ans + nums.charAt(idx));
        if (idx != nums.length() - 1)
            printAllCombinations1(nums, idx + 1, ans + nums.charAt(idx) + " ");
    }

//    Q5. A string is called special if it consists of only stars(‘*’) and dashes(‘-’), and there are no consecutive
//    stars in the string. Given a positive integer K, print all the special strings of size K.
    public static void printAllCombinations2(int remainingChars, String ans) {
       if (remainingChars == 0) {
        System.out.println(ans);
        return;
       }
        printAllCombinations2(remainingChars - 1, ans + "-");
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) == '-') {
            printAllCombinations2(remainingChars - 1, ans + "*");
        }
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String :( ");
//        String s1 = sc.nextLine();

//        ArrayList<String> ans = subSequences1(s1);
//        for (String ss :  ans) {
//            System.out.(ss);
//        }
//        subsequences2(s1,"");

//        int[] a = {2, 4, 5};
//        sumOfSubset(a, a.length, 0, 0);

//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
////        printNDigitNumber(0, " ", n);
//           printBinaryNumber(n,"",0,0);

//           System.out.println("Enter the number: ");
//           int n = sc.nextInt();
//           Character[] chars = new Character[n];
//           for (int i = 0; i < n; i++) {
//               chars[i] = sc.next().charAt(0);
//           }
//           int k = sc.nextInt();
//           printStringsOfLengthK(chars, k,"");

//           System.out.println("Enter the number: ");
//           String  n = sc.next();
//           printAllCombinations(n,0,"");

           System.out.println("Enter the number: ");
           int n = sc.nextInt();
           printAllCombinations2(n,"");
    }
}
