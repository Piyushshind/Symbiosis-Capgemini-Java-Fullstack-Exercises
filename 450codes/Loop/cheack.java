
public class cheack {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 &&  (i/5 != 3)) {
                System.out.println("for %5 " + i);
            }
            if (i % 3 == 0) {
                if(i==15){continue;}
                System.out.println("for %3 " + i);
            }
        }
    }
}
