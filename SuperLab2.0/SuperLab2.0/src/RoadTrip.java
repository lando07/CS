
//Name: 
import java.util.Scanner;


public class RoadTrip {

    public static void RT() {
        try (Scanner console = Objs.getScanner()) {
            System.out.println("Please enter information for my calculations.");
            System.out.print("Fuel economy >>> ");
            double fuelEconomy = console.nextDouble();
            console.nextLine();
            System.out.print("Total miles of trip >>> ");
            double tripMiles = console.nextDouble();
            console.nextLine();
            System.out.print("Anticipated average speed (mph) >>> ");
            double averageSpeed = console.nextDouble();
            console.nextLine();
            System.out.print("Avg. price of gas (per gallon) >>> $");
            double avgPriceOfGas = console.nextDouble();
            console.nextLine();
            System.out.println();

            System.out.println("Road trip calculations:");
            System.out.println("Gallons of gas used >>> " + (tripMiles / fuelEconomy));
            System.out.println("Total cost of gas >>> $" + ((tripMiles / fuelEconomy) * avgPriceOfGas));
            System.out.println("Total driving hours >>> " + (tripMiles / averageSpeed));
        }
    }
}