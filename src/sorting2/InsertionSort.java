package sorting2;

import java.util.Arrays;

/**
 * Смысл в том, чтобы держать отсортированными подмассивы
 * Начинаем с массива из одного эелемента. Он отсортирован
 * Далее массив из двух. Если второй меньше берем его в переменную, первый сдвигаем на место второго
 * Далее массив из трех. Смотрим где третий элемент. Берем его в переменную и двигаем те, что левее
 * И так далее
 *
 * @author Pavel S Varchenko
 * @since 01.05.2018
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] values = {1, 5, 3, 1, 3, 6, 7, 8, 20};
        for (int i = 1; i < values.length ; i++) {
            int curVal = values[i];
            int j = i -1;
            while (j >= 0 && curVal < values[j]){
                values[j+1] = values[j];
                j--;
            }
            values[j+1] = curVal;

        }
        System.out.println(Arrays.toString(values));
    }

}
