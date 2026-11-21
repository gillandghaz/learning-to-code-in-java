import java.util.Scanner;

public class subStrings1 {
    public static void main() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = input.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+ 1);
            System.out.printf("Username: %s\n", username);
            System.out.printf("Domain: %s\n", domain);
        }
        else {
            System.out.println("Enter your email! (\"@\" is missing)");
        }

        input.close();
    }
}
