package playback;

/**
 * @author p.varchenko
 */
public class Selection extends Helper {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = 0; j < a.length -1; j++){
                if (less(min, a[j])) {
                    min = j;
                }
            }
            change(a, i, min);
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
