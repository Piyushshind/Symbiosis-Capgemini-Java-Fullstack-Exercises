import java.util.*;

public class homogeniouse {
    public static void RemoveDuplicate(ArrayList<Integer> ad) {
        ArrayList<Integer> sd = new ArrayList<>();

        int temp = ad.get(0);
        sd.add(temp);

        for (int i = 0; i < ad.size(); i++) {
            if (!ad.get(i).equals(temp)) {
                sd.add(ad.get(i));
                temp = ad.get(i);
            }
        }
        System.out.println(sd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList ad = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            ad.add(a);
        }
        Collections.sort(ad);

        RemoveDuplicate(ad);
    }
}
