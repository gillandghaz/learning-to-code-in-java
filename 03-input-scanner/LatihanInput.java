import java.util.Scanner;
public class LatihanInput{
    public static void main(String[] args){
        Scanner p = new Scanner (System.in);

        System.out.print("Siapa Namamu?");
        String nama = p.nextLine();

        System.out.print("Berapa Umurmu?");
        int umur = p.nextInt();

        System.out.println("Halo, " + nama + "!");
        System.out.println("Umur: " + umur);
    }
}