package Arrayss;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_Problems {
    static void reverse_ArrayList (ArrayList<Integer> list) {
        int i = 0, j= list.size()-1;

        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(2);
        list.add(7);

//        System.out.println("Original Arraylist :) \n" + list);
//        reverse_ArrayList(list);
//        Collections.reverse(list);
//        System.out.println("Reversed Arraylist :) \n" + list);
//        Collections.sort(list);
//        System.out.println("Ascending Order :) \n" + list);
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println("Descending Order :) \n" + list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Atharva :)");
        list1.add("Yadnesh :)");
        list1.add("Vivek :)");
        list1.add("Karan :)");
        list1.add("Vighnesh :)");
        list1.add("Sanket :)");

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println("Sorted :) \n" + list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("reverseOrder :) \n" + list1);


    }
}
