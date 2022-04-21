//Version 2.0
public class Tester30Bravo extends TestGUI.TestData{ 
    public static void main (String[] args) {  
        if (VERSION_NUM < 2.172)
            System.out.println("This test script requires TestGUI version 2.172 or higher.\nPlease download a newer version of TestGUI.java.");
        else
            new TestGUI();   
    }

    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE       
        setTimeOutSec(5);
        srcButton("Boxer, BoxingMatchRunner, Person, KindnessRunner");

        // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces
        // Object testMethod(String cName, String mName, Object[] args, [String expOut], [double allowableError], [String inputScript])

        message("Best possible score: 9 green, 6 yellow, 0 red");
        
        Object o;
        Class c;
        boolean t;

        header("Testing your Boxer Class");  
        c = getClassFromName("Boxer");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 4 && fields.contains("private"); 
            message("Boxer class declares 4 Private Instance Variables: " + t, t);                  
        } else { message("Can't find Boxer class", false); } 
        o = makeObject("Boxer", new Object[]{"Jimmy", 200});
        testMethod(o, "toString", null, "Jimmy (Health: 200)");
        Object o2 = makeObject("Boxer", new Object[]{"Bimmy", 300});
        testMethod(o2, "getName", null, "Bimmy");
        testMethod(o2, "getHealth", null, "300");
        testMethod(o, "punch", new Object[]{o2}, 
            "Jimmy %word% Bimmy with %line%"
        );
        testMethod(o, "getPunchCount", null, "1");
        testMethod(o, "getDamageTotal", null, "%int1_10%");
        testMethod(o, "getAveragePunchDamage", null, "%double1_10%");
        testMethod(o2, "getHealth", null, "%int290_299%");

        header("Testing your BoxingMatchRunner"); 
        message("Due to the unpredicatable random nature of the fight, the accuracy of your output can not be verified.  It should match the sample output in format.  Mr. McCoy will verify your output by looking at it.");
        testMethod("BoxingMatchRunner", "main", new Object[]{new String[0]});
        
        header("Testing your Person Class");  
        c = getClassFromName("Person");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 2 && fields.contains("private"); 
            message("Person class declares 2 Private Instance Variables: " + t, t);                  
        } else { message("Can't find Person class", false); } 
        o = makeObject("Person", new Object[]{"Mario", 40});
        testMethod(o, "toString", null, "Mario (40)");
        o2 = makeObject("Person", new Object[]{"Luigi", 10});
        testMethod(o2, "getName", null, "Luigi");
        testMethod(o2, "getHappiness", null, "10");
        testMethod(o, "actOfKindness", new Object[]{o2}, 
            "Mario %line%"
        );
        testMethod(o2, "getHappiness", null, "%int20_40%");

        header("Testing your KindnessRunner"); 
        message("Due to the unpredicatable random nature of the fight, the accuracy of your output can not be verified.  It should match the sample output in format.  Mr. McCoy will verify your output by looking at it.");
        testMethod("KindnessRunner", "main", new Object[]{new String[0]});
    }    
}