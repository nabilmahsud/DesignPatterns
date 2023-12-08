package ConcurrencyInJava.ThreadsBasics;

public class JoinThreadsDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new UploadFileTask());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException ex) {}
        System.out.println("Can scan file now. ");


    }
}
