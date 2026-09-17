import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        //COMMON ISSUES

        Scanner input = new Scanner (System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); //int bertipe angka, maka tidak menerima enter (\n), maka dari itu tersisa dan diambil tipe String

        System.out.print("Enter your favorite color: ");
        String color = input.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color: " + color);

        input.close();
    }
}