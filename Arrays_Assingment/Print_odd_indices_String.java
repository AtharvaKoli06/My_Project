package Arrays_Assingment;

public class Print_odd_indices_String {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static void odd_indices(String[] arr) {
        //odd numbers
//        for (int i = 0; i < n; i+=2) {
//            System.out.println(arr[i] + " ");
//        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {

        String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        odd_indices(arr);

    }
}
