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
        String alg2 = "Insertion";
        int N = 100000;
        int T = 3;
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.println("Для " + N + " случайных Doubles " + alg1 + " в " + t2/t1 + " раз быстрее, чем  " + alg2);
    }

}
