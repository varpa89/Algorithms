package sorting2;

import java.util.Arrays;

/**
 * Сначала сравниваем соседние элементы попарно
 * Больший элемент переносим влево, меньший вправо
 * Таким образом после первого прохода самый большой элемент булет справа
 * Далее повторяем проходы, но уже нет необходимости идти до конца.
 * После каждой итерации можно доходить только до n - i элемента
 *
 * Оптимизация: проверить, что массив уже отсортирован, можно, если не было перестановок. Тогда заканчиваем сортировку
 *
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
