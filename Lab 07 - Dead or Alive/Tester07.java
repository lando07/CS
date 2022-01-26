//Version 1.0
public class Tester07 extends TestGUI.TestData{ 
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

        srcButton("PracticeProblems, DeadOrAlive");
        message("Best possible score: 2 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "/ \\ // \\\\ /// \\\\\\\n\n\"This message is in quotes.\"\nThis one isn't.\n\n\" and \\ are \"protected\" characters\n(in Java)\n\n/////////////////\n\"\" Java is fun \"\"\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n\"/\\\"\"//\\\\\"\"\"\"///\\\\\\\"\"\"\nThe above line is \"pretty strange\"\nBut this: /\"\\/\\\\\"/\'\\\\\\\"\'/\\ is stranger\n\n  \\/\n \\\\//\n\\\\\\///\n///\\\\\\\n //\\\\\n  /\\"
        );       
        header("DeadOrAlive - Input Data 1");        
        message("Note: I used two tab characters to separate my columns.");
        testMethod("DeadOrAlive", "main", new Object[]{new String[0]}, 
            "Name\t\tHeight\t\tAlive\n\nTom\t\t6'1\"\t\tYes\nJane\t\t5'8\"\t\tYes\nRoger\t\t5'6\"\t\tYes"
        );
       
    }    
}