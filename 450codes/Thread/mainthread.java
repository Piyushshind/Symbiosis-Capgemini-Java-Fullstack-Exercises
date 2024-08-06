
public class mainthread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " main thred is running ....");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println( e);
        }
        System.out.println(" main thread has stoped ..");
        newThread np = new newThread();
        np.start();
        try {
            np.join();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
}

class newThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running ......");
    }
}