package sorting2;

import java.util.Arrays;

/**
 * Идем по массиву и определяем минимальный элемент
 * Ставим его на первое место, а элемент с первого места на его предыдущее место
 * Далее сокращаем размер массива
 * Повторяем поиск минимального элемента в подмассиве
 * Таким образом массив постепенно сортируется от начала к концу
 *
 * @author Pavel S Varchenko
 * @since 01.05.2018
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] values = {10, 9, 8, 7, 6, 5, 4, 3, 2, 0, 1};

        for (int j = 0; j < values.length; j++) {
            int minId = j;
            for (int i = j + 1; i < values.length; i++) {
                if (values[i] < values[minId]) {
                    minId = i;
                }
            }

            int temp = values[minId];
            values[minId] = values[j];
            values[j] = temp;
        }


        System.out.println(Arrays.toString(values));
    }
}
