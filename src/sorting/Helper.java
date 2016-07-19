package sorting;

import java.util.Comparator;

/**
 * @author p.varchenko
 * @since 19.07.16
 */
public abstract class Helper {

    /**
     * Helper sorting functions
     */

    // is v < w?
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // is v < w?
    protected static boolean less(Comparator comparator, Object v, Object w) {
        return comparator.compare(v, w) < 0;
    }

    // exchange a[i] and a[j]
    protected static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * Check if array is sorted - useful for debugging
     */

    // is the array a[] sorted?
    protected static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    // is the array sorted from a[lo] to a[hi]
    protected static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    // is the array a[] sorted?
    protected static boolean isSorted(Object[] a, Comparator comparator) {
        return isSorted(a, comparator, 0, a.length - 1);
    }

    // is the array sorted from a[lo] to a[hi]
    protected static boolean isSorted(Object[] a, Comparator comparator, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(comparator, a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    //print array to standard output
    protected static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
        System.out.println();
    }
}
