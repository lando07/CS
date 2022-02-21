import static java.lang.System.*;
import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args){
        Scanner console = new Scanner(in);
        //int[] nums = {2, 4, 0, 8, 6, 2, 3, 5, 9, 0, 9, 6};
        int[] nums = {2,2,4,4,4};

        //1
        out.println("Last element is " + nums[nums.length - 1]);

        //2
        out.println("Number of elements is " + nums.length);

        //3
        for (int i = 0; i < nums.length; i++){
            out.print(nums[i] + " ");
        }
        out.println();

        //4
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        out.println("Sum of all numbers is " + sum);

        //5
        boolean hasOdd = false;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                hasOdd = true;
                out.println("Contains an odd");
                break;
            }
        }
        if (!hasOdd)
            out.println("Odd free");

        //6
        boolean hasZero = false;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                hasZero = true;
                out.println("Found a zero");
                break;
            }
        }
        if (!hasZero)
            out.println("No zeros");

        //7 idk

        //8
        int numOf6s = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 6)
                numOf6s++;
        }
        if(numOf6s >= 2)
            out.println("Plenty of 6s");
        else
            out.println("Less than two 6s");

        //9
        boolean Combo2_3 = false;
        for (int i = 0; i < nums.length; i++){ 
            if(nums[i] == 2 && nums[i+1] == 3){
                Combo2_3 = true;
                out.println("Found 2-3 combo");
                break;
            }
            if(nums.length - i == 1) break;
        }
        if(!Combo2_3)
            out.println("No 2-3 combo");

        //10
        boolean Combo3InARow = false;
        for (int i = 0; i < nums.length; i++){
            int e = nums[i];
            if(nums[i] == e && nums[i+1] == e && nums[i+2] == e){
                Combo3InARow = true;
                out.println("Three in a row");
                break;
            }
            if(nums.length - i == 2) break;
        }
        if(!Combo3InARow)
            out.println("No three in a row");
    }
}