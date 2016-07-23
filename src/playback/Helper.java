package playback;

/**
 * @author p.varchenko
 */
abstract class Helper {
    static void show(Comparable[] a) {
        for (Comparable anA : a) {
            System.out.print(anA);
        }
        System.out.println();
    }

    static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    static void change(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
