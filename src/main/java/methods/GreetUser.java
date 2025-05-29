package methods;

import java.util.Scanner;

public class GreetUser {

    public static void main(String[] args) {
        String name = getUserName();
        greetUser(name);
    }

    public static String getUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your name: ");
        String name = scanner.nextLine();
        scanner.close();
        return name;

    }

    public static void greetUser(String name){
        System.out.println("The name is: " + name);
    }
}
