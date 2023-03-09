package Arrays_Assingment;
import java.util.*;
import java.util.Scanner;

public class duplicates_Elements {
    public static int removeDuplicates(int[] nums) {
    int j=0;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            nums[j+1]=nums[i];
            j++;
        }
    }
    return j+1;
}
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; i + j < haystack.length() && j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if (j == needle.length()-1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    public static int divide(int A, int B) {
        if (A == 1 << 31 && B == -1)
            return (1 << 31) - 1;
        int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++);
            res += 1 << x;
            a -= b << x;
        }
        return (A > 0) == (B > 0) ? res : -res;
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        final Map<String, Integer> counts = new HashMap<>();
        for (final String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        final List<Integer> indexes = new ArrayList<>();
        final int n = s.length(), num = words.length, len = words[0].length();
        for (int i = 0; i < n - num * len + 1; i++) {
            final Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                final String word = s.substring(i + j * len, i + (j + 1) * len);
                if (counts.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > counts.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j == num) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] nums = {3,2,3,2};
//        int[] nums = {0,4,4,4,4,2};
//        System.out.println(removeDuplicates(nums));
//        System.out.println(removeElement(nums,4));

        // Find the Index of the First Occurrence in a String
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        System.out.println(strStr(s1,s2));

//        Divide Two Integers
//        System.out.println(divide(10,3));

//        Substring with Concatenation of All Words
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo","bar"};
        System.out.println(findSubstring(s,words));
    }

}
