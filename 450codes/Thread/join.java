
class ChildThread extends Thread {
    public void run() {
        System.out.println("Child thread is running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Child thread has finished.");
    }
}

public class join {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();

        try {
            childThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread resumes after child thread has finished.");
    }
}



