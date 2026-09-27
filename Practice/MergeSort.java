import java.util.Arrays;

public class MergeSort {
    public static void ms(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        ms(left);
        ms(right);
        sort(left, right, arr);
    }

    public static void sort(int[] left, int[] right, int[] arr) {
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
        int[] arr = { 3, 5, 7, 9, 5, 3, 2, 1, 4, 6, 8, 9, 5, 3, 2, 4, 7, 5 };

        ms(arr);

        System.out.println(Arrays.toString(arr));

    }
}
