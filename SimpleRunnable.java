
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class SimpleRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();  // Start the thread
    }
}