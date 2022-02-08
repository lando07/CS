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
        double[] repeatNum;
        int[] longestRepeat;
        int longestRepeatNum = 0; 
        int[] longestRun;
        out.print("How many numbers will you enter? >>> ");
        arrLength = console.nextInt();
        double[] doubArr = new double[arrLength];
        repeatNum = new double[arrLength];
        longestRepeat = new int[arrLength];
        out.print("Type numbers with spaces in between >>> ");
        for (int i = 0; i < doubArr.length; i++){
            double arrVar = console.nextDouble();
            doubArr[i] = arrVar;
        }
        out.println();
        for (int i = 0; i < doubArr.length; i++){
            arrMaxNum = max(doubArr[i],doubArr[i+1]);
            if(doubArr.length - i == 1) break;
        }
        out.println("Largest Number: " + arrMaxNum);
        for (int i = 0; i < doubArr.length; i++){
            arrMaxNum = min(doubArr[i],doubArr[i+1]);
            if(doubArr.length - i == 1) break;
        }
        out.println("Smallest Number: " + arrMinNum);
        for (int i = 0; i < doubArr.length; i++){
            avg+= doubArr[i];
        }
        avg /= doubArr.length;
        avg /=10;
        avg = round(avg);
        avg *=10;
        out.println("Average (rounded to tenth): " + avg);
        for (int i = 0; i < doubArr.length; i++){
            if((int) doubArr[i] % 2 == 0)
            numOfEvens++;
        }
        out.println("Number of Evens: " + numOfEvens);
        for (int i = 0; i < doubArr.length; i++){
            if(doubArr[i] == doubArr[i+1]){
                
            }
            else{
            }
            if(doubArr.length - i == 1) break;
        }
    }
}