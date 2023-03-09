package Arrays_Assingment;

public class Mini_element {

    static int mini_value(int[] arr) {
       int n = arr.length;
       int min = arr[0];
        for (int i = 0; i < n; i++) {
           if(arr[i] < min) {
               min = arr[i];
           }
        }
        return min;
    }
    public static void main(String[] args) {
//2, -3, 5, 8, 1, 0, -4

        int[] arr = {2, -3, 5, 8, 1, 0, -4};

        System.out.println(mini_value(arr));



    }
}
