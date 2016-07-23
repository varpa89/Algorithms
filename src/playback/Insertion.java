package playback;

/**
 * @author p.varchenko
 */
public class Insertion extends Helper {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                change(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        //Integer[] a = {5, 3, 6, 8, 9, 3, 4, 2, 5, 0};
        System.out.println("Before:");
        show(a);
        Insertion.sort(a);
        System.out.println("After:");
        show(a);
    }
}
