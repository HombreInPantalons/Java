package strings;

public class TextProcessor {

    public static void main(String[] args) {

      countAndPrintWords("Hello World lorem ipsum etc etc blabla");
      reverseString("Hello World lorem ipsum etc etc blabla");
    }

    public static void countAndPrintWords(String input){
        String[] text  = input.split(" "); //Splitten op een spatie, dan aparte woorden in array text plaatse.
        int numberOfWords = text.length; //Aantal woorden tellen.

                         //String method .format om placeholders te gebruiken voor variabelen zodat men niet constant + " " + " " + " " + moet gebruiken
                        //Indien men meer als 1 variabele gebruikt. %d = placeholder voor een digit.
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(String words : text) {
            System.out.print(words + " | ");
        }

        System.out.println("\n");
    }

    public static void reverseString(String input){


        //For loops beginnend van achteraan de string (-1 om van aantal characters een index te maken, want index start op 0).
        //Zolang index groter dan of gelijk is aan 0 (eerste index) moet de method blijven 'loopen'.
        //Na elke loop minderen we de index met 1 (i--).
        System.out.println("This is your text reversed: ");
        for(int i = input.length()-1; i >= 0; i--) {

            System.out.print(input.charAt(i)); //Print de character op index;
        }
        System.out.println(" ");
    }

}
