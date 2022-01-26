import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;
/**
 * Write a description of class CalPeriod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalPeriod
{
    public static double periodCal(double length){
        double period = (sqrt(length/9.8))*PI*2;
        period*=10;
        period = round(period);
        period/=10;
        return period;
    }
}
