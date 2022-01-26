import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args){
        Scanner console = new Scanner(in);

        //1
        out.print("Type something, will ya >>> ");
        String s = console.nextLine();
        out.println("That string is " + s.length() + " long.");

        //2
        out.print("Type something else >>> ");
        s = console.nextLine();
        out.println("Removing first character: " + s.substring(1));

        //3
        out.print("Type something else >>> ");
        s = console.nextLine();
        out.println("Removing last character: " + s.substring(0,s.length()-1));

        //4
        out.print("Type a word >>> ");
        String wordOne = console.nextLine();
        out.print("Type another word >>> ");
        String wordTwo = console.nextLine();
        for (int i = 1; i <= 2; i++){
            if(wordOne.length() > wordTwo.length()){
                out.print(wordTwo);
            }
            else{
                out.print(wordOne);
            }
            if (i == 2){
                break;
            }
            if(wordOne.length() < wordTwo.length()){
                out.print(wordTwo);
            }
            else{
                out.print(wordOne);
            }
        }
        out.println();

        //5
        out.print("Type a string to cut in half >>> ");
        s = console.nextLine();
        out.println("First half: " + s.substring(0,(int) Math.round(s.length()/2)));

        //6
        out.print("Type a word >>> ");
        String a = console.nextLine();
        a = a.substring(1,a.length());
        out.print("Type another word >>> ");
        String b = console.nextLine();
        b = b.substring(1,b.length());
        String c = a + b;
        out.println(c);

        //7
        //8
        out.print("Type something that might start with salsa >>> ");
        a = console.nextLine();
        a = a.substring(0,5);
        if (a.equalsIgnoreCase("salsa")){
            out.println("Yummy!");
        }

        //9
        out.print("Type something else >>> ");
        s = console.nextLine();
        out.println("Inside part: " + s.substring(1,s.length()-1));

        //10
        out.print("Type fish please >>> ");
        s = console.nextLine();
        if (!s.equalsIgnoreCase("fish"))
        out.println("Lame!");
        
        //11
        out.println("Type a string with an odd number of characters >>> ");
        String oddString = console.nextLine();
        out.println("Middle 3: " + oddString.substring((oddString.length()/2)-1,oddString.length()/2 + 2));
    }
}
