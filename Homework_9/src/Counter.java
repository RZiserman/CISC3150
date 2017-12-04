//Author: Roman Ziserman

/**
 * This class is for comparing the currently running thread's priority to maintain proper order
 */

public class Counter {
    static int counter = 1;

    public synchronized static void incrementCounter(){
        Counter.counter++;
    }
}
