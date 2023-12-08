package ConcurrencyInJava.ThreadsBasics;

public class InterruptingThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new UploadFileTask());
        thread.start();

       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {}

       thread.interrupt();

    }
}
