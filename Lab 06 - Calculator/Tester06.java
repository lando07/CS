//Version 1.0
public class Tester06 extends TestGUI.TestData{ 
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

        srcButton("PracticeProblems, Calculator");
        message("Best possible score: 8 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> 9\nGood number!\n\nEnter a whole number >>> 111\nthat's a big number\n\nEnter a whole number >>> 1\nbinary!\n\nEnter a whole number >>> 1\nthat's not a 4\n\nEnter a number (decimals are okay) >>> 11\nbig\n\nWelcome to Mr. McCoy's Quest for Salsa!\nAssign stats to your character (max 15 points TOTAL)\nEnter strength >>> 1\nEnter charm >>> 2\nEnter magic >>> 3\nstrength = 1, charm = 2, magic = 3",
            "9\n111\n1\n1\n11\n1\n2\n3"
        );
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> 4\n\nEnter a whole number >>> 4\n\nEnter a whole number >>> 4\n\nEnter a whole number >>> 4\n\nEnter a number (decimals are okay) >>> 4\nsmall\n\nWelcome to Mr. McCoy's Quest for Salsa!\nAssign stats to your character (max 15 points TOTAL)\nEnter strength >>> 9\nEnter charm >>> 8\nEnter magic >>> 7\nPoint limit exceeded!  Default values assigned.\nstrength = 5, charm = 5, magic = 5",
            "4\n4\n4\n4\n4\n9\n8\n7"
        );
        header("Calculator - Input Data 1");        
        testMethod("Calculator", "main", new Object[]{new String[0]}, 
            "1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%)\n\nChoose an operation from the menu >>> 1\nEnter first number >>> 5\nEnter second number >>> 4\n5.0 + 4.0 = 9.0",
            "1\n5\n4"
        );
        header("Calculator - Input Data 2");        
        testMethod("Calculator", "main", new Object[]{new String[0]}, 
            "1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%)\n\nChoose an operation from the menu >>> 2\nEnter first number >>> 13\nEnter second number >>> 10\n13.0 - 10.0 = 3.0",
            "2\n13\n10"
        );
        header("Calculator - Input Data 3");        
        testMethod("Calculator", "main", new Object[]{new String[0]}, 
            "1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%)\n\nChoose an operation from the menu >>> 3\nEnter first number >>> 21\nEnter second number >>> 33\n21.0 * 33.0 = 693.0",
            "3\n21\n33"
        );
        header("Calculator - Input Data 4");        
        testMethod("Calculator", "main", new Object[]{new String[0]}, 
            "1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%)\n\nChoose an operation from the menu >>> 4\nEnter first number >>> 18\nEnter second number >>> 3\n18.0 / 3.0 = 6.0",
            "4\n18\n3"
        );
        header("Calculator - Input Data 5");        
        testMethod("Calculator", "main", new Object[]{new String[0]}, 
            "1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%)\n\nChoose an operation from the menu >>> 5\nEnter first number >>> 18\nEnter second number >>> 3\n18.0 % 3.0 = 0.0\n",
            "5\n18\n3"
        );
        header("Calculator - Input Data 6");        
        testMethod("Calculator", "main", new Object[]{new String[0]}, 
            "1 - addition (+)\n2 - subtraction (-)\n3 - multiplication (*)\n4 - division (/)\n5 - modulus (%)\n\nChoose an operation from the menu >>> 5\nEnter first number >>> 17\nEnter second number >>> 3\n17.0 % 3.0 = 2.0",
            "5\n17\n3"
        );

    }    
}