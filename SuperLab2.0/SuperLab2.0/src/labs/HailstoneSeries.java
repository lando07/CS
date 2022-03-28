package labs;

//Name: 
import static java.lang.System.out;

import java.util.Scanner;

public class HailstoneSeries {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long num, i = 0;
        out.print("Enter an integer from 1 to 1000 >>> ");
        num = console.nextLong();
        while (num > 1) {
            out.println(num);
            if (num % 2 == 0)
                num /= 2;
            else
                num = 3 * num + 1;
            i++;
        }
        if (num == 1) {
            out.println(num);
            out.println("Series took " + i + " steps to reach a value of 1");
        } else
            out.println("integer overflow");
    }
}
