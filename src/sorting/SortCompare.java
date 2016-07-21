package sorting;

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
        int N = 500000;
        int T = 10;
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        double t3 = timeRandomInput(alg3, N, T);
        double t4 = timeRandomInput(alg4, N, T);
        System.out.println("Для " + N + " случайных Doubles " + alg1 + " " + t1);
        System.out.println("Для " + N + " случайных Doubles " + alg2 + " " + t2);
        System.out.println("Для " + N + " случайных Doubles " + alg3 + " " + t3);
        System.out.println("Для " + N + " случайных Doubles " + alg4 + " " + t4);
    }
}
