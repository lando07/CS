package labs.Lab20;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        String stringInput = "";
        Scanner console = new Scanner(in);
        // rules of pig latin:
        // move all leading consonants to end and add ay
        // if starts with a vowel add hay to the end, (y is not a vowel here)
        while (stringInput.indexOf("quit") == -1) {
            out.print("Type a word (or \"quit\") >>> ");
            stringInput = console.nextLine();
            if (stringInput.contains("quit")) {
                continue;
            } else {
                String pigLatinString = pigLatinConverter.convert(stringInput);
                out.println(pigLatinString);
            }
        }
        out.println("Bye!");
    }
}