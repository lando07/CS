package Lab17;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Pendulum {
    void Lab17() {
        Scanner console = new Scanner(in);
        boolean keepCal = true;
        do {
            out.print("Enter pendulum length in meters (or 0 to quit) >>> ");
            double length = console.nextDouble();
            if (length == 0) {
                keepCal = false;
                continue;
            }
            double period = CalPeriod.periodCal(length);
            out.println("For a length of " + length + "m, the pendulum's period is " + period + " seconds.\n");
        } while (keepCal);
        out.println("Goodbye.");
    }
}
