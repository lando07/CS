//Version 1.0
public class Tester08 extends TestGUI.TestData{ 
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

        srcButton("PracticeProblems, NutsAndBolts");
        message("Best possible score: 9 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> 2\nThat's positive!\n\nEnter a whole number >>> 2\nOmg. It's positive AND even!\n\nEnter your age >>> 2\nYou can't vote.\n\nEnter angle #1 >>> 60\nEnter angle #2 >>> 60\nEnter angle #3 >>> 60\nThat's an equilateral triangle.",
            "2\n2\n2\n60\n60\n60"
        );
        header("PracticeProblems - Input Data 2");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> -2\n\nEnter a whole number >>> -2\nI don't like that number!\n\nEnter your age >>> 30\nYou can vote.\n\nEnter angle #1 >>> 30\nEnter angle #2 >>> 30\nEnter angle #3 >>> 30\nError",
            "-2\n-2\n30\n30\n30\n30"
        );
        header("PracticeProblems - Input Data 3");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> 1\nThat's positive!\n\nEnter a whole number >>> 1\nI don't like that number!\n\nEnter your age >>> 18\nYou can vote.\n\nEnter angle #1 >>> 160\nEnter angle #2 >>> 10\nEnter angle #3 >>> 10\nThat's an isosceles triangle.",
            "1\n1\n18\n160\n10\n10"
        );

        header("PracticeProblems - Input Data 4");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> 0\n\nEnter a whole number >>> 0\nI don't like that number!\n\nEnter your age >>> 0\nYou can't vote.\n\nEnter angle #1 >>> 1\nEnter angle #2 >>> 2\nEnter angle #3 >>> 177\nThat's a scalene triangle.",
            "0\n0\n0\n1\n2\n177"
        );        
        header("PracticeProblems - Input Data 5");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> -1\n\nEnter a whole number >>> 888\nOmg. It's positive AND even!\n\nEnter your age >>> -2\nYou can't vote.\n\nEnter angle #1 >>> 30\nEnter angle #2 >>> -30\nEnter angle #3 >>> 180\nError",
            "-1\n888\n-2\n30\n-30\n180"
        );
        header("NutsAndBolts - Input Data 1");        
        testMethod("NutsAndBolts", "main", new Object[]{new String[0]}, 
            "Welcome to my hardware store!\nNumber of bolts >>> 10\nNumber of nuts >>> 10\nNumber of washers >>> 10\n\nWarning! Check order: too few washers\nTotal cost (in cents) >>> 90",
            "10\n10\n10"
        );
        header("NutsAndBolts - Input Data 2");        
        testMethod("NutsAndBolts", "main", new Object[]{new String[0]}, 
            "Welcome to my hardware store!\nNumber of bolts >>> 10\nNumber of nuts >>> 5\nNumber of washers >>> 20\n\nWarning! Check order: too few nuts\nTotal cost (in cents) >>> 85",
            "10\n5\n20"
        );
        header("NutsAndBolts - Input Data 3");        
        testMethod("NutsAndBolts", "main", new Object[]{new String[0]}, 
            "Welcome to my hardware store!\nNumber of bolts >>> 10\nNumber of nuts >>> 10\nNumber of washers >>> 20\n\nOrder OK!\nTotal cost (in cents) >>> 100",
            "10\n10\n20"
        );
        header("NutsAndBolts - Input Data 4");        
        testMethod("NutsAndBolts", "main", new Object[]{new String[0]}, 
            "Welcome to my hardware store!\nNumber of bolts >>> 10\nNumber of nuts >>> 1\nNumber of washers >>> 1\n\nWarning! Check order: too few nuts\nWarning! Check order: too few washers\nTotal cost (in cents) >>> 54",
            "10\n1\n1"
        );
       
    }    
}