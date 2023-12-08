package ConcurrencyInJava.ThreadsBasics;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // The following threads will run in parallel.
        // So uploading these files in a single thread would take a lot of time, because of no concurrency.
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new UploadFileTask());
            thread.start();
        }

        // Running 1000 threads at the same time, the Java Virtual machine has a thread scheduler. 
    }
}
