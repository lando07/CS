package labs.Lab23;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

//Name: 
/*
012345678
0   +----+
1   |    |
2   0    |
3  /|\   |
4  / \   |
5        |
6 =========
the parts are drawn
 */
public class HangmanObj {
    private char[] secretWord;
    private char[] currentWord;
    private String lettersMissed = " ";
    private String lettersGuessed = " ";
    private int lettersMissedNum = 0;
    private char[][] hangman = { // currently unused until hangmandlx is developed
            { ' ', ' ', '+', '-', '-', '-', '-', '+', ' ' },
            { ' ', ' ', '|', ' ', ' ', ' ', ' ', '|', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ' },
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|', ' ' },
            { '=', '=', '=', '=', '=', '=', '=', '=', '=' }

    };

    public HangmanObj(String inputWord) {
        secretWord = inputWord.toCharArray();
        currentWord = new char[secretWord.length];
        for (int i = 0; i < currentWord.length; i++) {
            currentWord[i] = '_';
        }
    }

    public void getHangman() { // same as the hangman[][] array
        for (int i = 0; i < 7; i++) {
            for (int e = 0; e < 9; e++) {
                out.print(hangman[i][e]);
            }
            out.println();
        }
    }

    private void setHangman() {
        switch (lettersMissedNum) {
            case 0:
                break;
            case 1:
                hangman[2][2] = '0';
                break;
            case 2:
                hangman[3][2] = '|';
                break;
            case 3:
                hangman[3][1] = '/';
                break;
            case 4:
                hangman[3][3] = '\\';
                break;
            case 5:
                hangman[4][1] = '/';
                break;
            case 6:
                hangman[4][3] = '\\';
                break;
        }
    }

    public String getCurrentWord() {
        String currentWordStr = "";
        for (int i = 0; i < currentWord.length; i++) {
            currentWordStr += currentWord[i] + " ";
        }
        return currentWordStr;
    }

    public String getSecretWord() {
        String secretWordStr = "";
        for (int i = 0; i < secretWord.length; i++) {
            secretWordStr += secretWord[i];
        }
        return secretWordStr;
    }

    public String getMissedLetters() {
        return lettersMissed;
    }

    public String getGuessedLetters() {
        return lettersGuessed;
    }

    public boolean compareWords() {
        String secretWordStr = Arrays.toString(secretWord);
        String currentWordStr = Arrays.toString(currentWord);
        if (currentWordStr.equals(secretWordStr))
            return true;
        else
            return false;
    }

    public boolean inputGuess(String input) {
        try (Scanner console = new Scanner(in)) {
            while (input.isEmpty()) {
                input = console.nextLine();
            }
        }
        char inputChar = input.charAt(0);
        boolean letterGuessed = false;
        for (int i = 0; i < currentWord.length; i++) {
            if (secretWord[i] == inputChar) {
                currentWord[i] = inputChar;
                letterGuessed = true;
            }
        }
        if (letterGuessed) {
            if (lettersGuessed.contains(input))
                return true;
            lettersGuessed += inputChar + " ";
            return true;
        } else {
            if (lettersMissed.contains(input))
                return false;
            lettersMissed += inputChar + " ";
            lettersMissedNum++;
            setHangman();
            return false;
        }
    }
}
