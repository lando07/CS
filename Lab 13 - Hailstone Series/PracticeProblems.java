import java.util.*;
import static java.lang.System.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);
        //1
        int num;
        int i = 0;
        out.print("Enter an integer >>> ");
        num = console.nextInt();
        while (num>i){
            out.print("salsa ");
            i++;
        }
        out.println("\n");

        //2
        i=0;
        num=0;
        out.print("Enter a new integer >>> ");
        num = console.nextInt();
        console.nextLine();
        int a = 0;
        while (num >i){
            a=0;
            while(num >a){
                out.print("salsa ");
                a++;
            }
            out.println();
            i++;
        }
        out.println();

        //3
        boolean seeMessageAgain = true;
        while (seeMessageAgain){
            out.print("Want to see this message again? (true or false) >>> ");
            seeMessageAgain = console.nextBoolean();
        }
        out.println("Very well. I was getting bored with this anyway.\n");

        //4
        num = 0;
        i=0;
        a=0;
        out.print("Enter first integer (or 0 to quit) >>> ");
        i = console.nextInt();
        num += i;
        while (i != 0){
            out.print("Enter another integer (or 0 to quit) >>> ");
            i = console.nextInt();
            num += i;
        }
        if (num == 0)
            out.println("No integers entered. Thanks for nothing, skrub.");
        else
            out.println("Sum of integers >>> " + num);
        out.println();

        //5 idk

        //6
        double potency = 100;
        int month = 0;
        out.print("Month: " + month + "\t" + "Potency: " + potency);
        do{
            potency -= potency*0.07;
            month ++;
            out.println();
            out.print("Month: " + month + "\t" + "Potency: " + potency);
        }while (potency >= 50);
        out.print(" <<< DISCARD");
    }
}
