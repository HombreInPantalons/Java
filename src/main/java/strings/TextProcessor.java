package strings;

//String zijn in het algemeen immutable. Tenzij men gebruik maakt van String Builder, dan kan je mutable strings creëren.



public class TextProcessor {

    public static void main(String[] args) {

      countAndPrintWords("Hello World lorem ipsum etc etc blabla");
      reverseString("Hello World lorem ipsum etc etc blabla");
      addSpaces("HelloWorldLoremIpsumEtcEtcBlabla");
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


        //For loop beginnend van achteraan de string (-1 om van aantal characters een index te maken, want index start op 0).
        //Zolang index groter dan of gelijk is aan 0 (eerste index) moet de method blijven 'loopen'.
        //Na elke loop minderen we de index met 1 (i--).
        System.out.println("This is your text reversed: ");
        for(int i = input.length()-1; i >= 0; i--) {

            System.out.print(input.charAt(i)); //Print de character op index;
        }
        System.out.println(" ");
    }

    public static void addSpaces(String input) {

        //We maken een nieuwe String, met de StringBuilder method (= mutable), om spaties toe te voegen.
        var modifiedInput = new StringBuilder(input);
        for(int i = 0; i < modifiedInput.length(); i++){

            //Als de character At index van modified input uppercase is EN het is niet op index 0. Voeg een spatie toe VOOR de huidige index.
            if(i != 0 && Character.isUpperCase(modifiedInput.charAt(i))){
                modifiedInput.insert(i, " "); //insert = voor de index.
                i++; //omdat we een spatie toevoegen VOOR de hoofdletter, moet men de index nadien terug 1 opschuiven. Of het programma zal
                //blijven spaties toevoegen op dezelfde plaats en niet verder zoeken naar volgende hoofdletters.
            }
        }
        System.out.println(modifiedInput);

    }

}
