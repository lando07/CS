import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);

        //1
        out.print("Enter a double for x >>> ");
        double x = console.nextDouble();
        out.print("Enter a double for y >>> ");
        double y = console.nextDouble();
        int ans = (int) (PI*(pow(x,6) - pow(y,6)));
        out.println("Using formula in problem 1, the answer is about " + ans+"\n");

        //2
        out.print("Enter a double for r >>> ");
        double r = console.nextDouble();
        double ansD = (double) 4/3*PI*pow(r,3);
        out.println("Using formula in problem 2, the answer is "+ansD+"\n");

        //3
        out.print("Enter a double for z >>> ");
        double z = console.nextDouble();
        ansD = abs(pow(z,4) - 1);
        out.println("Using formula in problem 3, the answer is " + ansD+"\n");

        //4
        out.print("Enter a double for x >>> ");
        x = console.nextDouble();
        ansD = log10(abs(1+x));
        out.println("Using formula in problem 4, the answer is " + ansD+"\n");

        //5
        out.print("Enter a double for x >>> ");
        x = console.nextDouble();
        ans = (int) (pow(x,2)*pow(E,x));
        out.println("Using formula in problem 5, the answer is about "+ans+"\n");

        //6
        out.print("Enter a double for a >>> ");
        double a = console.nextDouble();
        out.print("Enter a double for b >>> ");
        double b = console.nextDouble();
        ansD = sqrt(pow(a,2)-pow(b,2));
        out.println("Using formula in problem 6, the answer is "+ ansD+"\n");

        //7
        //8       
        out.print("Enter a runway bearing (as whole num) >>> ");
        double bearing = console.nextDouble();
        bearing/=10;
        bearing = round(bearing);
        out.println("Oh, you're talking about Runway "+ (int) bearing+"\n");

        //9
        out.print("Enter three integers (separated by spaces) >>> ");
        int i = console.nextInt();
        int j = console.nextInt();
        int k = console.nextInt();
        console.nextLine();
        out.println("The smallest of those 3 numbers is " + min(min(i,j),k)+"\n");;
    }
}
