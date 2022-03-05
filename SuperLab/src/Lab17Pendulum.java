import static java.lang.System.out;
import java.util.Scanner;

public class Lab17Pendulum {
    private Lab17Pendulum() {
    }

    public static void Lab17() {
        try (Scanner console = UnivObjs.getScanner()) {
            boolean keepCal = true;
            do {
                out.print("Enter pendulum length in meters (or 0 to quit) >>> ");
                double length = console.nextDouble();
                if (length == 0) {
                    keepCal = false;
                    continue;
                }
                double period = Lab17CalPeriod.periodCal(length);
                out.println("For a length of " + length + "m, the pendulum's period is " + period + " seconds.\n");
            } while (keepCal);
            out.println("Goodbye.");
        }
    }
}
