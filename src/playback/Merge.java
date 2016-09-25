package playback;

/**
 * @author p.varchenko
 */
public class Merge extends Helper {

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if(j > hi){
                a[k] = aux[i++];
            }else if(less(aux[j], aux[i])){
              a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
        show(aux);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        int n = a.length;
        sort(a, aux, 0, n - 1);
    }

    public static void main(String[] args) {
        //String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        Integer[] a = {5, 3, 6, 8, 9, 3, 4, 2, 5, 0, 4, 2, 5};
        System.out.println("Before:");
        show(a);
        Merge.sort(a);
        System.out.println("After:");
        show(a);
    }
}
