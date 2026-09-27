import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 8, 3, 5, 6, 2, 3, 4, 6, 8, 9 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            arr[min] = arr[min] + arr[i] - (arr[i] = arr[min]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
