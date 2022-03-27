package Lab23;

import static java.lang.System.in;
import static java.lang.System.out;

//Name: 
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        boolean guessedLetter = false;
        boolean guessedWord = false;
        int guessesLeft = 6;
        String inputWord;
        out.print("Enter a secret word >>> ");
        inputWord = console.nextLine();
        out.println("\u000c");
        HangmanObj hangmanCalc = new HangmanObj(inputWord);
        while (guessesLeft > 0) {
            out.println("Word: " + hangmanCalc.getCurrentWord());
            out.println("Guesses remaining: " + guessesLeft);
            out.print("Please guess a letter >>> ");
            guessedLetter = hangmanCalc.inputGuess(console.nextLine());
            out.println();
            if (!guessedLetter)
                guessesLeft--;
            if (hangmanCalc.compareWords()) {
                guessedWord = true;
                break;
            }
        }
        if (guessedWord)
            out.println("You got it!  The word was: " + hangmanCalc.getSecretWord());
        else
            out.println("Out of guesses!  Get rekt.  The word was: " + hangmanCalc.getSecretWord());
    }
}
