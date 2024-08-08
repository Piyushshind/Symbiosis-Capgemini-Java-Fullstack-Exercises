import java.io.*;

public class Output {
    public static void main(String[] args) {
        String filename = "E:\\\\Notapad/dummy.txt";
      try {

          FileInputStream f = new FileInputStream(filename);
          ObjectInputStream O = new ObjectInputStream(f);
          Studdent obj = (Studdent) O.readObject();
        
        System.out.println(obj.stdName);
          O.close();
          f.close();
      } catch (Exception e) {
          System.out.println(e);
      }

  }
}

class Studdent {
    String stdName = "Piyush";
    int rollNo = 5;

    Studdent(String s, int a) {
        this.stdName = s;
        this.rollNo = a;
    }
}
