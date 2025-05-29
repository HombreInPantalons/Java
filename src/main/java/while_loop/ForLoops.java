package while_loop;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int items = scanner.nextInt();
        double total = 0;

        for(int i = 0; i < items; i++) {
            System.out.println("Give price: ");
            double price = scanner.nextDouble();
            System.out.println("Your item's price $" + price + " is added to the cashier.");
            total = total + price;
            System.out.println("Your current total is: $" + total + ".");
        }
    }
}
