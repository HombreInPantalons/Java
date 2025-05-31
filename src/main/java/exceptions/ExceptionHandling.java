package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        //We creëren een file object met een pathname naar waar de file zich bevindt.
        File file = new File("~/processingnothing/fileren.txt");
        //Java geeft ons hier een error bij .createNewFile() omdat er moet gekeken worden naar de exception handling.
        //Hier maken we gebruik van Try Catch.
        //De IOException kunnen we aflezen van de error die we op voorhand konden zien bij createNewFile();
        //e = de naam die we geven aan de IOException
        try{
            file.createNewFile();
        }catch(IOException e) {
            System.out.println("Sorry, an error occurred");
        }
    }
}
