import java.util.Scanner;

public class Array3Dimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisiasi
        int[][] matriksA = new int[3][3];
        int[][] matriksB = new int[3][3];
        int[][] hasil    = new int[3][3];

        // Input Matriks A
        System.out.println("=== INPUT MATRIKS A (3x3) ===");
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan elemen A[" + i + "][" + j + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }

        // Input Matriks B
        System.out.println("=== INPUT MATRIKS B (3x3) ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan elemen B[" + i + "][" + j + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Perkalian
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        // Output
        System.out.println("=== HASIL PERKALIAN MATRIKS A x B ===");
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}