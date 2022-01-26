import java.util.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //1
        int leftPressure;
        int rightPressure;
        System.out.print("Enter left tire pressure (as whole num) >>> ");
        leftPressure = console.nextInt();
        console.nextLine();
        System.out.print("Enter right tire pressure (as whole num) >>> ");
        rightPressure = console.nextInt();
        console.nextLine();
        if (leftPressure < 36 || rightPressure < 36){
            System.out.println("Warning! Low tire pressure");
        }
        System.out.println();

        //2
        int pressureDiff = 0;
        System.out.print("Enter new left tire pressure (as whole num) >>> ");
        leftPressure = console.nextInt();
        console.nextLine();
        System.out.print("Enter new right tire pressure (as whole num) >>> ");
        rightPressure = console.nextInt();
        console.nextLine();
        if(leftPressure < rightPressure){
            pressureDiff = rightPressure - leftPressure;
        }
        else if (leftPressure > rightPressure){
            pressureDiff = leftPressure - rightPressure;
        }
        if (pressureDiff >= 4){
            System.out.println("Warning! Uneven tire pressure");
        }
        System.out.println();

        //3

        //4
        double grade;
        System.out.print("Enter your grade >>> ");
        grade = console.nextDouble();
        if (grade >= 90){
            System.out.println("Letter grade for " + grade + " >>> A");
        }
        else if (grade <= 89 && grade >=80){
            System.out.println("Letter grade for " + grade + " >>> B");            
        }
        else if (grade <= 79 && grade >= 70){
            System.out.println("Letter grade for " + grade + " >>> C");
        }
        else {
            System.out.println("Letter grade for " + grade + " >>> F");
        }
        System.out.println();

        //5
        int num;
        System.out.print("Enter a whole number to round >>> ");
        num = console.nextInt();
        console.nextLine();
        if (num % 10 >= 5){
            num += (10 - (num%10));
            System.out.println("Rounded to nearest 10 >>> " + num);
        }
        else if (num % 10 < 5){
            num -= num%10;
            System.out.println("Rounded to nearest 10 >>> " + num);
        }
    }
}