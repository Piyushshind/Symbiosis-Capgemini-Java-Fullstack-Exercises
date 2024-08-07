import java.io.*;
import java.util.Scanner;

public class outputstrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ClgName = sc.nextLine();
        sc.close();

        try {
            FileOutputStream f = new FileOutputStream("E:\\\\Notapad/dummy.txt", true);
            byte bytName[] = name.getBytes();
            byte bytclgName[] = ClgName.getBytes();

            String str = "Student name is :- ";
            String str2 = "And he is studdying in collage :- ";
            char ch[] = str.toCharArray();
            char ch1[] = str2.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                f.write(ch[i]);
            }
            f.write(bytName);
            f.write('\n');
            for (int i = 0; i < str2.length(); i++) {
                f.write(ch1[i]);
            }
            f.write(bytclgName);

            System.out.println("file Updated succefully ");
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
