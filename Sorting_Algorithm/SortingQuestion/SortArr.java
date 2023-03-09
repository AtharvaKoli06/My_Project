package Sorting_Algorithm.SortingQuestion;
public class SortArr {
    static void display(int[] arr) {
        for (int val :arr) {
            System.out.print(val + " ");
        }
    }
    static void sortArr(int[] arr) {
        int n = arr.length,x = -1, y = -1;
        if (n <= 1) { //handling corner cases, edge case
            System.out.print("Exception occur With elements in the array :(");
            return;
        }
        //process All adjacent elements
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                if (x == -1) {//first Conflict
                   x = i-1;//updating the value
                   y = i; //updating the value
                }else {//2nd conflict
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] num = {10,5,6,7,8,9,3};
        System.out.println("Before SortArr");
        display(num);
        sortArr(num);
        System.out.println("\nAfter sortArr :(");
        display(num);
    }
}
