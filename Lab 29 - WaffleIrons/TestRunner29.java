//v2
public class TestRunner29 extends TestGUI.TestData{ 
    public static void main (String[] args) {        
        if (VERSION_NUM < 2.172)
            System.out.println("This test script requires TestGUI version 2.172 or higher.\nPlease download a newer version of TestGUI.java.");
        else
            new TestGUI();    
    }

    @SuppressWarnings("unchecked") 
    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE   
        // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces
        setTimeOutSec(1); 
        srcButton("PracticeProblems, WaffleIrons");

        message("Best possible score: 5 green, 0 yellow, 0 red");

        header("PracticeProblems"); 
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Which of the following will declare and initialize a variable in Java? \n1. int 2a = 4; \n2. double circle-area = 5.78; \n3. string s = hello!; \n4. boolean whoa_now = true; \nAnswer? >>> 3\nIncorrect\n\nMath time!\nEnter first number >>> 5\nEnter second number >>> 3\nOperation? (1)+  (2)-  (3)*  (4)/  (5)%  (6)exp  >>> 4\nThe answer is >>> 1.6666666666666667\n\nMaking a PB&J sandwich?  Which step are you stuck on? >>> 4\nHere's what you still need to do:\n4) Spoon jelly onto the other piece of bread.\n5) Put bread together so that the peanut butter and jelly are touching.\n6) Give the sandwich to your dog and feast on a much better food. Salsa!",
            0.001,
            "3\n5\n3\n4\n4\n"
        );

        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Which of the following will declare and initialize a variable in Java?\n1. int 2a = 4;\n2. double circle-area = 5.78;\n3. string s = hello!;\n4. boolean whoa_now = true;\nAnswer? >>> 4\nCorrect\n\nMath time!\nEnter first number >>> 5\nEnter second number >>> 2\nOperation? (1)+  (2)-  (3)*  (4)/  (5)%  (6)exp  >>> 5\nThe answer is >>> 1.0\n\nMaking a PB&J sandwich?  Which step are you stuck on? >>> 2\n\nHere's what you still need to do:\n2) Open both jars.\n3) Spread peanut butter on 1 piece of bread.\n4) Spoon jelly onto the other piece of bread.\n5) Put bread together so that the peanut butter and jelly are touching.\n6) Give the sandwich to your dog and feast on a much better food. Salsa!",
            0.001,
            "4\n5\n2\n5\n2\n"
        );

        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Which of the following will declare and initialize a variable in Java?\n1. int 2a = 4;\n2. double circle-area = 5.78;\n3. string s = hello!;\n4. boolean whoa_now = true;\nAnswer? >>> 7\nInvalid choice\n\nMath time!\nEnter first number >>> 1.7\nEnter second number >>> 3.2\nOperation? (1)+  (2)-  (3)*  (4)/  (5)%  (6)exp  >>> 6\nThe answer is >>> 5.463067271716238\n\nMaking a PB&J sandwich?  Which step are you stuck on? >>> 6\n\nHere's what you still need to do:\n6) Give the sandwich to your dog and feast on a much better food. Salsa!\n\n",
            0.001,
            "7\n1.7\n3.2\n6\n6\n"
        );

        header("WaffleIrons"); 
        testMethod("WaffleIrons", "main", new Object[]{new String[0]}, 
            "Enter model >>> 1\nEnter quantity >>> 2\n\nEnter model >>> 2\nEnter quantity >>> 3\n\nEnter model >>> 3\nEnter quantity >>> 4\n\nEnter model >>> 4\nEnter quantity >>> 5\n\nEnter model >>> 5\nEnter quantity >>> 6\n\nEnter model >>> -1\n\nTotal sales >>> $429.05",      
            "1\n2\n2\n3\n3\n4\n4\n5\n5\n6\n-1\n"
        );
        
        header("WaffleIrons"); 
        testMethod("WaffleIrons", "main", new Object[]{new String[0]}, 
            "Enter model >>> 4\nEnter quantity >>> 3\n\nEnter model >>> 1\nEnter quantity >>> 6\n\nEnter model >>> -1\n\nTotal sales >>> $139.35",      
            "4\n3\n1\n6\n-1\n"
        );

    }    
}