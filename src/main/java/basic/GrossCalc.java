package basic;

import java.util.Scanner;


public class GrossCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Total hours?");
        int hours = scanner.nextInt();
        System.out.println("Gross pay?");
        double pay = scanner.nextDouble();

        double result = pay * hours;
        System.out.println("total is: "+ result);
    }

}
