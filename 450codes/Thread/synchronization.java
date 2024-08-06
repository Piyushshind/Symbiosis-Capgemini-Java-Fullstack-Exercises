public class synchronization {
    public static void main(String[] args) {
        printing pp = new printing();
        thread1 t1 = new thread1(pp);
        thread2 t2 = new thread2(pp);
        t1.start();
        t2.start();
    }
}

class printing {
    synchronized void print(char ch) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class thread1 extends Thread {
    printing p;

    thread1(printing p) {
        this.p = p;
    }

    public void run() {
        p.print('*');
        System.out.println("thread one is running ..............");
    }
}

class thread2 extends Thread {
    printing p;

    thread2(printing p) {
        this.p = p;
    }

    public void run() {
        p.print('#');
        System.out.println("thread two is running ..............");
    }
}