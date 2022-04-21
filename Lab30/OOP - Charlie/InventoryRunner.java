import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class InventoryRunner{
    private static Scanner console = new Scanner(in);
    private static RunnerObj runner = new RunnerObj();

    public static void main(String[] args){
        do{
            runner.printCurrentInventory();
            runner.printOptions();
            runner.setOpt(console.nextInt());
            console.nextLine();
            switch(runner.getOpt()){
                case 1:
                    setNewItem();
                    break;
                case 2:
                    removeOldItem();
                    break;
                case 3:
                    getNetWorth();
                    break;
                default:
                    continue;
            }
        }while(runner.getOpt() != 4);
    }

    private static void setNewItem(){
        if(runner.getGarage().roomForNewItem()){
            String desc, date;
            int cost;
            out.print("New item name/description >>> ");
            desc = console.nextLine();
            out.print("New item cost >>> $");
            cost = console.nextInt();
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

    private static void removeOldItem(){
        out.print("Which item did you sell? (1-3) >>> ");
        runner.setSlotNum(console.nextInt());
        runner.removeItem();
        out.print("Item from spot "+runner.getSlotNum()+" is now gone.");
    }

    private static void getNetWorth(){
        out.println("\nNet woth of inventory >>> " + runner.getGarage().netWorth());
    }
}