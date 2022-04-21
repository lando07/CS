//Version 1.0
public class Tester30Charlie extends TestGUI.TestData{ 
    public static void main (String[] args) {  
        if (VERSION_NUM < 2.172)
            System.out.println("This test script requires TestGUI version 2.172 or higher.\nPlease download a newer version of TestGUI.java.");
        else
            new TestGUI();   
    }

    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE       
        setTimeOutSec(5);
        srcButton("BankAccount, BankAccountRunner, Item, Inventory, InventoryRunner");

        // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces
        // Object testMethod(String cName, String mName, Object[] args, [String expOut], [double allowableError], [String inputScript])

        Object o;
        Class c;
        boolean t;

        header("Testing your BankAccount Class");  
        c = getClassFromName("BankAccount");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 2 && fields.contains("private"); 
            message("BankAccount class declares 2 Private Instance Variables: " + t, t);                  
        } else { message("Can't find BankAccount class", false); } 
        o = makeObject("BankAccount", new Object[]{"Sadie", 1234.56});
        testMethod(o, "toString", null, "Sadie ($1234.56)");
        testMethod(o, "deposit", new Object[]{10.01});
        testMethod(o, "withdraw", new Object[]{20.01});
        testMethod(o, "toString", null, "Sadie ($1224.56)");

        header("Testing your BankAcountRunner");         
        testMethod("BankAccountRunner", "main", new Object[]{new String[0]}, 
            "(1) Deposit Funds\n(2) Withdraw Cash\nWhat would you like to do? >>> 2\n\n(1) McCoy ($1000000.0)\n(2) Jim ($600.45)\n(3) Bob ($0.32)\nSelect an account >>> 3\n\nEnter amount >>> $123.45\nWithdrawal successful.  Account details: Bob ($-123.13)\nPerform another transaction? (y/n) >>> y\n(1) Deposit Funds\n(2) Withdraw Cash\nWhat would you like to do? >>> 1\n\n(1) McCoy ($1000000.0)\n(2) Jim ($600.45)\n(3) Bob ($-123.13)\nSelect an account >>> 1\n\nEnter amount >>> $0.01\nDeposit successful.  Account details: McCoy ($1000000.01)\nPerform another transaction? (y/n) >>> n",
            "2\n3\n123.45\ny\n1\n1\n0.01\nn\n"
        );

        header("Testing your Item Class");  
        c = getClassFromName("Item");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 3 && fields.contains("private"); 
            message("Item class declares exactly 3 PIVs: " + t, t);                  
        } else { message("Can't find Item class", false); }
        o = makeObject("Item", new Object[]{"thing", 12.34, "1/1/2000"});
        Object o2 = makeObject("Item", new Object[]{"other", 1, "1/1/2001"});
        testMethod(o, "getCost", null, "12.34");
        testMethod(o, "toString",  null, "thing, $12.34\t(Listed: 1/1/2000)");

        header("Testing your Inventory Class");  
        c = getClassFromName("Inventory");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 3 && fields.contains("private"); 
            message("Inventory class declares exactly 3 PIVs: " + t, t);                  
        } else { message("Can't find Inventory class", false); }
        Object inv = makeObject("Inventory", null);        
        testMethod(inv, "setNewItem", new Object[]{o, 2}, "");
        testMethod(inv, "roomForNewItem", null, "true");
        testMethod(inv, "netWorth", null, "12.34");
        testMethod(inv, "setNewItem", new Object[]{o2, 1}, "");
        testMethod(inv, "setNewItem", new Object[]{o2, 2}, "Can't add item to that itemNumber. Currently occupied.");
        testMethod(inv, "setNewItem", new Object[]{o2, 3}, "");
        testMethod(inv, "netWorth", null, "14.34");
        testMethod(inv, "toString", null, "other, $1.0	(Listed: 1/1/2001)\nthing, $12.34\t(Listed: 1/1/2000)\nother, $1.0\t(Listed: 1/1/2001)\n");

        header("Testing your InventoryTester Class"); 
        testMethod("InventoryTester", "main", new Object[]{new String[0]}, "Current inventory: \nNO ITEM\nNO ITEM\nNO ITEM\nNet worth of inventory >>> $0.0\nCan add an item to inventory? >>> true\n\nA decent bird cage, $45.0	(Listed: 03/28/16)\nA new pizza cookbook, $8.75	(Listed: 03/31/16)\nA new hockey stick, $31.5	(Listed: 04/02/16)\n\nCurrent inventory: \nA decent bird cage, $45.0	(Listed: 03/28/16)\nA new pizza cookbook, $8.75	(Listed: 03/31/16)\nA new hockey stick, $31.5	(Listed: 04/02/16)\n\n\nCan add an item to inventory? >>> false\nNet worth of inventory >>> $85.25\n\nTrying to add grill.\nCan't add item to that itemNumber. Currently occupied.\nSelling second item so we can add grill.\nNEW net worth of inventory >>> $96.5");

        header("Testing your InventoryRunner Class");  
        testMethod("InventoryRunner", "main", new Object[]{new String[0]}, 
            "Current inventory: \nNO ITEM\nNO ITEM\nNO ITEM\n\n(1) Add item to inventory.\n(2) Remove sold item from inventory.\n(3) Get net worth of inventory\n(4) Quit\nWhat would you like to do? (1-4) >>> 1\nNew item name/description >>> thing1\nNew item cost >>> $6.23\nNew item date of listing >>> 4/8/17\nWhere in the garage will you store this? (1-3) >>> 2\n\n\nPress enter to continue...\n\nCurrent inventory: \nNO ITEM\nthing1, $6.23	(Listed: 4/8/17)\nNO ITEM\n\n(1) Add item to inventory.\n(2) Remove sold item from inventory.\n(3) Get net worth of inventory\n(4) Quit\nWhat would you like to do? (1-4) >>> 3\n\nNet worth of inventory >>> $6.23\n\nPress enter to continue...\n\nCurrent inventory: \nNO ITEM\nthing1, $6.23	(Listed: 4/8/17)\nNO ITEM\n\n(1) Add item to inventory.\n(2) Remove sold item from inventory.\n(3) Get net worth of inventory\n(4) Quit\nWhat would you like to do? (1-4) >>> 4", 
            "1\nthing1\n6.23\n4/8/17\n2\n\n3\n\n4"
        );
        testMethod("InventoryRunner", "main", new Object[]{new String[0]}, 
            "Current inventory: \nNO ITEM\nNO ITEM\nNO ITEM\n\n(1) Add item to inventory.\n(2) Remove sold item from inventory.\n(3) Get net worth of inventory\n(4) Quit\nWhat would you like to do? (1-4) >>> 1\nNew item name/description >>> some junk\nNew item cost >>> $5.99\nNew item date of listing >>> 4/8/19\nWhere in the garage will you store this? (1-3) >>> 1\n\n\nPress enter to continue...\n\nCurrent inventory: \nsome junk, $5.99	(Listed: 4/8/19)\nNO ITEM\nNO ITEM\n\n(1) Add item to inventory.\n(2) Remove sold item from inventory.\n(3) Get net worth of inventory\n(4) Quit\nWhat would you like to do? (1-4) >>> 2\nWhich item did you sell? (1-3) >>> 1\n\nItem from spot 1 is now gone.\n\nPress enter to continue...\n\nCurrent inventory: \nNO ITEM\nNO ITEM\nNO ITEM\n\n(1) Add item to inventory.\n(2) Remove sold item from inventory.\n(3) Get net worth of inventory\n(4) Quit\nWhat would you like to do? (1-4) >>> 4", 
            "1\nsome junk\n5.99\n4/8/19\n1\n\n2\n1\n\n4"
        );

    }    
}