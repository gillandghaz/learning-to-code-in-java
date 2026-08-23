import java.util.Scanner;
public class ArrayTest1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Pilih angka dari 1-5: ");
        int angka = input.nextInt();
        
        int[] number = {10, 20, 30, 40, 50};
        for (int i = 0; i < 5; i++){
            System.out.println(number[i]);
        }
    }
}