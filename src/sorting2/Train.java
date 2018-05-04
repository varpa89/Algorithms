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
        quickSort(values.clone());
    }

    private static void selection(int[] values) {
        for (int j = 0; j < values.length; j++) {
            int minIdx = j;
            for (int i = j; i < values.length; i++) {
                if (values[minIdx] > values[i]) {
                    minIdx = i;
                }
            }
            int temp = values[j];
            values[j] = values[minIdx];
            values[minIdx] = temp;
        }

        System.out.println(Arrays.toString(values));
    }

    private static void insertion(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int curEl = values[i];
            int j = i - 1;
            while (j >= 0 && curEl < values[j]) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = curEl;
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
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int s1 = m - l + 1;
        int s2 = r - m;

        int L[] = new int[s1];
        int R[] = new int[s2];

        for (int i = 0; i < s1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < s2; i++) {
            R[i] = arr[m + i + 1];
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
            i++;
            k++;
        }

        while (j < s2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr, int l, int r) {
        int pi = arr[r];
        int i = l-1;
        for (int j = l; j < r; j++) {
            if(arr[j] <= pi){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

}
