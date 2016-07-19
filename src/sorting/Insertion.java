package sorting;

/**
 * @author p.varchenko
 * @since 19.07.16
 */
public class Insertion extends Helper{

    // This class should not be instantiated.
    private Insertion() { }

    public static void sort(Comparable[] a){
        int n = a.length;
        for (int i = 0; i <n; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j --){
                exch(a, j, j-1);
            }
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    public static void main(String[] args) {
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        System.out.println("Before:");
        show(a);
        Insertion.sort(a);
        System.out.println("After:");
        show(a);
    }
}
