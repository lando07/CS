import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class InventoryRunner{
    public static void main(String[] args){
        RunnerObj runner = new RunnerObj();
        try(Scanner console = runner.getScanner()){
            do{
                out.print('\u000c');
                runner.printCurrentInventory();
                runner.printOptions();
                console.nextLine();
                switch(runner.getOpt()){
                    case 1:
                        setNewItem(runner, console);
                        break;
                    case 2:
                        removeOldItem(runner, console);
                        break;
                    case 3:
                        getNetWorth(runner);
                        break;
                    default:
                        continue;
                }
                out.println("\n\nPress enter to continue...\n");
                console.nextLine();
            }while(runner.getOpt() != 4);
        }
    }

    private static void setNewItem(RunnerObj runner, Scanner console){
        if(runner.getGarage().roomForNewItem()){
            String desc, date;
            double cost;
            out.print("New item name/description >>> ");
            desc = console.nextLine();
            out.print("New item cost >>> $");
            cost = console.nextDouble();
            console.nextLine();
            out.print("New item date of listing >>> ");
            date = console.nextLine();
            out.print("Where in the garage will you store this? (1-3) >>> ");
            runner.setSlotNum(console.nextInt());
            runner.addItem(desc, cost, date);
        }
        else{
            out.println("\nCan't add item. Inventory is full.");

        }
    }

    private static void removeOldItem(RunnerObj runner, Scanner console){
        out.print("Which item did you sell? (1-3) >>> ");
        runner.setSlotNum(console.nextInt());
        runner.removeItem();
        out.print("Item from spot "+runner.getSlotNum()+" is now gone.");
    }

    private static void getNetWorth(RunnerObj runner){
        out.println("\nNet worth of inventory >>> $" + runner.getGarage().netWorth());
    }
}