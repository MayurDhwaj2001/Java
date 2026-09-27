import java.util.Arrays;

public class QuickSort {
    public static void qs(int[] arr, int beg, int end) {
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
        qs(arr, i, end);
        qs(arr, beg, j);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 5, 3, 2, 1, 4, 6, 8, 9, 5, 3, 2, 4, 7, 5 };

        qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
