package playback;

import java.util.Objects;

/**
 * Created by pavel on 15.08.2016.
 */
public class Heap {

    protected static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

    private static void sink(Comparable[] pq, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(pq, j, j + 1)) {
                j++;
            }
            if (!less(pq, k, j)) {
                break;
            }

            exch(pq, k, j);
            k = j;
        }
    }

    private static void sort(Comparable[] pq) {
        int n = pq.length;
        for (int k = n / 2; k >= 1; k--) {
            sink(pq, k, n);
        }
        while (n > 1){
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }

    public static void main(String[] args) {
        //String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Integer[] a = {4, 8, 3, 9, 1, 6, 7};
        System.out.println("Before:");
        show(a);
        System.out.println("After:");
        sort(a);
        show(a);
    }
}
