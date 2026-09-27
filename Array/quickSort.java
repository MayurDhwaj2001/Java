import java.lang.reflect.Array;
import java.util.Arrays;

public class quickSort {
    public static void quickSort(int[] arr, int beg, int end) {
        if (beg > end) {
            return;
        }
        int i = beg;
        int j = end;
        int pivot = (i + j) / 2;

        if (i < j) {
            while (arr[i] < arr[pivot]) {
                i++;
            }
            while (arr[j] > arr[pivot]) {
                j--;
            }
        }
        if (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        quickSort(arr, i, end);
        quickSort(arr, beg, j);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 7, 8, 9, 2, 3, 4, 6, 4, 2, 5, 7, 8, 2, 1 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
