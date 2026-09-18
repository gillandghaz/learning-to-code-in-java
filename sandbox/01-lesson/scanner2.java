import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double height = 0;
        double width = 0;

        System.out.print("Input height: ");
        height = in.nextDouble();
        System.out.print("Input width: ");
        width = in.nextDouble();

        System.out.println("Area is: " + (height * width));

        in.close();
    }
}
