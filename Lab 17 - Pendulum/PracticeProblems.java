import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
//Name: 

public class PracticeProblems
{
    public static void main(String[] args)
    {
        //1
        Scanner console = new Scanner(in);
        out.print("Enter a double >>> ");
        double a = console.nextDouble();
        out.print("Enter a double >>> ");
        double b = console.nextDouble();
        out.println("The bigger one number is " + max(a, b)+ "\n");
        
        //2
        out.print("Enter a double to cube >>> ");
        double toCube = console.nextDouble();
        out.println("The cube of " + toCube + " is " + pow(toCube,3)+ "\n"); 
        
        //3
        out.print("Enter a base >>> ");
        double base = console.nextDouble();
        out.print("Enter an exponent >>> ");
        double expo = console.nextDouble();
        out.println(base + "^" + expo + " = " + pow(base,expo)+ "\n");
        
        //4
        out.print("Enter a double to round >>> ");
        double num = console.nextDouble();
        out.println("If you round " + num + " you get " + round(num)+"\n");
        
        //5
        out.print("Enter a double to root >>> ");
        double num2 = console.nextDouble();
        out.println("The square root of " + num2 + " is " + sqrt(num2)+"\n");
        
        //6
        out.print("Enter sideA of a triangle >>> ");
        double sideA = console.nextDouble();
        out.print("Enter sideB of a triangle >>> ");
        double sideB = console.nextDouble();
        out.println("The hypotenuse is " + sqrt(pow(sideA, 2) + pow(sideB, 2))+"\n");
        
        //7 idk
        
        //8
        out.print("Enter cylinder radius >>> ");
        double cylRadius = console.nextDouble();
        out.print("Enter cylinder height >>> ");
        double cylHeight = console.nextDouble();
        out.println("Surface area is " + ((2*PI*cylRadius*cylHeight)+(2*PI*pow(cylRadius,2)))+"\n");
        
        //9
        out.print("Enter sphere diameter >>> ");
        double sphDiameter = console.nextDouble();
        double volume = pow(sphDiameter/2,3);
        volume *= (double) 4/3;
        volume *= PI;
        out.println("Volume is " + volume +"\n");
    }
}
