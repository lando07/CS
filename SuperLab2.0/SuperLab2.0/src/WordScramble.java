
import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class WordScramble {
    private static Random rand = Objs.getRandom();
    private static Scanner console = Objs.getScanner();

    private WordScramble() {
    }

    public static void WS() {
        out.println("Type a word, sentence, or entire paragraph followed by enter.");
        String line = console.nextLine();
        String[] words = line.split(" ");
        String scrambledSentence = "";
        for (int i = 0; i < words.length; i++) {
            scrambledSentence += scramble(words[i]);
        }
        out.println("\nHere is a scrambled version:");
        out.println(scrambledSentence);
    }

    private static String scramble(String line) {
        char tmp;
        char[] lineArr = line.toCharArray();
        String scrambledString = "";
        int length = lineArr.length - 2;
        if (!Character.isLetter(line.charAt(length + 1)))
            length -= 1;
        for (int i = 1; i < length; i++) {
            int newIndx = rand.nextInt(length) + 1;
            tmp = lineArr[i];
            lineArr[i] = lineArr[newIndx];
            lineArr[newIndx] = tmp;
        }
        for (int i = 0; i < lineArr.length; i++)
            scrambledString += lineArr[i];
        return scrambledString + " ";
    }
}