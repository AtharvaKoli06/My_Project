package Sorting_Algorithm.SortingQuestion;

public class zeroOneTwo {
    static void display(int[] arr) {
        for (int val :arr) {
            System.out.print(val + " ");
        }
    }
    static void swap(int[] arr,int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
    }
//    2nd approach
    static void sort012(int[]num) {
        int count_0 = 0,count_1 = 0,count_2 = 0;
        for (int j :num) {
            if (j == 0) {
                count_0++;
            } else if (j == 1) {
                count_1++;
            }else {
                count_2++;
            }
        }
        int k = 0;
        while (count_0 > 0) {
            num[k++] = 0;
            count_0--;
        }
        while (count_1 > 0) {
            num[k++] = 1;
            count_1--;
        }
        while (count_2 > 0) {
            num[k++] = 2;
            count_2--;
        }
    }
    static void sort_012 (int[] num) {
       int low = 0,mid = 0,high = num.length-1;
       while (mid <= high) {
            if (num[mid] == 0) {
                swap(num,mid,low);
                mid++;
                low++;
            }
            else if (num[mid] == 1) {
                mid++;
            }
            else if(num[mid] == 2){
                swap(num,mid,high);
                high--;
            }
       }
    }
    public static void main(String[] args) {
        int[] num = {2,1,1,2,2,0,0,1,2,1,1,0,2,2,0,1,0};
        System.out.println("Before SortArr");
        display(num);
//       sort012(num);
        sort_012(num);
        System.out.println("\nAfter sortArr :(");
        display(num);

    }
}
