import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 5, 3, 2, 1, 4, 6, 8, 9, 5, 3, 2, 4, 7, 5 };

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));

    }
}
