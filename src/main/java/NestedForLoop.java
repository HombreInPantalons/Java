import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 24;
        int numberOfTests = 4;


        for (int i = 0; i < numberOfStudents; i++) {

            double sum = 0;

            for (int j = 0; j < numberOfTests; j++) {

                System.out.println("Score for test #" + (j+1));
                double score = scanner.nextDouble();
                sum = sum + score;


            }
            double average = sum/numberOfTests;
            System.out.println("The average for student #" + (i+1) + " is " + average);

        } scanner.close();
    }

}
