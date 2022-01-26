//v1.1
public class Tester15 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, PrimeChecker");
        message("Best possible score: 5 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1"); 
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "123456789\n1 2 3 4 5 6 7 8 9\n2 4 6 8 10 12 14 16 18 20\n20 21 22 23 24 25\n20 30 40 50 60 70 80 90\n0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10\n\nEnter an integer >>> 11\n* * * * * * * * * * * \n\n1 4 9 16 25 36 49 64 81 100\n1 2 ? 4 5 ? 7 8 ? 10 11 ? 13 14 ? 16\n\nEnter an integer from 1 to 9 >>> 5\n5! is 120",        
            "11\n5"
        );   

        header("PracticeProblems - Input Data 2"); 
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "123456789\n1 2 3 4 5 6 7 8 9\n2 4 6 8 10 12 14 16 18 20\n20 21 22 23 24 25\n20 30 40 50 60 70 80 90\n0 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10\n\nEnter an integer >>> 4\n* * * *\n\n1 4 9 16 25 36 49 64 81 100\n1 2 ? 4 5 ? 7 8 ? 10 11 ? 13 14 ? 16\n\nEnter an integer from 1 to 9 >>> 8\n8! is 40320",        
            "4\n8"
        );   

        header("PrimeChecker - Input Data 1");  
        testMethod("PrimeChecker", "main", new Object[]{new String[0]}, 
            "Enter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 13\n13 is a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 25\n25 is NOT a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 218089\n218089 is NOT a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 2\nGoodbye",
            "1\n13\n1\n25\n1\n218089\n2"
        );  

        header("PrimeChecker - Input Data 2");  
        testMethod("PrimeChecker", "main", new Object[]{new String[0]}, 
            "Enter 1 to check if a number is prime or 2 to exit >>> 2\nGoodbye",
            "2"
        );  
        
        header("PrimeChecker - Input Data 3");  
        testMethod("PrimeChecker", "main", new Object[]{new String[0]}, 
            "Enter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 37\n37 is a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 121\n121 is NOT a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 169\n169 is NOT a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 467\n467 is a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 1681\n1681 is NOT a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 1\nPlease enter an integer to check >>> 5051\n5051 is a prime number\n\nEnter 1 to check if a number is prime or 2 to exit >>> 2\nGoodbye",
            "1\n37\n1\n121\n1\n169\n1\n467\n1\n1681\n1\n5051\n2"
        );  

    }    
}