package labs;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class WordScramble {
    private static Random rand = new Random();
    private static Scanner console = new Scanner(in);

    public static void main(String[] args) {
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

    public static String scramble(String line) {
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