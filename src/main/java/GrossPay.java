import java.util.Scanner;

public class GrossPay {

    public static void main(String[]Args) {

        int maxHours = 40;
        int rate = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your hours");
        int hours = scanner.nextInt();

        while(hours > 40 || hours < 0) {

            System.out.println("incorrect input try again");
            hours = scanner.nextInt();

        }
        scanner.close();
        int grossPay = hours * rate;
        System.out.println("Your pay is " + grossPay);

    }


}
