package iterator;

import java.util.Iterator;

/**
 * @author Pavel S Varchenko
 * @since 12.05.2018
 */
public class EvenIterator2 implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer nextItem;

    public EvenIterator2(Iterator<Integer> iterator) {
        this.iterator = iterator;
        setNextItem();
    }

    @Override
    public boolean hasNext() {
        return nextItem != null;
    }

    @Override
    public Integer next() {
        Integer next = nextItem;
        setNextItem();
        return next;
    }

    private void setNextItem() {
        while (iterator.hasNext()) {
            nextItem = iterator.next();
            if (nextItem % 2 == 0) {
                return;
            }
        }
        nextItem = null;
    }
}
