public class InventoryTester
{
    public static void main(String[] args)
    {
        //Make an empty garage.  Check the net worth and see if there is room to add an item.
        Inventory garage = new Inventory();
        System.out.println("Current inventory: \n" + garage);
        System.out.println("Net worth of inventory >>> $" + garage.netWorth());
        System.out.println("Can add an item to inventory? >>> " + garage.roomForNewItem() + "\n");

        //Create 3 items.  Print them to test the toString()
        Item birdCage = new Item("A decent bird cage", 45, "03/28/16");
        Item cookBook = new Item("A new pizza cookbook", 8.75, "03/31/16");
        Item hockeyStick = new Item("A new hockey stick", 31.50, "04/02/16");

        //Testing toString of Item
        System.out.println(birdCage);
        System.out.println(cookBook);
        System.out.println(hockeyStick + "\n");        

        //reconstruct garage as a new object, this time using parameters
        garage = new Inventory(birdCage, cookBook, hockeyStick);
        
        //Testing toString of Inventory
        System.out.println("Current inventory: \n" + garage);

        //Testing methods
        System.out.println("\nCan add an item to inventory? >>> " + garage.roomForNewItem());
        System.out.println("Net worth of inventory >>> $" + garage.netWorth() + "\n");

        //Testing more methods: selling items, adding items.
        System.out.println("Trying to add grill.");
        Item grill = new Item("A small charcoal grill", 20, "04/04/16");
        garage.setNewItem(grill, 2);  //should fail.
        System.out.println("Selling second item so we can add grill.");
        garage.setItemAsSold(2); 
        garage.setNewItem(grill, 2);
        System.out.println("NEW net worth of inventory >>> $" + garage.netWorth());
    }
}
