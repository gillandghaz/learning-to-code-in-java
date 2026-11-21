import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {

        //Common mistake in Scanner

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

                            //Wajib jika dari scanner int ke String,
        input.nextLine();   //karena int tidak memproses space atau enter (\n),hanya angka.
                            //Maka dari itu diambil oleh String jika tidk dibatasi

        System.out.print("Enter your favorite color: ");
        String color = input.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        input.close();
    }
}
