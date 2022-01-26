//Version 1.1
public class Tester09 extends TestGUI.TestData{ 
    public static void main (String[] args) {        
        if (VERSION_NUM < 2.172)
            System.out.println("This test script requires TestGUI version 2.172 or higher.\nPlease download a newer version of TestGUI.java.");
        else
            new TestGUI();    
    }

    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE       
        setTimeOutSec(1);

        // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces

        srcButton("PracticeProblems, Seasons");
        message("Best possible score: 6 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter left tire pressure (as whole num) >>> 36\nEnter right tire pressure (as whole num) >>> 36\n\nEnter new left tire pressure (as whole num) >>> 39\nEnter new right tire pressure (as whole num) >>> 36\n\nEnter your grade >>> 10\nLetter grade for 10.0 >>> F\n\nEnter a whole number to round >>> 124\nRounded to nearest 10 >>> 120",
            "36\n36\n39\n36\n10\n124"
        );
        header("PracticeProblems - Input Data 2");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter left tire pressure (as whole num) >>> 36\nEnter right tire pressure (as whole num) >>> 35\nWarning! Low tire pressure\n\nEnter new left tire pressure (as whole num) >>> 39\nEnter new right tire pressure (as whole num) >>> 35\nWarning! Uneven tire pressure\n\nEnter your grade >>> 80\nLetter grade for 80.0 >>> B\n\nEnter a whole number to round >>> 555\nRounded to nearest 10 >>> 560",
            "36\n35\n39\n35\n80\n555"
        );
        header("Seasons - Input Data 1");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 2\nEnter day as integer >>> 2\nSeason: Winter",
            "2\n2"
        );
        header("Seasons - Input Data 2");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 12\nEnter day as integer >>> 16\nSeason: Winter",
            "12\n16"
        );
        header("Seasons - Input Data 3");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 9\nEnter day as integer >>> 15\nSeason: Summer",
            "9\n15"
        );
        header("Seasons - Input Data 4");        
        testMethod("Seasons", "main", new Object[]{new String[0]}, 
            "Enter month as integer >>> 9\nEnter day as integer >>> 16\nSeason: Fall",
            "9\n16"
        );        
    }    
}