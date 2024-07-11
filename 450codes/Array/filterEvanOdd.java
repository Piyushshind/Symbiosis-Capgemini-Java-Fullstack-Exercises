import java.util.Scanner;

public class filterEvanOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        int[] arr2 = new int[8];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 != 0) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i])  ;
        
        }

    }
}
