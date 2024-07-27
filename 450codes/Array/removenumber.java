import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class removenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList ad = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            ad.add(a);
        }
        // Collections.sort(ad);
        System.out.println(" Enter number you want to remove :- ");
        int num = sc.nextInt();
        int count = 0;
        if (ad.contains(num)) {
            for (int i = 0; i < ad.size(); i++) {
                if (ad.get(i).equals(num)) {
                    ad.remove((Integer) num);
                    count++;
                }
            }
            System.out.println(" Your number " + num + " removed " + count + " times in ArrayList ");
            System.out.println(ad);
        } else {
            System.out.println("Element not found ");
        }

    }
}
