
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
import static java.lang.System.out;

import java.util.Scanner;


//Name: 

public class TShirtLauncher {

    public static void TShirtL() {
        try (Scanner console = Objs.getScanner()) {
            final double GRAV = 9.8;
            out.print("Enter launch velocity (m/s) >>> ");
            double velocity = console.nextDouble();
            out.print("Enter launch angle (degrees) >>> ");
            double angle = console.nextDouble();
            out.println("\nProjectile's path:");
            double xPos = 0, yPos = 0;
            int sec = 0;
            while (yPos >= 0) {
                out.println("Time: " + sec + " seconds");
                xPos = cos(toRadians(angle)) * sec * velocity;
                yPos = sin(toRadians(angle)) * sec * velocity - 0.5 * GRAV * pow(sec, 2);
                out.println("\tx-pos: " + xPos + " meters");
                if (yPos < 0) {
                    out.println("\ty-pos: 0.0 meters");
                    break;
                } else {
                    out.println("\ty-pos: " + yPos + " meters");
                }
                sec++;
            }
        }
    }
}
