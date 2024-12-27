public class BasicThreads {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread 1 is running.");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread 2 is running.");
    }
}
