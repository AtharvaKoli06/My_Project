import java.util.Arrays;

public class Immutable_string_problem {
    static void Anagram (String str1,String str2) {
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Given String is Anagram :)");
        }else {
            System.out.println("Given String is Anagram :)");
        }

//        if (arr1 == arr2) {
//            System.out.println("Given String is Anagram :)");
//        }else {
//            System.out.println("Given String is Not Anagram :)");
//        }
    }
    static void pangram (String str) {
        boolean flag=false;
        str=str.replace(" ", "");
        char []ch=str.toCharArray();

        int[] ar=new int[26];

        for(int i=0;i<ch.length;i++)
        {
            ar[ch[i]-65]++;
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("Its not pangram");
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println("Its pangram");
        }
    }
    static void palindrome (String str1,String str2) {
        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }

        System.out.println(str1);
        System.out.println("After reverse String is :) \n" + str2);

        if(str1.equals(str2)) {
            System.out.println("Given String is a palindrome :)");
        }else {
            System.out.println("Given String is not a palindrome :)");
        }

    }

    public static void main(String[] args) {
        String str1 = "School Master";
        String str2 = "";


        for (int i = str1.length()-1; i >= 0; i--){
            str2 = str2 + str1.charAt(i);
        }
//        System.out.println("Before reverse String is :) \n" + str1);
        System.out.println("After reverse String is :) \n" + str2);

        System.out.println();

        String[] arr = str1.split(" ");

        for (int i = arr.length-1; i >= 0; i--) {
            str2 = str2 + arr[i] + " ";
        }
//        System.out.println("Before reverse String is :) \n" + str1);
        System.out.println("After reverse String is :) \n" + str2);

        System.out.println();

        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
//        System.out.println("Before reverse String is :) \n" + str1);
        System.out.println("After reverse String is :) \n" + str2);

        System.out.println();

        String[] arr1 = str1.split(" ");

        for (String element : arr1) {
            for (int i = element.length()-1; i >= 0; i--) {
                str2 = str2 + element.charAt(i);
            }
            str2=str2 + " ";
        }
//        System.out.println("Before reverse String is :) \n" + str1);
        System.out.println("After reverse String is :) \n" + str2);

        System.out.println();

        System.out.println("Palindrome");
        //Palindrome
        String str6 = "MADAM";
        String str7 = "";
        palindrome(str6,str7);

        System.out.println();
        System.out.println("Anagram");
        //Anagram
        String str3="School Master";
         String str4="The Classroom";
        Anagram(str3,str4);

        System.out.println();
        System.out.println("Pangram");
        //Pangram
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        pangram(str);
        




    }
}
