import java.util.Random;

public class randomNum1 {
    public static void main(String[] args) {

        Random randomNum = new Random();

        int num;
        num = randomNum.nextInt(1, 20);
        System.out.println(num);
    }
}
