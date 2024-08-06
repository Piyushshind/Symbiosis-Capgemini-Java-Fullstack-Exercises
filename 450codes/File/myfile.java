import java.io.File;

public class myfile {
    public static void main(String[] args) {
        try {
            File f1 = new File("E:\\Notapad/dummy.txt");
            if (f1.createNewFile()) {
                System.out.println("File is crteated ");
                System.out.println("can file exist  " + f1.exists());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
