import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows :- ");
        int row = sc.nextInt();
        System.out.print("Enter no of Coloms :- ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];
        System.out.print("Enter values :- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(" Output is :- ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
