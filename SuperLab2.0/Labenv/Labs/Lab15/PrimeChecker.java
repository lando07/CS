package Lab15;

import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Name: 

public class PrimeChecker {
    void Lab15() {
        Scanner console = new Scanner(in);
        int checkOrNoCheck;
        out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
        checkOrNoCheck = console.nextInt();
        while (checkOrNoCheck == 1) {
            if (checkOrNoCheck == 1) {
                out.print("Please enter an integer to check >>> ");
                long integer = console.nextInt();
                boolean prime = true;
                double sqRT = sqrt(integer);
                for (long i = 2; i < sqRT + 1; i++) {
                    if (integer % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    out.println(integer + " is a prime number\n");

                else {
                    out.println(integer + " is NOT a prime number\n");
                }
                out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
                checkOrNoCheck = console.nextInt();
            }
        }
        out.println("Goodbye");
    }
}
