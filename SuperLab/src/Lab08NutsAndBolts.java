public class Lab08NutsAndBolts {
    private Lab08NutsAndBolts() {
    }

    public static void Lab08() {
        final int BOLTPRICE, NUTPRICE, WASHERPRICE;
        boolean nutsMoreThanBolts = false;
        boolean doubleWasherMoreThanBolts = false;
        int price;
        BOLTPRICE = 5;
        NUTPRICE = 3;
        WASHERPRICE = 1;
        System.out.println("Welcome to my hardware store!");
        System.out.print("Number of bolts >>> ");
        int bolts = console.nextInt();
        console.nextLine();
        System.out.print("Number of nuts >>> ");
        int nuts = console.nextInt();
        console.nextLine();
        System.out.print("Number of washers >>> ");
        int washers = console.nextInt();
        console.nextLine();
        if (nuts >= bolts) {// the boolean values in the next 2 if statements were set false from the
                            // beginning, so nothing else is needed with these.
            nutsMoreThanBolts = true;
        }
        if (washers >= bolts * 2) {
            doubleWasherMoreThanBolts = true;
        }
        System.out.println();
        if (nutsMoreThanBolts == true && doubleWasherMoreThanBolts == true) {
            System.out.println("Order OK!");
        } else {
            if (nutsMoreThanBolts == false) {
                System.out.println("Warning! Check order: too few nuts");
            }
            if (doubleWasherMoreThanBolts == false) {
                System.out.println("Warning! Check order: too few washers");
            }
        }
        price = (bolts * BOLTPRICE) + (nuts * NUTPRICE) + (washers * WASHERPRICE);
        System.out.println("Total cost (in cents) >>> " + price);
    }
}