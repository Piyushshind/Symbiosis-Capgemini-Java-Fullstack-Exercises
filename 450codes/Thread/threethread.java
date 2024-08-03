class myPriThread implements Runnable {
    public void run() {
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            if (id == 21) {
                System.out.println(name + " Thread is Running ....... " + i);
                if (i == 5) {
                    Thread.yield();
                    System.out.println(name + " thread is Stop for some Time " + i);
                }
                System.out.println(name + " Thread is Started again ....... " + i);
            }
            if (id == 22) {
                System.out.println(name + " Thread is Running ....... " + i);
                if (i == 2 || i == 7) {
                    System.out.println(name + " thread is Stop for 3 seconds " + i);
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        System.out.println(" Error occurs " + e);
                    }

                }
                System.out.println(name + " Thread is Started again ....... " + i);
            }
            if (id == 23) {
                System.out.println(name + " Thread is Running ....... " + i);
                if (i == 9) {
                    try {
                        Thread.currentThread().stop();
                    } catch (Exception e) {
                        System.out.println(" Error occur in Thread :- " + name);
                    }
                    System.out.println(" Thread is killd at index " + i);
                }
            }
        }
    }
}

public class threethread {
    public static void main(String[] args) {
        myPriThread pd = new myPriThread();
        Thread t1 = new Thread(pd);
        Thread t2 = new Thread(pd);
        Thread t3 = new Thread(pd);

        t1.setName("A1");
        t2.setName("B2");
        t3.setName("C3");

        t1.start();
        t2.start();
        t3.start();

    }
}
