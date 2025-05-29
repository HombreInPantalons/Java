package while_loop;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean again;
        do {

            System.out.println("Enter first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter second number: ");
            int y = scanner.nextInt();
            int lSum = x + y;
            System.out.println("Local sum = " + lSum);

            total = total + lSum;
            System.out.println("Total sum this run is = " + total);

            System.out.println("Would you like to run again? ");
            again = scanner.nextBoolean();


        } while(again);
        scanner.close();
    }
}
