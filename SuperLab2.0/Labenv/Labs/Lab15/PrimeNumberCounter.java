package Lab15;

import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Name: 

public class PrimeNumberCounter {
    void Lab15() {
        Scanner console = new Scanner(in);
        int checkOrNoCheck;
        out.print("\u000c");
        out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
        checkOrNoCheck = console.nextInt();
        long primeCounter = 0;
        while (checkOrNoCheck == 1) {
            if (checkOrNoCheck == 1) {
                out.print("Please enter an integer to check >>> ");
                long integer = console.nextLong();
                double start = System.currentTimeMillis();
                primeCounter = 0;
                for (long i = 1; i <= integer; i++) {
                    boolean prime = true;
                    double sqRT = sqrt(i);
                    for (long e = 2; e <= sqRT + 1; e++) {
                        if (i % e == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime)
                        primeCounter++;
                }
                double end = System.currentTimeMillis();
                out.println(
                        "From 0 to " + integer + ", there is a total of " + primeCounter + " prime numbers and it took "
                                + (end - start) + " Milliseconds or " + (end - start) / 1000 + " seconds.");
            }
            out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
            checkOrNoCheck = console.nextInt();
        }
        out.println("Goodbye");
    }
}
