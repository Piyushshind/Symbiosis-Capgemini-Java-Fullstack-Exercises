
class threadCreat implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Chield " + name);
        }
    }
}

public class yeild {
    public static void main(String[] args) {
        threadCreat dc = new threadCreat();
        Thread t1 = new Thread(dc);

        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName() + " Thread ");
        }
    }
}
