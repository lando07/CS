
//Name: 

public class Lab05RoadTrip {
    private Lab05RoadTrip() {
    }

    public static void Lab05() {
        System.out.println("Please enter information for my calculations.");
        System.out.print("Fuel economy >>> ");
        double fuelEconomy = UnivRefs.console.nextDouble();
        UnivRefs.console.nextLine();
        System.out.print("Total miles of trip >>> ");
        double tripMiles = UnivRefs.console.nextDouble();
        UnivRefs.console.nextLine();
        System.out.print("Anticipated average speed (mph) >>> ");
        double averageSpeed = UnivRefs.console.nextDouble();
        UnivRefs.console.nextLine();
        System.out.print("Avg. price of gas (per gallon) >>> $");
        double avgPriceOfGas = UnivRefs.console.nextDouble();
        UnivRefs.console.nextLine();
        System.out.println();

        System.out.println("Road trip calculations:");
        System.out.println("Gallons of gas used >>> " + (tripMiles / fuelEconomy));
        System.out.println("Total cost of gas >>> $" + ((tripMiles / fuelEconomy) * avgPriceOfGas));
        System.out.println("Total driving hours >>> " + (tripMiles / averageSpeed));
    }
}