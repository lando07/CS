import static java.lang.System.out;
import java.util.*;

public class PiCalculator
{
    public static void main(String[] args){
        out.println("Series of 10 >>> " + approximatePi(10));
        out.println("Series of 1000 >>> " + approximatePi(1000));
    }

    public static double approximatePi(int precision){
        double temp = 1;
        boolean subtract = true;
        if(precision == 1)
            return 4.0;
        for (int i = 3; i < precision*2; i+=2){
            if(subtract)
                temp -= (double)1/i;
            else
                temp += (double)1/i;
            subtract = !subtract;
        }
        return 4*temp;
    }
}
