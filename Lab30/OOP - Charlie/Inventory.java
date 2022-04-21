import static java.lang.System.out;
//Name: 

public class Inventory
{
    private Item item1;
    private Item item2;
    private Item item3;

    public Inventory(){
        item1 = item2 = item3 = null;
    }

    public Inventory(Item a, Item b, Item c){
        item1 = a;
        item2 = b;
        item3 = c;
    }

    public double netWorth(){
        double worth = 0;
        if(item1 != null)
            worth += item1.getCost();
        if(item2 != null)
            worth += item2.getCost();
        if(item3 != null)
            worth += item3.getCost();
        return worth;
    }

    public boolean roomForNewItem(){
        return item1 == null || item2 == null || item3 == null;
    }

    public void setItemAsSold(int itemNumber){
        switch(itemNumber){
            case 1:
                item1 = null;
                return;
            case 2:
                item2 = null;
                return;
            case 3:
                item3 = null;
        }
    }

    public void setNewItem(Item newItem, int itemNumber){
        switch(itemNumber){
            case 1:
                if(item1 == null)
                    item1 = newItem;
                else 
                    out.println("Can't add item to that itemNumber. Currently occupied.");
                return;
            case 2:
                if(item2 == null)
                    item2 = newItem;
                else 
                    out.println("Can't add item to that itemNumber. Currently occupied.");
                return;
            case 3:
                if(item3 == null)
                    item3 = newItem;
                else 
                    out.println("Can't add item to that itemNumber. Currently occupied.");
                return;
            default:
                out.println("Can't add item to that itemNumber. Currently occupied.");
        }
    }

    public String toString(){
        String items = "";
        if(item1 == null)
            items+="NO ITEM\n";
        else
            items+=item1.toString()+'\n';
            if(item2 == null)
            items+="NO ITEM\n";
        else
            items+=item2.toString()+'\n';
            if(item3 == null)
            items+="NO ITEM\n";
        else
            items+=item3.toString()+'\n';
        return items;
    }
}
