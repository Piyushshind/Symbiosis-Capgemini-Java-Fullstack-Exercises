class mySleepThread implements Runnable {
    public void run() {
        long id = Thread.currentThread().getId();
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is " + id + " count " + i);
        }
    }
}

public class sleep {
    public static void main(String[] args) {
        mySleepThread obj = new mySleepThread();
        Thread T1 = new Thread(obj);
        Thread T2 = new Thread(obj);
        T1.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("3 seconds waiting .....");
        T2.start();
    }
}