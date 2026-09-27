import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 4, 2, 4, 6, 6, 4, 3, 2 };

        for (int i = 1; i < arr.length; i++) {
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
