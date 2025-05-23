package conditional;

import java.util.Scanner;

public class QuotaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quota = 10;
        System.out.println("How many sales did you have this week?");
        int sales = scanner.nextInt();

        if (sales >= quota) {
            System.out.println("Congratulations");
        } else {
            int difference = quota - sales;
            System.out.println("You still needed " + difference +" more sales for quota");
        }
    }
}
