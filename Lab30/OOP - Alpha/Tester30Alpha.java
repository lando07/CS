//Version 2.0
public class Tester30Alpha extends TestGUI.TestData{ 
    public static void main (String[] args) {  
        if (VERSION_NUM < 2.172)
            System.out.println("This test script requires TestGUI version 2.172 or higher.\nPlease download a newer version of TestGUI.java.");
        else
            new TestGUI();   
    }

    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE       
        setTimeOutSec(5);
        srcButton("Rectangle, Circle, Calculator, CalculatorRunner, Bicycle");

        // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces
        // Object testMethod(String cName, String mName, Object[] args, [String expOut], [double allowableError], [String inputScript])

        Object o;
        Class c;
        boolean t;

        header("Testing your Rectangle Class");  
        c = getClassFromName("Rectangle");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 2 && fields.contains("private"); 
            message("Rectangle class declares 2 Private Instance Variables: " + t, t);                  
        } else { message("Can't find Rectangle class", false); } 
        o = makeObject("Rectangle", new Object[]{});
        testMethod(o, "drawRectangle", null, "***************\n***************\n***************");
        o = makeObject("Rectangle", new Object[]{2, 2});
        testMethod(o, "drawRectangle", null, "**\n**");
        testMethod(o, "setLength", new Object[]{5});
        testMethod(o, "getLength", new Object[]{}, "5");
        testMethod(o, "setWidth", new Object[]{6});
        testMethod(o, "getWidth", new Object[]{}, "6");
        testMethod(o, "setDimensions", new Object[]{10, 11});
        testMethod(o, "getLength", new Object[]{}, "10");
        testMethod(o, "getArea", new Object[]{}, "110");
        testMethod(o, "getPerimeter", new Object[]{}, "42");

        header("Testing your Rectangle Runner");         
        testMethod("RectangleRunner", "main", new Object[]{new String[0]}, "r1 length is 15\nr1 width is 3\nr1 area is 45\nr1 new area after changes is 16\nHere's what r1 looks like:\n********\n********\nr2 perimeter is 12\nHere's what r2 looks like:\n****\n****\n****\n****\nHere's what r1 looks like:\n********\n********\n\n**\n**\n**\n****************\n****************\n********\n********\n********\n****************\n****************\n**\n**\n**\n");

        header("Testing your Circle Class");  
        c = getClassFromName("Circle");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 1 && fields.contains("private"); 
            message("Circle class declares only 1 PIV: " + t, t);                  
        } else { message("Can't find Circle class", false); }
        o = makeObject("Circle", new Object[]{7.0});
        testMethod(o, "getDiameter", new Object[]{}, "14.0");
        testMethod(o, "setRadius", new Object[]{5});
        testMethod(o, "getCircumference", new Object[]{}, "31.41592653589793", 0.001);
        testMethod(o, "getArea", new Object[]{}, "78.53981633974483", 0.001);                 

        header("Testing your Circle Runner"); 
        testMethod("CircleRunner", "main", new Object[]{new String[0]}, "Diameter of circle 1 is 4.0\nDiameter of circle 1 is 12.0\nArea of circle 2 is 38.48451000647496", 0.001);

        header("Testing your Calculator Class");  
        c = getClassFromName("Calculator");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 3 && fields.contains("private"); 
            message("Calculator class declares only 3 PIVs: " + t, t);                  
        } else { message("Can't find Calculator class", false); }
        o = makeObject("Calculator", new Object[]{});
        testMethod(o, "setNumber1", new Object[]{2});
        testMethod(o, "setNumber2", new Object[]{5});
        testMethod(o, "displayChoices", null, "(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Modulus\n(6) Exponentiation");
        testMethod(o, "setOperation", new Object[]{3});
        testMethod(o, "getProblem", null, "2.0 * 5.0");
        testMethod(o, "getAnswer", null, "10.0");

        header("Testing your Calculator Runner"); 
        testMethod("CalculatorRunner", "main", new Object[]{new String[0]}, 
            "Type first number >>> 45.6\nType second number >>> 24.3\n(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Modulus\n(6) Exponentiation\nWhich operation? >>> 2\n45.6 - 24.3 = 21.3\n\nPerform another calculation? (y/n) >>> y\nType first number >>> 4\nType second number >>> 3\n(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Modulus\n(6) Exponentiation\nWhich operation? >>> 6\n4.0 ^ 3.0 = 64.0\n\nPerform another calculation? (y/n) >>> n",         
            0.001,
            "45.6\n24.3\n2\ny\n4\n3\n6\nn\n");

        header("Testing your Bicycle Class");  
        c = getClassFromName("Bicycle");        
        if (c != null) {
            String fields = java.util.Arrays.toString(c.getDeclaredFields());            
            t = c.getDeclaredFields().length == 3 && fields.contains("private"); 
            message("Bicycle class declares exactly 3 PIVs: " + t, t);                  
        } else { message("Can't find Bicycle class", false); }
        o = makeObject("Bicycle", new Object[]{"Red"});
        testMethod(o, "getColor", new Object[]{}, "Red");
        testMethod(o, "setSpeed", new Object[]{1.5});
        testMethod(o, "getSpeed", new Object[]{}, "1.5");
        testMethod(o, "travelFarther", new Object[]{3}, "4.5");
        testMethod(o, "travelFarther", new Object[]{2.0}, "3.0");
        testMethod(o, "getLocation", new Object[]{}, "7.5");

        header("Testing your Bicycle Runner"); 
        testMethod("BicycleRunner", "main", new Object[]{new String[0]}, 
            "Color: blue\nSpeed: 10.0\nMiles traveled: 0.5\nCurrent Location: 0.5\nSpeed: 15.0\nMiles traveled: 0.75\nCurrent Location: 1.25\n"         
        );
    }    
}