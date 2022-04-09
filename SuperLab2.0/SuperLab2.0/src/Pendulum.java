
import static java.lang.System.out;

import java.util.Scanner;


public class Pendulum {
    public static void pendulum() {
        try (Scanner console = Objs.getScanner()) {
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

    private Pendulum() {

    }
}
