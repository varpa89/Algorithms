package sorting2;

import java.util.Arrays;

/**
 * Разделяем массив на две половины
 * Далее сливаем элементы: сначала берем меньший, затем больший
 * Нужно реализовать два метода: sort и merge
 * Sort вызывается рекурсивно
 *
 * @author Pavel S Varchenko
 * @since 02.05.2018
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] values = {10, 9, 1, 4, 6};

        sort(values, 0, values.length - 1);
        System.out.println(Arrays.toString(values));
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        // оперделяем размер временных массивов, создаем их и заполняем
        int s1 = m - l + 1;
        int s2 = r - m;

        int[] L = new int[s1];
        int[] R = new int[s2];

        for (int i = 0; i < s1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < s2; i++) {
            R[i] = arr[m + i + 1];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < s1 && j < s2) {
            if (L[i] <= R[i]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<s1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<s2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
