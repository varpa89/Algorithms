package random;

import java.util.Objects;
import java.util.Random;

/**
 * @author p.varchenko
 */
public class Chance {
    private static int rand2() {
        int Low = 0;
        int High = 2;

        Random rnd = new Random();
        return rnd.nextInt(High - Low) + Low;
    }

    private static int rand3() {
        String seq = String.valueOf(rand2()) + String.valueOf(rand2());
        if (Objects.equals(seq, "00")) {
            return 0;
        } else if (Objects.equals(seq, "01")) {
            return 1;
        } else if (Objects.equals(seq, "11")) {
            return 2;
        } else {
            return rand3();
        }
    }

    public static void main(String[] args) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int other = 0;
        for (int i = 0; i < 10000; i++) {
            int value = rand3();
            if (value == 0) {
                zero++;
            } else if (value == 1) {
                one++;
            } else if (value == 2) {
                two++;
            } else {
                other++;
            }
        }
        System.out.println("Zero: " + zero);
        System.out.println("One: " + one);
        System.out.println("Two: " + two);
        System.out.println("Other: " + other);
    }
}
