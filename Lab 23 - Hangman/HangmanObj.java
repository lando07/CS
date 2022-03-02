import java.util.*;
import static java.lang.System.*;
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
public class HangmanObj
{
    private char[] secretWord;
    private char[] currentWord;
    private String lettersMissed;
    private String lettersGuessed;
    private char[][] hangman ={ //currently unused until hangmandlx is developed
            {' ',' ','+','-','-','-','-','+',' '},
            {' ',' ','|',' ',' ',' ',' ','|',' '},
            {' ',' ',' ',' ',' ',' ',' ','|',' '},
            {' ',' ',' ',' ',' ',' ',' ','|',' '},
            {' ',' ',' ',' ',' ',' ',' ','|',' '},
            {' ',' ',' ',' ',' ',' ',' ','|',' '},
            {'=','=','=','=','=','=','=','=','='}

        };
    public HangmanObj(String inputWord){
        secretWord = inputWord.toCharArray();
        currentWord = new char[secretWord.length];
        for (int i = 0; i < currentWord.length; i++){
            currentWord[i] = '_';
        }
    }

    public void getHangman(){ //same as the hangman[][] array
        for (int i = 0; i<7; i++){
            for(int e = 0; e<9; e++){
                out.print(hangman[i][e]);
            }
            out.println();
        }
    }

    public String getCurrentWord(){
        String currentWordStr = "";
        for (int i = 0; i < currentWord.length; i++){
            currentWordStr+=currentWord[i]+" ";
        }
        return currentWordStr;
    }

    public String getSecretWord(){
        String secretWordStr = "";
        for (int i = 0; i < secretWord.length; i++){
            secretWordStr+=secretWord[i];
        }
        return secretWordStr;
    }
    
    public String getMissedLetters(){
        return lettersMissed;
    }
    
    public String getGuessedLetters(){
        return lettersGuessed;
    }

    public boolean compareWords(){
        String secretWordStr = Arrays.toString(secretWord);
        String currentWordStr = Arrays.toString(currentWord);
        if(currentWordStr.equals(secretWordStr))
            return true;
        else
            return false;
    }

    public boolean inputGuess(String input){
        char inputChar = input.charAt(0);
        boolean letterGuessed = false;
        for(int i = 0; i < currentWord.length; i++){
            if(secretWord[i] == inputChar){
                currentWord[i] = inputChar;
                letterGuessed = true;
            }
        }
        if(letterGuessed){
            lettersGuessed += inputChar + " ";
            return true;
        }
        else{
            lettersMissed += inputChar + " ";
            return false;
        }
    }
}
