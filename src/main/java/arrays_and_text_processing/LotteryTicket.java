package arrays_and_text_processing;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    //Constant hieronder, final = constant! cannot be changed. ALL CAPS means constant variable for context purposes.

    private static final int MAX_TICKET_NUMBER = 69;
    private static final int LENGTH = 6;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }


    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {

                randomNumber = random.nextInt(1,MAX_TICKET_NUMBER);

            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;

    }

    public static boolean search(int[] array, int numberToSearchFor){
        for(int value: array){
            if(value == numberToSearchFor) return true;
        } //GEEN ELSE, anders stopt de for loop op de return mss al na de eerste loop.
        return false;
    }

    public static void printTicket(int [] array){
        //Sorteren van array
        Arrays.sort(array);

        //Printen met 'Arrays'
        System.out.println(Arrays.toString(array));

        //Printen met een for loop
        for(int value : array){
            System.out.print(value + " | ");
        }
    }
}
