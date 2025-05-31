package Streams;

import java.util.Arrays;

public class Streams {
//Stream API
//Stream does not store elements like a collection
//Contains built in methods and classes to manipulate data and review the output without changing the original source code.

    public static void main(String[] args) {

    int[] numbers = {0,2,4,6,8,10};

        //Create the stream with the static method, then we can use forEach on the arrays which is otherwise not possible!
        //You can see that the original array didn't change.
        //Als we achter Arrays.stream(numbers) eerst nog .parallel() plaatst, gaat hij op alle elementen tegelijk werken.
        //De output zal dan wel willekeurig zijn van orde. Kan mss handig zijn als er snel moet worden gehandeld?
        //De parallel() zal multiple threads gebruiken om uiteraard verschillende bewerkingen tegelijk uit te voeren.

        Arrays.stream(numbers).forEach(n -> System.out.print(n + 1 + " "));
        System.out.println();
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }

        //STREAM OPERATIONS

        // A) INTERMEDIATE
        //perform operation, return resulting stream

        // B) Terminal
        // return a result and close the stream


}
