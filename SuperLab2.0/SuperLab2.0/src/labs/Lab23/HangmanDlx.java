package labs.Lab23;

import static java.lang.System.out;

import java.util.Scanner;

import control.objs;

public class HangmanDlx {
    protected static void hangmandlx() {
        try (Scanner console = objs.getScanner()) {
            boolean guessedLetter = false, guessedWord = false;
            int guessesLeft = 6;
            String inputWord;
            out.println("Enter a secret word >>> ");
            inputWord = console.nextLine();
            out.print('\u000c');
            HangmanObj hangmanCalc = new HangmanObj(inputWord);
            while (guessesLeft > 0) {
                hangmanCalc.getHangman();
                out.println("Word: " + hangmanCalc.getCurrentWord());
                out.println("Letters guessed: " + hangmanCalc.getGuessedLetters());
                out.println("Letters missed: " + hangmanCalc.getMissedLetters());
                out.print("Please guess a letter: ");
                guessedLetter = hangmanCalc.inputGuess(console.nextLine());
                if (!guessedLetter)
                    guessesLeft--;
                guessedLetter = false;
                if (hangmanCalc.compareWords()) {
                    guessedWord = true;
                    break;
                }
            }
            if (guessedWord)
                out.println("You got it! Here is your final result:");
            else
                out.println(
                        "Out of guesses! Go and practice some wordle lol. The word was: " + hangmanCalc.getSecretWord()
                                + ". Here are your stats:");
            hangmanCalc.getHangman();
            out.println("Letters guessed: " + hangmanCalc.getGuessedLetters());
            out.println("Letters missed: " + hangmanCalc.getMissedLetters());

        }
    }

    private HangmanDlx() {

    }
}