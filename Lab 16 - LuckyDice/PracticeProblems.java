import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);
        Random rand = new Random();
        //1
        out.print("Enter an integer >>> ");
        int integer = console.nextInt();
        out.print("Factors of "+integer+ " >>> ");
        for (long i = 1; i <= integer; i++){
            if(integer%i == 0){
                out.print(i+" ");
            }
        }
        out.println("\n");
        //2 done
        //3
        integer = rand.nextInt(11)+10;
        out.print("Factors of "+integer+ " >>> ");
        for (long i = 1; i <= integer; i++){
            if(integer%i == 0){
                out.print(i+" ");
            }
        }
        out.println("\n");
        //4
        out.println("Printing 15 random numbers between -5 and 5, inclusive.");
        for(int i = 1; i<=15; i++){
            int random = rand.nextInt(11) - 5;
            out.print(random + " ");
        }
        out.println("\n");

        //5
        out.print("Can I get them all? >>> ");
        boolean got31 = false, got32 = false, got33 = false;
        while(!got31 || !got32 || !got33){
            int random = rand.nextInt(3) + 31;
            out.print(random + " ");
            if(random == 31)
                got31 = true;
            else if(random == 32)
                got32 = true;
            else
                got33 = true;
        }
        out.println("\nGot them all!\n");

        //6
        out.print("Enter an integer to test for perfection >>> ");
        integer = console.nextInt();
        int num = 0;
        for (long i = 1; i <= integer; i++){
            if(num < integer){
                if(integer%i == 0){
                    num+=i;
                }
            }
        }
        if(num == integer)
            out.println(integer + " is perfect!");
        else
            out.println(integer + " is NOT perfect.");
        out.println();
        num=0;
        //7
        int compChoice;
        do{
            out.print("Choose: (1)ROCK (2)PAPER (3)SCISSORS (4)Quit >>> ");
            num = console.nextInt();
            compChoice = rand.nextInt(3)+1;
            if(compChoice == 1 && num == 1){
                out.println("Computer chooses ROCK. ROCK ties with ROCK. No winner.\n");
            }
            else if(compChoice == 1 && num == 2){
                out.println("Computer chooses ROCK. PAPER covers ROCK. YOU win!\n");
            }
            else if(compChoice == 1 && num == 3){
                out.println("Computer chooses ROCK. ROCK crushes SCISSORS. Computer wins!\n");
            }
            else if(compChoice == 2 && num == 1){
                out.println("Computer chooses PAPER. PAPER covers ROCK. Computer wins!\n");
            }
            else if(compChoice == 2 && num == 2){
                out.println("Computer chooses PAPER. PAPER ties with PAPER. No winner.\n");
            }
            else if(compChoice == 2 && num == 3){
                out.println("Computer chooses PAPER. SCISSORS cut PAPER. You win!\n");
            }
            else if(compChoice == 3 && num == 1){
                out.println("Computer chooses SCISSORS. ROCK crushes SCISSORS. You win!\n");
            }
            else if(compChoice == 3 && num == 2){
                out.println("Computer chooses SCISSORS. SCISSORS cut PAPER. Computer wins!\n");
            }
            else if(compChoice == 3 && num == 3){
                out.println("Computer chooses SCISSORS. SCISSORS ties with SCISSORS. No winner.\n");
            }
        }while(num<=3);
    }
}
