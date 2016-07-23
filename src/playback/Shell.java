package playback;

/**
 * @author p.varchenko
 */
public class Shell extends Helper{
    public static void sort(Comparable[] a) {
        int n = a.length;
        int step = n/3;
        while (step >= 1){
            for(int i = step; i < n; i++){
                for (int j = i; j >=step && less(a[j], a[j-step]); j -=step){
                    change(a, j, j-step);
                }
            }
            step = step/3;
        }
    }

    public static void main(String[] args) {
        String[] a = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        //Integer[] a = {5, 3, 6, 8, 9, 3, 4, 2, 5, 0};
        System.out.println("Before:");
        show(a);
        Shell.sort(a);
        System.out.println("After:");
        show(a);
    }
}
