import java.io.*;
import java.util.Scanner;

public class outputstrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ClgName = sc.nextLine();

        try {
            FileOutputStream f = new FileOutputStream("E:\\\\Notapad/dummy.txt", true);
            String str = " and he is studdying MCA ";
            char ch[] = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                f.write(ch[i]);
            }
            System.out.println("file Updated succefully ");
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
