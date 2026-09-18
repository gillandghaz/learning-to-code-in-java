import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {

        //Empty OR Blank Scanner

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.println("Please enter your name!");
        }
        else {
            System.out.println("Your name: " + name);
        }

        scanner.close();
    }
}
