package Sorting_Algorithm.SortingQuestion;

public class posNeg {
    static void posNegNumPartition(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] < 0) l++; //considered as negative num
            while (arr[r] > 0) r--; //considered as positive num
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }

    }
    static void display(int[] arr) {
        for (int val :arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] num = {-13, 20, 7, 0, -4, -13, 11, -5, -13};
        System.out.println("Before SortArr");
        display(num);
        posNegNumPartition(num);
        System.out.println("\nAfter sortArr :(");
        display(num);
    }
}
