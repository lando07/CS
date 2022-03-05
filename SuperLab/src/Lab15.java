import java.util.Scanner;
//Name: 
import static java.lang.Math.sqrt;
import static java.lang.System.console;
import static java.lang.System.getProperty;
import static java.lang.System.out;

public class Lab15 {
    private Lab15() {
    }

    public static void Lab15PrimChec() {
        try (Scanner console = UnivObjs.getScanner()) {
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

    // TODO fix lab 15 PNC
    public static void Lab15PNC() {
        refs = getInstance();
        int checkOrNoCheck;
        if (console() != null) {
            String os = getProperty("os.name").toLowerCase();
            if (os.contains("windows")) {
                refs.cls();
            } else {
                // run for other os' besides windows
                refs.termClear();
            }
        } else {
            refs.bluejClear();
        }
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
