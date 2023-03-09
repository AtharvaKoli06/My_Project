package Recursion;

import java.util.Scanner;
public class recur_String_8 {
    //Without index to find occurrence
    static String removeAllOccurrence2 (String s) {
        if(s.length() == 0) return "";
        String smallAns = removeAllOccurrence2(s.substring(1));
        char currChar = s.charAt(0);
        //self work
        if(currChar != 'a') {
            return currChar + smallAns;
        }
        return smallAns;
    }
    //With index to find occurrence
    static String removeAllOccurrence1 (String s,int idx) {
        //Base Case
        if(idx == s.length()) return "";
        //recursive case
        String smallAns = removeAllOccurrence1(s,idx+1);
        char currChar = s.charAt(idx);
        //self work
        if(currChar != 'a') {
            return currChar + smallAns;
        }
        return smallAns;
    }
    //with index to reverse
    static String reverse1 (String a, int idx) {
        //Base Case
        if (idx == a.length()) return "";
//        recursive work
        String smallAns = reverse1(a,idx+1);
//        char currChar = a.charAt(idx);
        //Self work
        return smallAns + a.charAt(idx);
    }
    //without index to reverse
    static String reverse2 (String a) {
        if(a.length() == 0) return "";
        String smallAns = reverse2(a.substring(1));
        return smallAns + a.charAt(0);
    }
    static boolean reverse3 (String s, int l, int r) {
        //Base Case
        if(l >= r) return true;
        //Self work
        return (s.charAt(l) == s.charAt(r) && reverse3(s,l+1,r-1));
    }
//    Q1. Write a program to merge 2 strings alternately using recursion starting from the first input string.
    static String mergeTwoString (String s1,String s2) {
     String ans = "";
     if (s1.length() == 0) {
         ans += s2;
         return ans;
     }
        if (s2.length() == 0) {
            ans += s1;
            return ans;
        }
        ans += s1.substring(0,1);
        ans += s2.substring(0,1);
        ans += mergeTwoString(s1.substring(1), s2.substring(1));
        return ans;
    }
//    Given a string, find its first uppercase letter and return the remaining substring, starting from
//    the uppercase letter.
    static String firstUppercase (String s,int idx) {
        //base case
        if(idx == s.length()) return "";
        //self work
        if (Character.isUpperCase(s.charAt(idx))) return s.substring(idx);
        //recursive work
        return firstUppercase(s,idx + 1);

    }
//    Q3. Given a string` count total number of consonants in it. A consonant is an
//    English alphabet character that
    public static int totalConsonants(String str, int n) {
        if (n == 1) {
            if(isConsonant(str.charAt(0)))
                return 1;
            else
                return 0;
        }
        if(isConsonant(str.charAt(n - 1)))
            return totalConsonants(str, n - 1) + 1;
        else
            return totalConsonants(str, n - 1);
    }
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return false;
        }
        return true;
    }
    public static int lowerCaseNumber (String str, int idx) {
        if(idx == str.length()-1) {
            if(str.charAt(idx) >= 97 && str.charAt(idx) <= 122)
                return 1;
            else
                return 0;
        }
        if (str.charAt(idx) >= 97 && str.charAt(idx) <= 122)
            return lowerCaseNumber(str,idx+1) + 1;
        else
            return lowerCaseNumber(str,idx+1);
    }

//    Given a string, recursively implement atoi() or Integer.parseInt() method on it without actually using
//    the method.
    public static int rec(String str, int n) {
    if (n == 0) {
        return str.charAt(0) - '0';
    }
        return (rec(str, n - 1) * 10 + str.charAt(n) - '0');
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value :( ");
        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();

//        String s1 = "";

//        System.out.println(removeAllOccurrence1(s1, 0));
//        System.out.println(removeAllOccurrence2(s));
//        System.out.println(reverse1(s1,0));
//        System.out.println(reverse2(s));
//        for (int i = s.length()-1; i >= 0; i--) {
//            s1 = s1 + s.charAt(i);
//        }
//        String rev = reverse1(s,0);
//        if (rev.equals(s)) {
//            System.out.printf("%s is palindrome ", s);
//        }else {
//            System.out.printf("%s is Not palindrome ", s);
//        }
//        System.out.println(reverse3(s,0,s.length()-1));

//        System.out.println(mergeTwoString(s1,s2));

//        System.out.println(firstUppercase(s1,0));

//            System.out.println(totalConsonants(s1, s1.length()));

            System.out.println(lowerCaseNumber(s1,0));

//            System.out.println(rec(s1,s1.length()-1));
    }
}
