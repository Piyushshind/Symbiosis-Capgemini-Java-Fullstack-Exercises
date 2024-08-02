// package 450codes.Thread;
class myTread implements Runnable {
    public int a = 0;

    public void run() {
        for (int i = 1; i < 51; i++) {
            long id = Thread.currentThread().getId();
            String name = Thread.currentThread().getName();
            if (id == 21) {
                if (i % 2 == 0) {
                    System.out
                            .println(name + " t1 thread is running with id :- " + id + " and connt " + (++a)
                                    + "with Even Numbers :- " + i);
                }
            }
            if (id == 22) {
                if (i % 2 != 0) {
                    System.out.println(name + " t2 thread is running with id :- " + id + " and connt " + (++a)
                            + "with Odd Numbers :- " + i);
                }
            }
            if (id == 23) {
                System.out.println(name + " t3 thread is running with id :- " + id + " and connt " + (++a)
                        + " with Natuaral Numbers :- " + i);
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

        t1.setName("Fisrt");
        t2.setName("Second");
        t3.setName("Third");

        t1.setPriority(5);
        t2.setPriority(1);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();

    }
}
