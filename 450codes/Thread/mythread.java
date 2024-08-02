// package 450codes.Thread;
class myTread implements Runnable {
    public static int a = 0;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running ...." + (++a) + " times ");

        }
    }
}

public class mythread {

    public static void main(String[] args) {
        myTread s1 = new myTread();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);
        t1.setPriority(5);
        t2.setPriority(1);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();

    }
}
