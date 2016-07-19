package util;

/**
 * @author p.varchenko
 * @since 19.07.16
 */
public class Stopwatch {
    private final long start;

    public Stopwatch(){
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
