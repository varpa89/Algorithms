package sorting2;

import java.util.Arrays;

/**
 * @author Pavel S Varchenko
 * @since 01.05.2018
 */
public class Train {

    public static void main(String[] args) {
        int[] values = {31, 5, 53, 1, 3, 6, 7, 8, 20};
        bubble(values.clone());
        insertion(values.clone());
        selection(values.clone());
        mergeSort(values.clone());
    }

    private static void selection(int[] values) {

        for (int j = 0; j < values.length; j++) {
            int min = j;
            for (int i = j + 1; i < values.length; i++) {
                if (values[i] < values[min]) {
                    min = i;
                }
            }
            int temp = values[min];
            values[min] = values[j];
            values[j] = temp;
        }

        System.out.println(Arrays.toString(values));
    }

    private static void insertion(int[] values) {

        for (int i = 1; i < values.length; i++) {
            int curVal = values[i];
            int j = i - 1;
            while (j >= 0 && curVal < values[j]) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = curVal;
        }

        System.out.println(Arrays.toString(values));
    }

    private static void bubble(int[] values) {
        for (int j = 0; j < values.length; j++) {
            for (int i = 0; i < values.length - j - 1; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(values));
    }

    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int s1 = m - l + 1;
        int s2 = r - m;

        int[] L = new int[s1];
        int[] R = new int[s2];

        for (int i = 0; i < s1; i++) {
            L[i] = arr[i + l];
        }

        for (int i = 0; i < s2; i++) {
            R[i] = arr[i + m + 1];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < s1 && j < s2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < s1) {
            arr[k] = L[i];
            k++;
            i++;
        }
        while (j < s2) {
            arr[k] = R[j];
            k++;
            j++;
        }
    }
}
