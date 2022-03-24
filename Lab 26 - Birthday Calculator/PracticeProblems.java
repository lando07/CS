import static java.lang.System.out;
import static java.lang.Math.*;
import java.util.*;
//Name: 

public class PracticeProblems
{
    public static void main(String[] args){
        out.println("Grade of 80 is a " + letterGrade(80)+"\nGrade of 62.3 is a " + letterGrade(62.3)+"\nGrade of 105 is a " + letterGrade(105)+'\n');
        out.println("Printing a size 2 square");
        squareBoard(2);
        out.println("Printing a size 3 square");
        squareBoard(3);
        out.println();
        out.println("Printing a size 3 checkerboard");
        checkerBoard(3);
        out.println();
        out.println("Here are the first 2 powers of 2");
        printPow2(2);
        out.println("Here are the first 3 powers of 2");
        printPow2(3);
        out.println();
        out.println("Roots using 1.0, 2.0, 1.0: "+Arrays.toString(quad(1,2,1)));
        out.println("Roots using 1.0, 1.0, -4.0: "+Arrays.toString(quad(1,1,-4)));
        out.println("Roots using 1.0, -2.0, -4.0: " + Arrays.toString(quad(1,-2,-4))+'\n');
        out.println("Converting 24.2 C to F: " + convertTemp(24.2,false)+"\nConverting 86 F to C: "+convertTemp(86,true)+'\n');
        out.println("My array is [7, 6, 9, 4, 3, 7, 2]");
        int[] arr = {7,6,9,4,3,7,2};
        out.println("Searching for 7.\tLocation: "+simpleSearch(arr, 7)+"\nSearching for 3.\tLocation: "+simpleSearch(arr,3)+"\nSearching for 5.\tLocation: "+simpleSearch(arr,5)+'\n');
        out.println("Print 123 in reverse: " + printReverse(123)+"\nPrint 3674 in reverse: "+printReverse(3674));
        out.println("Is [1, 2, 3] found in [1, 2, 1, 2, 3]? "+ contains(new int[]{1,2,1,2,3},new int[]{1,2,3}));
        out.println("Is [1, 2, 3, 4] found in [1, 2, 1, 2, 3]? " + contains(new int[]{1,2,1,2,3}, new int[]{1,2,3,4}));
    }

    public static String letterGrade(double grade){
        if(grade > 89)
            return "A";
        else if(grade > 79)
            return "B";
        else if(grade > 72)
            return "C";
        else
            return "F";
    }

    public static void squareBoard(int size){
        for (int i = 0; i<size; i++){
            for (int e = 0; e<size; e++){
                out.print("# ");
            }
            out.println();
        }
    }

    public static void checkerBoard(int size){
        boolean stagger = false;
        for (int i = 0; i<size; i++){
            if(stagger)
                out.print(" ");
            for (int e = 0; e<size; e++){
                out.print("# ");
            }
            out.println();
            stagger = !stagger;
        }
    }

    public static void printPow2(int pow){

        for(int i = 0; i <pow; i++){
            out.println("2^"+i+" = "+(int)pow(2,i));
        }
    }

    public static double[] quad(double a, double b, double c){
        double[] quadRoot = new double[2];
        quadRoot[0] = (double)((0-b)+sqrt(pow(b,2)-(4*a*c)))/(2*a);
        quadRoot[1] = (double)((0-b)-sqrt(pow(b,2)-(4*a*c)))/(2*a);
        return quadRoot;
    }

    public static double convertTemp(double temp, boolean isF){
        if(isF)
            return (temp - 32)*(5/9.0);
        else
            return (temp*(9/5.0)) + 32;
    }

    public static int simpleSearch(int[] nums, int value){
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == value)
                return i;
        }
        return -1;
    }

    public static int printReverse(int num){
        int reverse = 0;
        while(num != 0){
            reverse = reverse*10+(num%10);
            num/=10;
        }
        return reverse;
    }

    public static boolean contains(int[] a, int[] b){
        boolean brokeEarly = false;
        for(int i = 0; i < a.length; i++){
            if(a.length - 1 == i)
            return false;
            if(a[i] == b[0]){
                for (int e = 0; e < b.length; e++){
                    if(i+e >= a.length)
                    return false;
                    if(b[e] == a[i+e]){
                        continue;
                    }
                    else{
                        brokeEarly = true;
                        break;
                    }
                }
                if(!brokeEarly){
                    return true;
                }
                brokeEarly = false;
            }
        }
        return false;
    }
}
