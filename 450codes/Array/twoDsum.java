import java.util.Scanner;

public class twoDsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 3;

        int[][] numbers = new int[row][col];
        System.out.println("Enter values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            int sumRow = 0;
            for (int j = 0; j < col; j++) {
                sumRow += numbers[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " is: " + sumRow);
        }
        int diagonalSum = 0;
        for (int j = 0; j < col; j++) {
            int sumCol = 0;
            for (int i = 0; i < row; i++) {
                sumCol += numbers[i][j];
                if (i == j) {
                    diagonalSum += numbers[j][i];
                }
            }
            System.out.println("Sum of column " + (j + 1) + " is: " + sumCol);
        }
        System.out.println("Diagonal sum :- " + diagonalSum);
    }
}
