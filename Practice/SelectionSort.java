import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 5, 3, 2, 1, 4, 6, 8, 9, 5, 3, 2, 4, 7, 5 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
