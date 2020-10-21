package by.it.siarheikorbut.jd02_01;

import java.util.Random;

public class Helper {

    private static final Random RANDOM = new Random();

    static int getRandom(int start, int stop) {
        return start + RANDOM.nextInt(stop - start + 1);
    }

    static int getRandom() {
        return getRandom(0, 5);
    }

    static void mySleep(int millis) {
        try {
            Thread.sleep(millis / Dispatcher.K_SPEED);
        } catch (InterruptedException e) {
            throw new RuntimeException("something not good", e);
        }
    }
}