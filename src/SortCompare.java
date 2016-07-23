import playback.*;
import sorting.*;
import sorting.Insertion;
import sorting.Selection;
import sorting.Shell;
import util.StdRandom;
import util.Stopwatch;

/**
 * @author p.varchenko
 * @since 19.07.16
 */
public class SortCompare {

    public static double time(String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        if(alg.equals("Insertion")){
            Insertion.sort(a);
        }
        if(alg.equals("Shell")){
            Shell.sort(a);
        }
        if(alg.equals("Merge")){
            Merge.sort(a);
        }
        if(alg.equals("Quick")){
            Quick.sort(a);
        }
        if(alg.equals("Heap")){
            Heap.sort(a);
        }

        if (alg.equals("Selection2")) {
            playback.Selection.sort(a);
        }
        if(alg.equals("Insertion2")){
            playback.Insertion.sort(a);
        }
        if(alg.equals("Shell2")){
            playback.Shell.sort(a);
        }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t<T; t++){
            for (int i = 0; i < N; i++){
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = "Shell";
        String alg2 = "Merge";
        String alg3 = "Quick";
        String alg4 = "Heap";
        String alg5 = "Insertion";
        String alg6 = "Insertion2";
        String alg7 = "Selection";
        String alg8 = "Selection2";
        String alg9 = "Shell";
        String alg10 = "Shell2";
        int N = 500000;
        int T = 3;
        //double t1 = timeRandomInput(alg1, N, T);
        //double t2 = timeRandomInput(alg2, N, T);
        //double t3 = timeRandomInput(alg3, N, T);
        //double t4 = timeRandomInput(alg4, N, T);
        //double t5 = timeRandomInput(alg5, N, T);
        //double t6 = timeRandomInput(alg6, N, T);
        //double t7 = timeRandomInput(alg7, N, T);
        //double t8 = timeRandomInput(alg8, N, T);
        double t9 = timeRandomInput(alg9, N, T);
        double t10 = timeRandomInput(alg10, N, T);
        //System.out.println("Для " + N + " случайных Doubles " + alg1 + " " + t1);
        //System.out.println("Для " + N + " случайных Doubles " + alg2 + " " + t2);
        //System.out.println("Для " + N + " случайных Doubles " + alg3 + " " + t3);
        //System.out.println("Для " + N + " случайных Doubles " + alg4 + " " + t4);
        //System.out.println("Для " + N + " случайных Doubles " + alg5 + " " + t5);
        //System.out.println("Для " + N + " случайных Doubles " + alg5 + " " + t5);
        //System.out.println("Для " + N + " случайных Doubles " + alg7 + " " + t7);
        //System.out.println("Для " + N + " случайных Doubles " + alg8 + " " + t8);
        System.out.println("Для " + N + " случайных Doubles " + alg9 + " " + t9);
        System.out.println("Для " + N + " случайных Doubles " + alg10 + " " + t10);
    }
}
