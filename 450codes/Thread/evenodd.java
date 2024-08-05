class first extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is running .......");
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(" Even Numbers :- " + i);
            }
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class second extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is running .......");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(" Odd Numbers :- " + i);
            }
        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class third extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread is running .......");
        for (int i = 0; i < 10; i++) {

            System.out.println(" Natural Numbers :- " + i);
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class evenodd {
    public static void main(String[] args) {
        first f = new first();
        second s = new second();
        third t = new third();

        f.start();
        try {
            f.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        s.start();
        try {
            s.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
