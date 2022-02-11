import static java.lang.System.*;
import java.util.*;
import static java.lang.Math.*;

public class ArrayAnalyzer
{
    public static void main(String[] args){
        //so you can enter info
        Scanner console = new Scanner(in);
        //variable init
        double[] doubArr;
        int arrLength;
        double arrMaxNum = 0;
        double arrMinNum = 0;
        double avg = 0;
        int numOfEvens = 0;
        int repeatLength = 0;
        double repeatNum = 0;
        int longestRepeatLength = 0;
        double longestRepeatNum = 0;
        int startOfRun;
        int endOfRun;
        int longestRunLength = 0;
        double[] longestIncRun;
        double[] longestDecRun;
        //start of program, getting arr length
        out.print("How many numbers will you enter? >>> ");
        arrLength = console.nextInt();
        doubArr = new double[arrLength]; //this and below will make all arrays as large as possibly needed
        longestIncRun = new double[arrLength];
        longestDecRun = new double[arrLength];
        out.print("Type numbers with spaces in between >>> "); //puts whatever you type into the array in order
        for (int i = 0; i < doubArr.length; i++){
            double arrVar = console.nextDouble();
            doubArr[i] = arrVar;
        }
        arrMaxNum = doubArr[0];
        arrMinNum = doubArr[0];
        out.println();
        for (int i = 0; i < doubArr.length - 1; i++){ //finding largest number using Math.max
            if(doubArr.length - i == 1) break;
            arrMaxNum = max(doubArr[i], arrMaxNum);
        }
        out.println("Largest number: " + arrMaxNum);
        for (int i = 0; i < doubArr.length; i++){ //same as above, but with Math.min
            if(doubArr.length - i == 1) break;
            arrMinNum = min(doubArr[i], arrMinNum);
        }
        out.println("Smallest number: " + arrMinNum);
        for (int i = 0; i < doubArr.length; i++){ //getting total of all variables
            avg+= doubArr[i];
        }
        avg /= doubArr.length; //getting the average
        avg *= 10; //moving the decimal place to the right to round to the nearest tenth
        avg = round(avg);//rounding and then moving the decimal back to the OG pos
        avg /= 10;
        out.println("Average (rounded to tenth): " + avg);
        for (int i = 0; i < doubArr.length; i++){ //finding number of evens with modulo
            if((int) doubArr[i] % 2 == 0)
                numOfEvens++;
        }
        out.println("Number of Evens: " + numOfEvens);
        for (int i = 0; i < doubArr.length; i++){//getting longest repeat of same numbers
            if(doubArr.length - i == 1) break;
            if(doubArr[i] == doubArr[i+1]){ //if the number and its neighbor are the same
                if(repeatLength <= 0) //check if the comparison is at the start
                    repeatLength = 2;
                else
                    repeatLength++;
                repeatNum = doubArr[i]; //either way, it needs to be set
            }
            else{
                if(repeatLength > longestRepeatLength){ //check if the repeat length found above is longer than what was previously found
                    longestRepeatLength = repeatLength;
                    longestRepeatNum = repeatNum;
                }
                repeatNum = 0;//reset this and below to 0 so the program can evaluate more repeating nums later in the array
                repeatLength = 0;
            }
        }
        out.println("Longest repeat: " + longestRepeatNum + " is repeated " + longestRepeatLength + " times");
        for (int i = 0; i < doubArr.length; i++){ //longest Increasing run
            if(doubArr.length - i == 1) break;
            if(doubArr[i] < doubArr[i+1]){
                if(endOfRun > i){
                    
                }
            }
        }
    }
}