import static java.lang.System.*;
import java.util.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);
        int[] nums =  {9, 8, 2, 4, 0, 8, 6, 2};

        //1
        out.println(nums[0]);

        //2
        out.println(nums[1]);

        //3 no

        //4
        out.println(nums[4] == 6);

        //5
        int ans = 0;
        while(ans!=nums[5]){
            out.print("Guess what's in the 6th spot >>> ");
            ans = console.nextInt();
            console.nextLine();
        }

        //6
        nums[3] = 50;
        out.println(nums[3]);

        //7
        nums[7] *= 2;
        out.println(nums[7]);

        //8
        nums[2] = nums[0] + 10;
        out.println(nums[2]);

        //9
        out.println(Arrays.toString(nums));

        //10
        double[] otherNums = new double[4];
        out.println(Arrays.toString(otherNums));

        //11
        otherNums[0] = 1.2;
        otherNums[1] = 3.4;
        otherNums[2] = 5.6;
        otherNums[3] = 7.8;
        out.println(Arrays.toString(otherNums));
    }
}
