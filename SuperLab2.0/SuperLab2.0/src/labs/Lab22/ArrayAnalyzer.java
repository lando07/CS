package labs.Lab22;

import static java.lang.System.out;

import java.util.Scanner;

import control.objs;

public class ArrayAnalyzer {
    protected static void arrAnalyzer() {
        try (Scanner console = objs.getScanner()) {
            double[] inputArr;
            out.print("How many numbers will you enter? >>> ");
            inputArr = new double[console.nextInt()];
            out.print("Type numbers with spaces in between >>> ");
            for (int i = 0; i < inputArr.length; i++) {
                inputArr[i] = console.nextDouble();
            }
            ArrAnalyzer_obj arrAnalyzer = new ArrAnalyzer_obj(inputArr);
            double largestNum = arrAnalyzer.getLargestNum();
            double smallestNum = arrAnalyzer.getSmallestNum();
            double avg = arrAnalyzer.getAvg();
            int numOfEvens = arrAnalyzer.getNumOfEvens();
            double[] repeatAttribs = arrAnalyzer.getLongestRepeat();
            int[] incRunParams = arrAnalyzer.getLngstIncRun();
            int[] decRunParams = arrAnalyzer.getLngstDecRun();
            out.println("Largest number: " + largestNum);
            out.println("Smallest number: " + smallestNum);
            out.println("Average (rounded to tenth): " + avg);
            out.println("Number of Evens: " + numOfEvens);
            out.println("Longest repeat: " + repeatAttribs[0] + " is repeated " + (int) repeatAttribs[1] + " times");
            out.print("Longest increasing run: ");
            for (int i = incRunParams[0]; i <= incRunParams[1]; i++) {
                out.print(inputArr[i] + " ");
            }
            out.println();
            out.print("Longest decreasing run: ");
            for (int i = decRunParams[0]; i <= decRunParams[1]; i++) {
                out.print(inputArr[i] + " ");
            }
        }
    }

    private ArrayAnalyzer() {

    }
}
