import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 6, 3, 5, 7, 8, 9, 6, 3, 2, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1] + arr[j] - (arr[j + 1] = arr[j]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
