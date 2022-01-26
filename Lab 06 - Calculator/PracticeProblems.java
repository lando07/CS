
//Name: 

import java.util.*;

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //1
        int a;
        System.out.print("Enter a whole number >>> ");
        a = console.nextInt();
        console.nextLine();
        if (a == 9){
            System.out.println("Good number!");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println();
        }

        //2
        int b;
        System.out.print("Enter a whole number >>> ");
        b = console.nextInt();
        console.nextLine();
        if (b > 100) {
            System.out.println("that's a big number");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println();
        }

        //3
        int c;
        System.out.print("Enter a whole number >>> ");
        c = console.nextInt();
        console.nextLine();
        if (c == 0 || c == 1){
            System.out.println("binary!");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println();
        }

        //4

        //5
        int d;
        System.out.print("Enter a whole number >>> ");
        d = console.nextInt();
        console.nextLine();
        if (d != 4){
            System.out.println("that's not a 4");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println();
        }

        //6
        double e;
        System.out.print("Enter a number (decimals are okay) >>> ");
        e = console.nextDouble();
        console.nextLine();
        if (e > 10){
            System.out.println("big");
            System.out.println();
        }
        else {
            System.out.println("small");
            System.out.println();
        }

        //7
        int strength;
        int charm;
        int magic;
        int totalPoints;
        System.out.println("Welcome to Mr. McCoy's Quest for Salsa!");
        System.out.println("Assign stats to your character (max 15 points TOTAL)");
        System.out.print("Enter strength >>> ");
        strength = console.nextInt();
        console.nextLine();
        System.out.print("Enter charm >>> ");
        charm = console.nextInt();
        console.nextLine();
        System.out.print("Enter magic >>> ");
        magic = console.nextInt();
        console.nextLine();
        totalPoints = charm + magic + strength;
        if (totalPoints > 15){
            System.out.println("Point limit exceeded!  Default values assigned.");
            strength = 5;
            charm = 5;
            magic = 5;
        }
        System.out.println("strength = " + strength + ", charm = " + charm + ", magic = " + magic);
        
        //8 maybe a scab?
    }
}