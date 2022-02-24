import static java.lang.System.*;
import java.util.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);
        String[] s = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        // String[] s = {"oeee", "Do", "What", "Now"};
        //1 see docx in folder for info
        //2
        out.println("The array has " + s.length + " elements.");

        //3
        out.print("The first letters of each String >>> ");
        for(int i = 0; i < s.length; i++){
            out.print(s[i].substring(0,1)+" ");
        }
        out.println();

        //4
        int numOfEsAtEnd = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i].charAt(s[i].length() - 1) == 'e')
                numOfEsAtEnd++;
        }
        out.println("Number of strings that end with 'e' >>> " + numOfEsAtEnd);

        //5
        int totalChars = 0;

        for (int i = 0; i < s.length; i++){
            totalChars += s[i].length();
        }
        out.println("Total number of characters in the array >>> " + totalChars);

        //6
        int numOfLongWords = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i].length() >= 7)
                numOfLongWords++;
            if(numOfLongWords >=2)
                break;
        }
        if(numOfLongWords >=2)
            out.println("I see some long words!");
        else
            out.println("Mostly short");

        //7 idk
        //8
        int numOfEs = 0;
        for (int i = 0; i < s.length; i++){
            for (int e = 0; e < s[i].length(); e++){
                if(s[i].charAt(e) == 'e')
                numOfEs++;
            }
        }
        out.println("The array contains " + numOfEs + " e's.");
        
        //9
        int numOfEStrs = 0;
        for (int i = 0; i < s.length; i++){
            if(s[i].indexOf("e") == -1)
            continue;
            numOfEStrs++;
        }
        out.println("Number of words with an 'e' >>> " + numOfEStrs);
    }
}
