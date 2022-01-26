
//Name: 
import static java.lang.System.out;

public class Lab13HailstoneSeries {
    private Lab13HailstoneSeries() {
    }

    public static void Lab13() {
        long num, i = 0;
        out.print("Enter an integer from 1 to 1000 >>> ");
        num = UnivRefs.console.nextLong();
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
