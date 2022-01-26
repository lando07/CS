import java.util.*;
//Name: 

public class PracticeProblems
{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        //1
        System.out.print("Enter a whole number >>> ");
        int apples = console.nextInt();
        console.nextLine();
        if (apples > 0){
            System.out.println("That's positive!");
        }
        System.out.println();
        
        //2
        System.out.print("Enter a whole number >>> ");
        apples = console.nextInt();
        console.nextLine();
        if (apples > 0 && (apples%2) == 0){
            System.out.println("Omg. It's positive AND even!");
        }
        else{
            System.out.println("I don't like that number!");
        }
        System.out.println();

        //3
        int votingAge = 18;
        System.out.print("Enter your age >>> ");
        int actualAge = console.nextInt();
        console.nextLine();
        if (votingAge <= actualAge){
            System.out.println("You can vote.");
        }
        else{
            System.out.println("You can't vote.");
        }
        System.out.println();
        
        //4
        int angle1;
        int angle2;
        int angle3;
        boolean error = false;
        System.out.print("Enter angle #1 >>> ");
        angle1 = console.nextInt();
        console.nextLine();
        System.out.print("Enter angle #2 >>> ");
        angle2 = console.nextInt();
        console.nextLine();
        System.out.print("Enter angle #3 >>> ");
        angle3 = console.nextInt();
        console.nextLine();
        if(angle1 >=0 && angle2 >= 0 && angle3 >= 0){
            if(angle1 + angle2 + angle3 == 180){
                if (angle1 == angle2 && angle1 == angle3){
                    System.out.println("That's an equilateral triangle.");
                }
                else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3){
                    System.out.println("That's an isosceles triangle.");
                }
                else if (angle1 != angle2 || angle1 != angle3){
                    System.out.println("That's a scalene triangle.");
                }
                System.out.println();
            }
            else if (angle1 + angle2 + angle3 != 180){
                System.out.println("Error");
                System.out.println();
                error = true;
            }
        }
        else{
            if (error == false){
                System.out.println("Error");
                System.out.println();
            }
        }
    }
}
