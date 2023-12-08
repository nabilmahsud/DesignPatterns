package ConcurrencyInJava.ThreadsBasics;

public class UploadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Uploading a file. " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {}

        System.out.println("Upload complete. " + Thread.currentThread().getName());
    }
}
