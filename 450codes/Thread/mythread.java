// package 450codes.Thread;
class myTread implements Runnable {
    public int a = 0;

    public void run() {
        for (int i = 0; i < 5; i++) {
            long id = Thread.currentThread().getId();
            if (id == 21) {
                System.out.println("t1 thread is running with id :- " + id + " and connt " + (++a) + " Even "
                        + "with Loop-index :- " + i);
            }
            if (id == 22) {
                System.out.println("t2 thread is running with id :- " + id + " and connt " + (++a) + " Odd "
                        + "with Loop-index :- " + i);
            }
            if (id == 23) {
                System.out.println("t3 thread is running with id :- " + id + " and connt " + (++a) + " Nutral"
                        + " with Loop-index :- " + i);
            }
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
