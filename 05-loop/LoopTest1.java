import java.util.Scanner;
public class LoopTest1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }


    }
}