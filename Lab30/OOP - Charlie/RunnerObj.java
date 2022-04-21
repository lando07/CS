import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class RunnerObj{
    private Inventory garage;
    private int opt;
    private int slotNum;
    private Scanner console = new Scanner(in);

    public RunnerObj(){
        garage = new Inventory();
        opt = 0;
        slotNum = 0;
    }
    
    Scanner getScanner(){
        return console;
    }

    Inventory getGarage(){
        return garage;
    }

    int getOpt(){
        return opt;
    }

    int getSlotNum(){
        return slotNum;
    }

    void setOpt(int newState){
        opt = newState;
    }

    void setSlotNum(int newState){
        slotNum = newState;
    }

    void printOptions(){
        if(garage.roomForNewItem())
            out.print("(1) Add item to inventory.\n"+
                "(2) Remove sold item from inventory.\n"+
                "(3) Get net worth of inventory\n"+
                "(4) Quit\n"+
                "What would you like to do? (1-4) >>> ");
        else
            out.print("(1) Add item to inventory. (UNAVAILABLE. INVENTORY FULL.)\n"+
                "(2) Remove sold item from inventory.\n"+
                "(3) Get net worth of inventory\n"+
                "(4) Quit\n"+
                "What would you like to do (1-4) >>> ");
        opt = console.nextInt();
    }

    void printCurrentInventory(){
        out.println("Current inventory:\n"+garage);
    }

    void addItem(String desc, double cost, String date){
        garage.setNewItem(new Item(desc,cost,date), slotNum);
    }

    void removeItem(){
        garage.setItemAsSold(slotNum);
    }
}