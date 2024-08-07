class tpthread extends Thread {
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        tpthread t = new tpthread();
        t.start();
        t.stop();
        t.start();
    }
}