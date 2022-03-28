import static java.lang.Math.*;
/**
 * Write a description of class ArrAnlyzr_obj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrAnalyzer_obj
{
    private double[] doubArr;
    public ArrAnalyzer_obj(double[] usrArr)
    {
        doubArr = usrArr;
    }

    double getLargestNum(){
        double max = 0;
        for (int i = 0; i < doubArr.length - 1; i++){ //finding largest number using Math.max
            if(doubArr.length - i == 1) break;
            max = max(doubArr[i], max);
        }
        return max;
    }

    double getSmallestNum(){
        double min = 1;
        for (int i = 0; i < doubArr.length; i++){ //same as above, but with Math.min
            if(doubArr.length - i == 1) break;
            min = min(doubArr[i], min);
        }
        return min;
    }

    double getAvg(){
        double sum = 0;
        for (int i = 0; i < doubArr.length; i++){ //getting total of all variables
            sum+= doubArr[i];
        }
        return (double) round((sum/doubArr.length)*10)/10;
    }

    int getNumOfEvens(){
        int evensFound = 0;
        for (int i = 0; i < doubArr.length; i++){ //finding number of evens with modulo
            if((int) doubArr[i] % 2 == 0)
                evensFound++;
        }
        return evensFound;
    }

    double[] getLongestRepeat(){
        double repeatNum = 0, longestRepeatNum = 0;
        int repeatLength = 0, longestRepeatLength = 0;
        double[] lngstRptAttrib = new double[2];
        for (int i = 0; i < doubArr.length; i++){//getting longest repeat of same numbers
            if(doubArr.length - i == 1) break;
            if(doubArr[i] == doubArr[i+1]){ //if the number and its neighbor are the same
                if(repeatLength <= 0)
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
                repeatNum = 0;
                repeatLength = 0;
            }
        }
        lngstRptAttrib[0] = longestRepeatNum;
        lngstRptAttrib[1] = longestRepeatLength;
        return lngstRptAttrib;
    }

    int[] getLngstIncRun(){
        int localRunLength = 0, localRunStart = 0,localRunEnd, backupRunStrt = 0;
        int longestRunLength = 0, longestRunStart, longestRunEnd;
        int startOfRun = 0, endOfRun = 0, runParams[];
        runParams = new int[2];
        for (int i = 0; i < doubArr.length; i++){ //longest Increasing run
            if(doubArr.length - i == 1) break;
            if(doubArr[i] < doubArr[i+1]){
                if(localRunLength <=0){
                    localRunLength = 2;
                    localRunStart = i;
                    backupRunStrt = i;
                }
                else
                    localRunLength++;
            }
            else{
                localRunEnd = i;
                if(localRunLength > longestRunLength){
                    longestRunLength = localRunLength;
                    startOfRun = localRunStart;
                    endOfRun = localRunEnd;
                }
                localRunStart = 0;
                localRunEnd = 0;
                localRunLength = 0;
            }
        }
        if(endOfRun == 0){
            endOfRun = doubArr.length - 1;
            startOfRun = backupRunStrt;
        }
        runParams[0] = startOfRun;
        runParams[1] = endOfRun;
        return runParams;
    }

    int[] getLngstDecRun(){
        int localRunLength = 0, localRunStart = 0,localRunEnd, backupRunStrt = 0;
        int longestRunLength = 0, longestRunStart, longestRunEnd;
        int startOfRun = 0, endOfRun = 0, runParams[];
        runParams = new int[2];
        for (int i = 0; i < doubArr.length; i++){ //longest decreasing run
            if(doubArr.length - i == 1) break;
            if(doubArr[i] > doubArr[i+1]){
                if(localRunLength <=0){
                    localRunLength = 2;
                    localRunStart = i;
                    backupRunStrt = i;
                }
                else{
                    localRunLength++;
                }
            }
            else{
                localRunEnd = i;
                if(localRunLength > longestRunLength){
                    longestRunLength = localRunLength;
                    startOfRun = localRunStart;
                    endOfRun = localRunEnd;
                }
                localRunStart = 0;
                localRunEnd = 0;
                localRunLength = 0;
            }
        }
        if(endOfRun < startOfRun){
            endOfRun = startOfRun - 2;
            startOfRun = 0;
        }
        runParams[0] = startOfRun;
        runParams[1] = endOfRun;
        return runParams;
    }
}
