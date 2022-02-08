//Version 1.1
public class Tester22 extends TestGUI.TestData{ 
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

        srcButton("PracticeProblems, ArrayAnalyzer");
        message("Best possible score: 4 green, 0 yellow, 1 red");
        message("Since the array is initialized with specific values in our code (rather than user-input), it will not be possible to pass both the 1st Test and the 2nd Test at the same time.  Check one and then check the other by changing the array.");

        header("PracticeProblems - 1st Test (See message below.)");  
        message("To pass this test, your array must be set to these values.\nint[] nums = {2, 4, 0, 8, 6, 2, 3, 5, 9, 0, 9, 6};");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Last element is 6\nNumber of elements is 12\n2 4 0 8 6 2 3 5 9 0 9 6 \nSum of all numbers is 54\nContains an odd\nFound a zero\nPlenty of 6s\nFound 2-3 combo\nNo three in a row"
        );

        header("PracticeProblems - 2nd Test (See message below.)");
        message("To pass this test, your array must be set to these values.\nint[] nums = {2, 2, 4, 4, 4};");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Last element is 4\nNumber of elements is 5\n2 2 4 4 4 \nSum of all numbers is 16\nOdd free\nNo zeros\nLess than two 6s\nNo 2-3 combo\nThree in a row"
        );        
        
        header("ArrayAnalyzer");        
        
        testMethod("ArrayAnalyzer", "main", new Object[]{new String[0]}, 
            "How many numbers will you enter? >>> 13\nType numbers with spaces in between >>> 4.5 9.2 3 5 6 7 4.3 -2 8 8 8 3 3\n\nLargest number: 9.2\nSmallest number: -2.0\nAverage (rounded to tenth): 5.2\nNumber of Evens: 7\nLongest repeat: 8.0 is repeated 3 times\nLongest increasing run: 3.0 5.0 6.0 7.0 \nLongest decreasing run: 7.0 4.3 -2.0 ",
            "13\n4.5 9.2 3 5 6 7 4.3 -2 8 8 8 3 3\n"
        );
        
        testMethod("ArrayAnalyzer", "main", new Object[]{new String[0]}, 
            "How many numbers will you enter? >>> 10\nType numbers with spaces in between >>> 9.5 8 7 1 1 -8 -1 6 6.1 6.2\n\nLargest number: 9.5\nSmallest number: -8.0\nAverage (rounded to tenth): 3.6\nNumber of Evens: 5\nLongest repeat: 1.0 is repeated 2 times\nLongest increasing run: -8.0 -1.0 6.0 6.1 6.2 \nLongest decreasing run: 9.5 8.0 7.0 1.0 ",
            "10\n9.5 8 7 1 1 -8 -1 6 6.1 6.2\n"
        );         
   
        testMethod("ArrayAnalyzer", "main", new Object[]{new String[0]}, 
            "How many numbers will you enter? >>> 11\nType numbers with spaces in between >>> 1 2.2 3 4 5 5 5 6 5 4 4\n\nLargest number: 6.0\nSmallest number: 1.0\nAverage (rounded to tenth): 4.0\nNumber of Evens: 5\nLongest repeat: 5.0 is repeated 3 times\nLongest increasing run: 1.0 2.2 3.0 4.0 5.0 \nLongest decreasing run: 6.0 5.0 4.0 ",
            "11\n1 2.2 3 4 5 5 5 6 5 4 4\n"
        );    

    }    
}