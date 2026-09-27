import java.util.*;

public class mergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 8, 4, 3, 5, 7, 9, 5, 3, 2, 1 };

        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
