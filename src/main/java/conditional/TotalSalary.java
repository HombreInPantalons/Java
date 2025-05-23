package conditional;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total salary?");
        double salary = scanner.nextDouble();

        System.out.println("Total sales?");
        int sales = scanner.nextInt();

        if (sales >= 10) {
            System.out.println("Total salary is: $" + (salary + 1250));
        } else {
            System.out.println("Total salary is: $" + (salary + 1000));
        }
    }
}
