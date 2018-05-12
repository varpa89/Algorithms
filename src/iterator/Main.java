package iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pavel S Varchenko
 * @since 12.05.2018
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        EvenIterator iterator = new EvenIterator(integers.iterator());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
