
public class interept {
    public static void main(String[] args) {
        interpetThread t1 = new interpetThread();
        interpetThread2 t2 = new interpetThread2();

        t1.start();
        t2.start();

        t1.interrupt();
    }
}

class interpetThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                System.out.println("thread one is running ........");
                if (i == 2) {

                    Thread.sleep(5000);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class interpetThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                System.out.println("thread Two is running ........");
                // Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}