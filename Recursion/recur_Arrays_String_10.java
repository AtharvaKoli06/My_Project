package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class oddAndEvenString {
    public void printCombinationsOdd(ArrayList<String> nums) {
        for (String num1 : nums) {
            for (String num2 : nums) {
                System.out.println(num1 + "*" + num2);
                System.out.println(num1 + "-" + num2);
            }
        }
    }
    public void printCombinationsEven(ArrayList<String> nums) {
        for (String num1 : nums) {
            for (String num2 : nums) {
                System.out.println(num1 + num2);
            }
        }
    }
    public void generateStrings(int remainingBits, ArrayList<ArrayList<String>> nums, int numberOfStars, String curr) {
        if (remainingBits == 0) {
            nums.get(numberOfStars).add(curr);
            return;
        }
        generateStrings(remainingBits - 1, nums, numberOfStars + 1, curr + "*");
        generateStrings(remainingBits - 1, nums, numberOfStars, curr + "-");
    }
}
public class recur_Arrays_String_10 {
    static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int best(int[] h, int n , int idx) {
        if (idx == n-1) return 0;
        int op1 = best(h,n,idx+1) + Math.abs(h[idx+1] - h[idx]);

        if (idx == n-2) return op1;
        int op2 = best(h,n,idx+2) + Math.abs(h[idx+2] - h[idx]) ;

        return Math.min(op1,op2);
    }
    static void combination (String dig,String result, String[] kp) {
        if (dig.length() == 0) {
            System.out.print(result + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0'; //2
        String currChoice = kp[currNum]; // "abc"

        for (int i = 0; i < currChoice.length(); i++) {
            combination(dig.substring(1), result + currChoice.charAt(i), kp);
        }
    }
//    Q1 - You are given a string. Your task is to divide the string into palindromic substrings. Print all such
//    partitions.
    static void printAllPalindromicPartitions (String s, ArrayList<String> ans, int start) {
        //Base case
        if (start == s.length()){
            System.out.println(ans);
            return;
    }
        String curr = "";
        for (int end = start; end < s.length(); end++) {
            curr += s.charAt(end);
            if (isPalindrome(curr)) {
                ans.add(curr);
                printAllPalindromicPartitions(s, ans, end + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

// Q2 - A string is called beautiful if is an even length string consisting of only stars(‘*’) and dashes(‘-’). Further
// the number of stars in the first half of the string should be equal to the number of stars in the second half of
// the string. Given a number n, print all the beautiful strings of length 2 * n.
    public static void printCombinations(ArrayList<String> nums) {
        for (String num1 : nums) {
            for (String num2 : nums) {
                System.out.println(num1 + num2);
            }
        }
    }
    public static void generateStrings(int remainingChars,ArrayList<ArrayList<String>> nums,int numberOfStars,String curr)
    {
        if (remainingChars == 0) {
            nums.get(numberOfStars).add(curr);
            return;
        }
        generateStrings(remainingChars - 1, nums, numberOfStars + 1, curr + "*");
        generateStrings(remainingChars - 1, nums, numberOfStars, curr + "-");
    }
//    Q4 - Problem Count the number of substrings having same first and last characters
public static int count(String s, int i, int j, int n) {
    // base cases
    if (n == 1) return 1;
    if (n <= 0) return 0;
    int ans = count(s, i + 1, j, n - 1) + count(s, i, j - 1, n - 1) - count(s, i + 1, j - 1, n - 2);
    if (s.charAt(i) == s.charAt(j)) ans++;
    return ans;
}
//    Q5 - You are given a string s. All the characters in s are distinct. Your task is to generate all the strings that
//    contain the characters of ‘s’ in increasing order.
    public static void generateSubstrings(String str, int n, int index, String curr) {
        if (index == n) {
            return;
        }
        System.out.println(curr);
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            generateSubstrings(str, n, i, curr);
            curr = curr.substring(0, curr.length() - 1);
        }
        return;
    }
    public static String sort(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size :( ");
//        int n = sc.nextInt();
//        int[] stone = {10, 20, 30, 40};
//        for (int i = 0; i < n; i++) {
//            stone[i] = sc.nextInt();
//        }
//        printArray(stone);
//        System.out.println("\nThe minimum cost is :( " + best(stone,stone.length,0));

//        String s = "79";
//        String[] kp = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        //              0  1    2     3      4     5    6     7      8     9
//        combination(s,"", kp);

//        String s = sc.next();
//        ArrayList<String> ans = new ArrayList<>();
//        printAllPalindromicPartitions(s, ans, 0);


//        int n = sc.nextInt();
//        ArrayList<ArrayList<String>> nums = new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            nums.add(new ArrayList<>());
//        }
//        generateStrings(n, nums, 0, "");
//        for (int s = 0; s <= n; s++) {
//            printCombinations(nums.get(s));
//        }
//Q3 - A string is called beautiful if it consists of only stars(‘*’) and dashes(‘-’). Further the number of stars in
//the first half of the string should be equal to the number of stars in the second half of the string. Given a number n,
// print all the beautiful strings of length n. If the value of n is odd, the middle value can be either '*' or '-'
//        oddAndEvenString obj = new oddAndEvenString();
//        int n = sc.nextInt();
//        ArrayList<ArrayList<String>> nums = new ArrayList<ArrayList<String>>();
//        for (int i = 0; i <= n; i++) {
//            nums.add(new ArrayList<String>());
//        }
//       obj.generateStrings(n / 2, nums, 0, "");
//        if (n % 2 == 1)
//            for (int s = 0; s <= n; s++)
//                obj.printCombinationsOdd(nums.get(s));
//        else
//            for (int s = 0; s <= n; s++)
//                obj.printCombinationsEven(nums.get(s));

//        Q4 - Problem Count the number of substrings having same first and last characters
//        String s = sc.next();
//        int n = s.length();
//        System.out.println(count(s, 0, n - 1, n));

//        Q5 - You are given a string s. All the characters in s are distinct. Your task is to generate all the strings that
//        contain the characters of ‘s’ in increasing order.
        String s = sc.next();
        s = sort(s);
        generateSubstrings(s, s.length(), -1, "");

    }
}
