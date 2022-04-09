import static java.lang.System.out;

import java.util.Scanner;

public class WaffleIrons {
    public static void WI() {
        waffleIronsObj waffleCalc = new waffleIronsObj();
        try (Scanner console = Objs.getScanner()) {
            int model = 0;
            int quantity = 0;
            while (model > -1) {
                out.print("Enter model >>> ");
                model = console.nextInt();
                if (model < 0)
                    continue;
                out.print("Enter quantity >>> ");
                quantity = console.nextInt();
                waffleCalc.calcSales(model, quantity);
                out.println();
            }
            out.println("\nTotal sales >>> $" + waffleCalc.getTotal());
        }
    }
}