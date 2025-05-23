package conditional;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bonus = 1000;
        int bigBonus = 1250;
        int quota = 10;


        System.out.println("Total salary?");
        double salary = scanner.nextDouble();

        System.out.println("Total sales?");
        int sales = scanner.nextInt();

        scanner.close();

        if (sales >= quota) {
            System.out.println("Total salary is: $" + (salary + bigBonus));
        } else {
            System.out.println("Total salary is: $" + (salary + bonus));
        }
    }
}
