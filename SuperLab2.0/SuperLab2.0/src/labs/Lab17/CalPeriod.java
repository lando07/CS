package labs.Lab17;

import static java.lang.Math.PI;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/**
 * Write a description of class CalPeriod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalPeriod {
    protected static double periodCal(double length) {
        double period = (sqrt(length / 9.8)) * PI * 2;
        period *= 10;
        period = round(period);
        period /= 10;
        return period;
    }

    private CalPeriod() {

    }
}
