package playback;

/**
 * @author p.varchenko
 */
public class Selection extends Helper {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i+1; j < a.length; j++){
                if (less(a[j], a[min])) {
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
        Selection.sort(a);
        System.out.println("After:");
        show(a);
    }
}
