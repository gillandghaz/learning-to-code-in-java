import java.util.Scanner;

public class Array2Dimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        matriks[0][0] = 5;
        matriks[0][1] = 12;
        matriks[1][2] = 7;

        int[][] matriksA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}