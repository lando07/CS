import static java.lang.System.*;
import java.util.*;
import static java.lang.Math.*;

public class ArrayAnalyzer
{
    public static void main(String[] args){
        Scanner console = new Scanner(in);
        int arrLength;
        double arrMaxNum = 0;
        double arrMinNum = 0;
        double avg = 0;
        int numOfEvens = 0;
        int repeatLength = 0;
        double repeatNum = 0;
        int longestRepeatLength = 0;
        double longestRepeatNum = 0; 
        int[] longestRun;
        out.print("How many numbers will you enter? >>> ");
        arrLength = console.nextInt();
        double[] doubArr = new double[arrLength];
        out.print("Type numbers with spaces in between >>> ");
        for (int i = 0; i < doubArr.length; i++){
            double arrVar = console.nextDouble();
            doubArr[i] = arrVar;
        }
        arrMaxNum = doubArr[0];
        arrMinNum = doubArr[0];
        out.println();
        for (int i = 0; i < doubArr.length - 1; i++){
            if(doubArr.length - i == 1) break;
            arrMaxNum = max(doubArr[i], arrMaxNum);
        }
        out.println("Largest number: " + arrMaxNum);
        for (int i = 0; i < doubArr.length; i++){
            if(doubArr.length - i == 1) break;
            arrMinNum = min(doubArr[i], arrMinNum);
        }
        out.println("Smallest number: " + arrMinNum);
        for (int i = 0; i < doubArr.length; i++){
            avg+= doubArr[i];
        }
        avg /= doubArr.length;
        avg *= 10;
        avg = round(avg);
        avg /= 10;
        out.println("Average (rounded to tenth): " + avg);
        for (int i = 0; i < doubArr.length; i++){
            if((int) doubArr[i] % 2 == 0)
                numOfEvens++;
        }
        out.println("Number of Evens: " + numOfEvens);
        for (int i = 0; i < doubArr.length; i++){
            if(doubArr.length - i == 1) break;
            if(doubArr[i] == doubArr[i+1]){
                if(repeatLength <= 0)
                    repeatLength = 2;
                else
                    repeatLength++;
                repeatNum = doubArr[i];
            }
            else{
                if(repeatLength > longestRepeatLength){
                    longestRepeatLength = repeatLength;
                    longestRepeatNum = repeatNum;
                }
                repeatNum = 0;
                repeatLength = 0;
            }
        }
        out.println("Longest repeat: " + longestRepeatNum + " is repeated " + longestRepeatLength + " times");
    }
}