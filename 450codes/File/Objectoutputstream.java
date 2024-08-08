import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Objectoutputstream {
    public static void main(String[] args) {
        studdent s = new studdent("Ram", 56);
        String filename = "E:\\\\Notapad/dummy.txt";
        try {

            FileOutputStream f = new FileOutputStream(filename);
            ObjectOutputStream O = new ObjectOutputStream(f);
            O.writeObject(s);
            O.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class studdent {
    String stdName = "Piyush";
    int rollNo = 5;

    studdent(String s, int a) {
        this.stdName = s;
        this.rollNo = a;
    }
}