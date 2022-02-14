import static java.lang.System.*;
import java.util.*;
//Name: 

public class Lab21SimpleHistogram {
    private Lab21SimpleHistogram() {
    }

    public static void Lab21() {
        Random rand = new Random();
        int[] histogram = new int[10];
        out.print("How many single digit numbers should I generate? >> ");
        int toGen = UnivRefs.console.nextInt();
        for (int i = 0; i < toGen; i++) {
            int generated = rand.nextInt(10);
            out.println("Simulation " + i + ": " + generated);
            histogram[generated]++;
        }
        out.println("\n** Here's the final count **");
        for (int i = 0; i < 9; i++) {
            out.println(i + "s found: " + histogram[i]);
        }

    }
}
