import java.util.Scanner;
public class LoopTest2{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= 10; i++){
        System.out.println(angka * i);
        //i disini berfungsi sebagai variabel dalam loop saja
        }
    }
}