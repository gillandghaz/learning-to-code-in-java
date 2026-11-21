import java.util.Locale;
import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the day: ");
        String day = input.nextLine().toLowerCase();

        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                       System.out.printf("It is a weekday!\n");
            case "saturday", "sunday" ->
                       System.out.printf("It is a weekend!\n");
            default -> System.out.printf("%s is not a day\n", day);
        }
    }
}
