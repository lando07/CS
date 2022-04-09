import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class WaffleIrons {
    private static final Scanner console = new Scanner(in);
    public static void main(String[] args){
        waffleIronsObj waffleCalc = new waffleIronsObj();
        int model = 0;
        int quantity = 0;
        while(model > -1){
            out.print("Enter model >>> ");
            model = console.nextInt();
            if(model < 0)
            continue;
            out.print("Enter quantity >>> ");
            quantity = console.nextInt();
            waffleCalc.calcSales(model, quantity);
            out.println();
        }
        out.println("\nTotal sales >>> $"+ waffleCalc.getTotal());
    }
}