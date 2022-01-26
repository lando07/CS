//v 1.2
public class Tester10 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, BasicBlackjack");
        message("Best possible score: 8 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a value for num1 >>> 1\nEnter a value for num2 >>> 1\nnum1 and num2 are the same? >>> true\n\nEnter total bill amount >>> $100\nNew total after discount (if applicable) >>> $100.0\n\nCustomer has a coupon? >>> true\nCoupon discount >>> $5.0\nNew total after coupon (if applicable) >>> $95.0",
            "1\n1\n100\ntrue"
        );       
        header("PracticeProblems - Input Data 2");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a value for num1 >>> 1\nEnter a value for num2 >>> 2\nnum1 and num2 are the same? >>> false\n\nEnter total bill amount >>> $1100\n10% discount >>> $110.0\nNew total after discount (if applicable) >>> $990.0\n\nCustomer has a coupon? >>> false\nCoupon discount >>> $0.0\nNew total after coupon (if applicable) >>> $990.0",
            "1\n2\n1100\nfalse"
        );
        header("PracticeProblems - Input Data 3");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a value for num1 >>> 2\nEnter a value for num2 >>> 2\nnum1 and num2 are the same? >>> true\n\nEnter total bill amount >>> $3000\n15% discount >>> $450.0\nNew total after discount (if applicable) >>> $2550.0\n\nCustomer has a coupon? >>> true\nCoupon discount >>> $127.5\nNew total after coupon (if applicable) >>> $2422.5",
            "2\n2\n3000\ntrue"
        );        
        
        

        
        header("BasicBlackjack - Input Data 1");        
        testMethod("BasicBlackjack", "main", new Object[]{new String[0]}, 
            "Player 1, enter hand value >>> 18\nPlayer 2, enter hand value >>> 21\nPlayer 2 wins!",
            "18\n21"
        );         
        header("BasicBlackjack - Input Data 2");        
        testMethod("BasicBlackjack", "main", new Object[]{new String[0]}, 
            "Player 1, enter hand value >>> 20\nPlayer 2, enter hand value >>> 18\nPlayer 1 wins!",
            "20\n18"
        );
        header("BasicBlackjack - Input Data 3");        
        testMethod("BasicBlackjack", "main", new Object[]{new String[0]}, 
            "Player 1, enter hand value >>> 22\nPlayer 2, enter hand value >>> 20\nPlayer 2 wins!",
            "22\n20"
        );
        header("BasicBlackjack - Input Data 4");        
        testMethod("BasicBlackjack", "main", new Object[]{new String[0]}, 
            "Player 1, enter hand value >>> 22\nPlayer 2, enter hand value >>> 23\nBust!",
            "22\n23"
        );
        header("BasicBlackjack - Input Data 5");        
        testMethod("BasicBlackjack", "main", new Object[]{new String[0]}, 
            "Player 1, enter hand value >>> -2\nPlayer 2, enter hand value >>> 5\nYou entered bad numbers.",
            "-2\n5"
        );
        
    }    
}