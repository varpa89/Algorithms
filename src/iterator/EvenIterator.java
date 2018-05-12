package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Pavel S Varchenko
 * @since 12.05.2018
 */
public class EvenIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private boolean hasNextCalled;
    private Integer next;
    private boolean hasNextValue;

    EvenIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        boolean hasNext = false;
        if (hasNextCalled) {
            hasNext = hasNextValue;
        } else {
            hasNextCalled = true;
            while (hasNext = iterator.hasNext()) {
                Integer next = iterator.next();
                if (next != null && next % 2 == 0) {
                    this.next = next;
                    break;
                }
            }
            hasNextValue = hasNext;
        }
        return hasNext;
    }

    @Override
    public Integer next() {
        Integer returnValue = null;
        if (hasNextCalled) {
            hasNextCalled = false;
            returnValue = next;

            if (returnValue == null) {
                throw new NoSuchElementException();
            }

        } else {
            while (iterator.hasNext()) {
                returnValue = iterator.next();
                if (returnValue != null && returnValue % 2 == 0) {
                    break;
                }
            }
            if (returnValue == null) {
                throw new NoSuchElementException();
            }
        }
        return returnValue;

    }
}
