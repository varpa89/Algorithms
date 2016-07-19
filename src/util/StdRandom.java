package util;

import java.util.Random;

/**
 * @author p.varchenko
 * @since 19.07.16
 */
public class StdRandom {
    private static Random random;    // pseudo-random number generator
    private static long seed;        // pseudo-random number generator seed

    // static initializer
    static {
        // this is how the seed was set in Java 1.4
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    // don't instantiate
    private StdRandom() { }

    public static double uniform() {
        return random.nextDouble();
    }
}
