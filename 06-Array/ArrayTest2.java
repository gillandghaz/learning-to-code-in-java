import java.util.Scanner;
public class ArrayTest2{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Scanner harus diawal sebagai deklarasi kita memakai scanner
        int[] indeksAngka = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //int di awal sebagai data awal yang mau dieksekusi
        System.out.println("Masukkan angka antara 1-10: ");

        int nomorUser = input.nextInt();
        //input tidak boleh ada isinya
        int hasilUser = nomorUser - 1;

        if (nomorUser > 10 || nomorUser < 1){
            System.out.println("Masukkan nomor hanya dari 1-10!");
        } else {
            for (int i = hasilUser; i < indeksAngka.length; i++){
                System.out.println(indeksAngka[i]);
            }
        //Loop dalam else/if
        }
    }
}