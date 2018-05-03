package sorting2;

import java.util.Arrays;

/**
 * Необходимо выбрать элемент и слева расположить элементы, которые меньше,
 * а справа - которые больше
 * Далее повторяем рекурсивно для левой и правой половины
 * Реализуем два метода: partition, sort
 *
 * @author Pavel S Varchenko
 * @since 02.05.2018
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] values = {0, 12, 11, 13, 6, 5, 7};

        sort(values, 0, values.length - 1);
        System.out.println(Arrays.toString(values));
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        return i + 1;
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr,l,r);

            sort(arr, l, pi-1);
            sort(arr, pi+1, r);
        }
    }
}
