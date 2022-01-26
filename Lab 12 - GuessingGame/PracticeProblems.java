import java.util.*;
//Name: 

public class PracticeProblems
{
    public static void main(String[] args)
    {
        //1
        int n;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer >>> ");
        n = console.nextInt();
        console.nextLine();
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        //2
        System.out.print("Enter an integer from 1 to 1000 >>> ");
        n = console.nextInt();

        int sum = 0;
        i = 1;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of all numbers from 1 to " + n + " >>> " + sum);
        System.out.println();

        //3
        System.out.print("Enter an integer from 1 to 1000 >>> ");
        n = console.nextInt();
        console.nextLine();
        i = 1;
        sum = 0;
        while (i <= n){
            if (i%2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of all even numbers from 1 to " + n + " >>> " + sum);
        System.out.println();

        //4
        System.out.print("Enter an integer from 1 to 1000 >>> ");
        n = console.nextInt();
        console.nextLine();
        i = 1;
        sum = 0;
        while (i <= n){
            if (i%7 == 0){
                sum +=i;
            }
            i++;
        }
        System.out.println("Sum of all multiples of 7 from 1 to " + n + " >>> " + sum);
    }
}
