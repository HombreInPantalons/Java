package methods;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        double credit = getCredit();
        scanner.close();
        boolean qualified = isUserQualified(salary, credit);
        notifyUser(qualified);
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("You are qualified");
        } else {
            System.out.println("You are not qualified");
        }
    }

    public static double getSalary(){
        System.out.println("Give me your salary: ");
        return scanner.nextDouble();
    }

    public static double getCredit(){
        System.out.println("Give me your creditscore: ");
        return scanner.nextDouble();
    }

    public static boolean isUserQualified(double salary, double credit){
        return salary > requiredSalary && credit >= requiredCreditScore;
    }

}
