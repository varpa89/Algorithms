package sorting2;

import java.util.Arrays;

/**
 * @author Pavel S Varchenko
 * @since 30.04.2018
 */
public class BubbleSort {
    private static final int[] values = {14, 2, 123, 345, 3, 1, 0, 5, 0};

    public static void main(String[] args) {
        for (int j = 0; j < values.length - 1; j++) {
            for (int i = 0; i < values.length - j - 1; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
                System.out.println(Arrays.toString(values));
            }
        }

        ///System.out.println(Arrays.toString(values));
    }
}
