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
    }

    private static void selection(int[] values) {

        for (int j = 0; j < values.length; j++) {
            int minId = j;
            for (int i = j; i < values.length; i++) {
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
}