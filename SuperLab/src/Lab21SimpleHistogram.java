import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

//Name: 

public class Lab21SimpleHistogram {
    private Lab21SimpleHistogram() {
    }

    public static void Lab21() {
        try {
            Scanner console = UnivObjs.getScanner();
            try {
                Random rand = UnivObjs.getRandom();
                int[] histogram = new int[10];
                out.print("How many single digit numbers should I generate? >> ");
                int toGen = console.nextInt();
                for (int i = 0; i < toGen; i++) {
                    int generated = rand.nextInt(10);
                    out.println("Simulation " + i + ": " + generated);
                    histogram[generated]++;
                }
                out.println("\n** Here's the final count **");
                for (int i = 0; i < 9; i++) {
                    out.println(i + "s found: " + histogram[i]);
                }

            } finally {
                // not needed for anything, but needed for the try up there
            }
        } finally {
        }
    }
}
