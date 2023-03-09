package Arrayss;
import java.util.ArrayList;
public class Array_List {
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

//        Integer i = Integer.valueOf(5);
//        System.out.println(i);

        //Creating ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
//        System.out.println(l1.get(1));
//
//        System.out.println("Printing with for Loop....!");

        //print with for Loop
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.print(l1.get(i) + " ");
//        }

//        System.out.println("\nPrinting arrayList directly");
        //Printing the array list directly
//        System.out.println(l1);

//        System.out.println("adding element at some index i..!");
        //adding element at some index i
        l1.add(1, 100);
        System.out.println(l1);

        System.out.println("Modifying element at index i..!");
        //Modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

        System.out.println("removing an element at index i..!");
        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        System.out.println("removing an element e...!");
        //removing an element e
        System.out.println(l1.remove(Integer.valueOf(71)));
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        System.out.println("Checking if an element exist..!");
        //Checking if an element exist..!
        boolean ans = l1.contains(Integer.valueOf(61));
        System.out.println(ans);

        System.out.println("If you don't specify class, you can put anything inside..!");
//        If you don't specify class, you can put anything inside..!
        ArrayList l = new ArrayList();
        l.add("Atharva");
        l.add(6);
        l.add(true);
        System.out.println(l);

        System.out.println("IndexOf Method for ArrayList..:) ");
        //IndexOf Method for ArrayList
        l1.indexOf(Integer.valueOf(7));
    }

}
