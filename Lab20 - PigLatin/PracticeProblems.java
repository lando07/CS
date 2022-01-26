import static java.lang.System.*;
import java.util.Scanner;
//Name: 

public class PracticeProblems
{
    private static final Scanner console = new Scanner(in);
    public static void main(String[] args)
    {    
        //1
        out.print("Type something, will ya >>> ");
        String str = console.nextLine();
        str = str.substring(0,str.length()-(str.length()-1)).toUpperCase() + str.substring(1);
        out.println(str+"\n");

        //2
        out.print("Type something, will ya >>> ");
        str = console.nextLine();
        str = str.toLowerCase();
        str = str.substring(0,str.length()-2) + str.substring(str.length()-2, str.length()).toUpperCase();
        out.println(str+"\n");

        //3
        int numOfE = 0;
        out.print("Type something, will ya >>> ");
        str = console.nextLine();
        for (int i=0; i < str.length(); i++){
            if(str.charAt(i) == 'e')
                numOfE++;
        }
        out.println("That string has " + numOfE + " e's.\n");

        //4
        String strFind = "hi";
        int lastIndex = 0, numOfHi = 0;
        out.print("Type something, will ya >>> ");
        str = console.nextLine();
        for (numOfHi = 0; lastIndex > -1; numOfHi++){
            lastIndex = str.indexOf("hi");
            if(lastIndex > -1)
                str = str.substring(lastIndex+ 1);
        }
        numOfHi -= 1;
        out.println("hi appears " + numOfHi + " times.\n");
        
        //5
        out.print("Enter a string >>> ");
        str = console.nextLine();
        out.print("Enter a target string >>> ");
        strFind = console.nextLine();
        if(str.indexOf(strFind) > -1)
        out.println("Found It!\n");
        else
        out.println("Nope\n");
        
        //6
        out.print("Enter a string >>> ");
        str = console.nextLine();
        out.print("Repeat how many last letters? >>> ");
        int num = console.nextInt();
        for(int i = 0; i < num; i++){
            out.print(str.substring(str.length() - num));
        }
        out.println("\n");
        
        //7 he forgot to pay his water bill
        
        //8
        out.print("Type your first and last name >>> ");
        String strArray[] = new String[2];
        strArray[0] = console.next() + " ";
        strArray[1] = console.next(); strArray[1] = strArray[1].toUpperCase();
        out.println(strArray[0] + strArray[1]+"\n");
        console.nextLine();
        
        //9
        out.print("Enter an email address >>> ");
        str = console.nextLine();
        str = str.substring(str.indexOf("@")+1);
        out.println(str);
        
        //10
        out.print("Enter a string with *'s >>> ");
        String brokString = console.nextLine();
        str = "";
        for(int i = 0; i < brokString.length(); i++){
            if(brokString.charAt(i) != '*'){
                str+= brokString.charAt(i);
            }
        }
        out.println(str);
    }

    public static void debugProblem(){
        //Put problem here to debug
        String str;
        
    }
}
