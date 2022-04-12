import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class CalculatorRunner{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner console = new Scanner(in);
        char goAgain;
        do{
            out.print('\u000c');
            out.print("Type first number >>> ");
            calc.setNumber1(console.nextDouble());
            out.print("Type second number >>> ");
            calc.setNumber2(console.nextDouble());
            calc.displayChoices();
            out.print("Which operation? >>> ");
            calc.setOperation(console.nextInt());
            out.println(calc.getProblem() + " = " + calc.getAnswer() + '\n');
            out.print("Perform another calculation? (y/n) >>> ");
            goAgain = console.next().toLowerCase().charAt(0);
        }while(goAgain == 'y');
    }
}