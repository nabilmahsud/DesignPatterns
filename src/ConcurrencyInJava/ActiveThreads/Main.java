package ConcurrencyInJava.ActiveThreads;

public class Main {
    public static void main(String[] args) {
        // Will display 2 threads, one is the main thread and another
        // is background thread for running the garbage collector
        System.out.println(Thread.activeCount());
        // The number of threads my CPU can run - 4 threads because my CPU has 2 cores.
        System.out.println(Runtime.getRuntime().availableProcessors());
        // Sharing data safely between threads is an important aspect of concurrent programming.
    }
}
