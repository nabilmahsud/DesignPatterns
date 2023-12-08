package ConcurrencyInJava.ThreadsBasics;

public class StartPauseThreads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new UploadFileTask());
            thread.start();
        }
    }
}
