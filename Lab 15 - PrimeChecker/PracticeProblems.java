import java.util.*;
import static java.lang.System.*;
//Name: 

public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);
        //1
        for(int i = 1; i<=9; i++){
            out.print(i);
        }
        out.println();
        
        //2
        for (int i = 1; i<=9; i++){
            out.print(i + " ");
        }
        out.println();
        
        //3
        for (int i = 2; i<=20; i+=2){
            out.print(i + " ");
        }
        out.println();
        
        //4
        for (int i = 20; i<=25; i++){
            out.print(i + " ");
        }
        out.println();
        
        //5
        for (int i = 20; i<=90; i+=10){
            out.print(i + " ");
        }
        out.println();
        
        //6 idk
        
        //7
        for (int i = 0; i>=-10; i--){
            out.print(i + " ");
        }
        out.println("\n");
        
        //8
        out.print("Enter an integer >>> ");
        int num = console.nextInt();
        for (int i = 1; i <= num; i++){
            out.print("* ");
        }
        out.println("\n");
        
        //9
        num = 1;
        for (int i = 1; i <= 100; i+=num){
            out.print(i + " ");
            num+=2;
        }
        out.println();
        
        //10
        for (int i = 1; i<=16; i++){
            if(i%3 == 0)
            out.print("? ");
            else
            out.print(i + " ");
        }
        out.println();
        
        //11
        out.print("Enter an integer from 1 to 9 >>> ");
        num = console.nextInt();
        int x = 1;
        for (int i = 1; i <= num; i++){
            x*=i;
        }
        out.println(num + "! is " + x);
    }
}
