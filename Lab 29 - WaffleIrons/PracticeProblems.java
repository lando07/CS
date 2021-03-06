import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.Math.pow;
import java.util.Scanner;

public class PracticeProblems{
    private static final Scanner console = new Scanner(in);
    public static void main(String[] args){
        out.print("Which of the following will declare and initialize a variable in Java?"+
            "\n1. int 2a = 4;\n2. double circle-area = 5.78;\n3. string s = hello!;\n4. boolean whoa_now = true;\nAnswer? >>> ");
        switch(console.nextInt()){
            case 1:
            case 2:
            case 3:
            out.println("Incorrect");
            break;
            case 4:
            out.println("Correct");
            break;
            default:
            out.println("Invalid choice");
        }
        out.print("\nMath time!\nEnter first number >>> ");
        double num1 = console.nextDouble();
        out.print("Enter second number >>> ");
        double num2 = console.nextDouble();
        out.print("Operation? (1)+  (2)-  (3)*  (4)/  (5)%  (6)exp  >>> ");
        int op = console.nextInt();
        double newNum = 0;
        switch(op){
            case 1:
            newNum = num1+num2;
            break;
            case 2:
            newNum = num1-num2;
            break;
            case 3:
            newNum = num1*num2;
            break;
            case 4:
            newNum = num1/num2;
            break;
            case 5:
            newNum = num1%num2;
            break;
            case 6:
            newNum = pow(num1,num2);
        }
        out.print("The answer is >>> " + newNum+'\n'+
            "\nMaking a PB&J sandwich? Which step are you stuck on? >>> ");
        int step = console.nextInt();
        out.println("Here's what you still need to do:");
        switch(step){
            case 1:
            out.println("1) Get 2 pieces of bread, a jar of peanut butter and a jar of jelly. ");
            case 2:
            out.println("2) Open both jars.");
            case 3:
            out.println("3) Spread peanut butter on 1 piece of bread.");
            case 4:
            out.println("4) Spoon jelly onto the other piece of bread.");
            case 5:
            out.println("5) Put bread together so that the peanut butter and jelly are touching.");
            case 6:
            out.println("6) Give the sandwich to your dog and feast on a much better food. Salsa!");
        }
    }
}