package Lab21;

import static java.lang.System.in;
import static java.lang.System.out;

//Name: 
import java.util.Random;
import java.util.Scanner;

public class SimpleHistogram {

    void Lab21() {
        Scanner console = new Scanner(in);
        Random rand = new Random();
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

    }
}