
//Name: 

import java.util.*;
public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        System.out.print("Enter a whole number >>> ");
        int num1 = console.nextInt();
        console.nextLine();
        num1 += 10;
        System.out.print("Ten more than that is " + num1);
        System.out.println();
        System.out.println();
        
        //2
        System.out.print("What is your name? >>> ");
        String name1 = console.nextLine();
        System.out.print("Hello, " + name1 + "!");
        System.out.println();
        System.out.println();
        
        //3
        System.out.print("Enter a number with a decimal >>> ");
        double something = console.nextDouble();
        console.nextLine();
        something = something*something;
        System.out.print("That number squared is " + something);
        System.out.println();
        System.out.println();
        
        //4 My name
        
        //5
        System.out.print("Type a name >>> ");
        String name2 = console.nextLine();
        System.out.print("Type an age >>> ");
        int age = console.nextInt();
        console.nextLine();
        System.out.print(name2 + " is " + age + " years old.");
        System.out.println();
        System.out.println();
        
        //6
        
        System.out.print("Enter the radius of a circle (decimals are allowed) >>> ");
        double radius = console.nextDouble();
        final double PI = 3.14159;
        console.nextLine();
        double circleArea = (radius*radius)*PI;
        System.out.print("The area of that circle is " + circleArea);
        System.out.println();
        System.out.println();
        
        //7
        System.out.print("Enter the number of seconds of free fall >>> ");
        double time = console.nextDouble();
        console.nextLine();
        final double ACCELERATION = 32.174;
        double distanceTraveled = 0.5*ACCELERATION*(time*time);
        System.out.print("Distance traveled (in feet) >>> " + distanceTraveled);
        System.out.println();
        System.out.println();
        //8
        System.out.print("Who is your favorite person? >>> ");
        name1 = console.nextLine();
        System.out.print(name1 + name1 + name1);
    }
}
