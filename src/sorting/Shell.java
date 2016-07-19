package sorting;

/**
 * @author p.varchenko
 * @since 19.07.16
 */
public class Shell extends Helper{
    private Shell() { }

    public static void sort(Comparable[] a){
        int n = a.length;
        int h = 1;
        while (h < n/3){
            h = 3*h + 1;
        }

        while (h >= 1) {
         for (int i = h; i < n; i++){
             for (int j = i; j >=h && less(a[j], a[j-h]); j -=h){
                 exch(a, j, j-h);
             }
         }
            assert isHsorted(a, h);
            h /=3;
        }
        assert  isSorted(a);
    }

    private static boolean isHsorted(Comparable[] a, int h) {
        for (int i = h; i < a.length; i++)
            if (less(a[i], a[i-h])) return false;
        return true;
    }

    public static void main(String[] args) {
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        System.out.println("Before:");
        show(a);
        Shell.sort(a);
        System.out.println("After:");
        show(a);
    }
}
