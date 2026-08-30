//Latihan Luas
import java.util.Scanner;
public class LatihanMethod2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();

        int luas = hitungLuas(a, b);
        //Memakai method harus dideklarasikan ulang sesuai dengan tipe datanya
        System.out.println("Luas kotak: "+ luas);

        System.out.println("Masukkan nilai x: ");
        int x = input.nextInt();

        double lingkaran = luasLingkaran(x);
        System.out.println("Luas lingkaran: " + lingkaran);
    }

    public static int hitungLuas(int a, int b){
        return a * b;
        // return sebagai balasan, jangan a * b; return; karena itu sama saja seperti prosses lalu dibuang lalu return
    }

    public static double luasLingkaran(int x){
        return x * x * 3.14;
    }

}