import java.util.Scanner;
public class CekNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilaimu berapa?");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }

}