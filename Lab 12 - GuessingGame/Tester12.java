//v1.01
public class Tester12 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, GuessingGame");
        message("Best possible score: 3 green, 0 yellow, 1 red");
        message("We will have to cheat (and alter our code a little bit) to test the guessing game.  This means that it is only possible to pass one of the guessing game testing situations at a time.  You will always have at least one condition that is red.");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter an integer >>> 14\n1 2 3 4 5 6 7 8 9 10 11 12 13 14 \n\nEnter an integer from 1 to 1000 >>> 56\nSum of all numbers from 1 to 56 >>> 1596\n\nEnter an integer from 1 to 1000 >>> 56\nSum of all even numbers from 1 to 56 >>> 812\n\nEnter an integer from 1 to 1000 >>> 56\nSum of all multiples of 7 from 1 to 56 >>> 252",        
            "14\n56\n56\n56"
        );   
        
        header("PracticeProblems - Input Data 2");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter an integer >>> 30\n1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 \n\nEnter an integer from 1 to 1000 >>> 123\nSum of all numbers from 1 to 123 >>> 7626\n\nEnter an integer from 1 to 1000 >>> 123\nSum of all even numbers from 1 to 123 >>> 3782\n\nEnter an integer from 1 to 1000 >>> 123\nSum of all multiples of 7 from 1 to 123 >>> 1071",        
            "30\n123\n123\n123"
        ); 

        header("GuessingGame - Read message below for info on Test 1");        
        message("GuessingGame is difficult to test because the secret number chosen by the computer is random.  To verify that the program works correctly, let's force the computer to think of the number 721 instead of picking a random number.\n\nThe only way to pass this test is to change code in your GuessingGame program.\nIn your code, temporarily replace the line: int magicNumber = randomGen.nextInt(1000)+1; \nwith the line: int magicNumber = 721;");
        testMethod("GuessingGame", "main", new Object[]{new String[0]}, 
            "Let's play a guessing game!\nThe number to guess will be from 1 to 1000\nYou have 7 attempts to guess the number correctly.\n\nEnter your guess (whole number from 1 to 1000) >>> 500\nToo low! Guesses remaining >>> 6\n\nEnter your guess (whole number from 1 to 1000) >>> 750\nToo high! Guesses remaining >>> 5\n\nEnter your guess (whole number from 1 to 1000) >>> 700\nToo low! Guesses remaining >>> 4\n\nEnter your guess (whole number from 1 to 1000) >>> 721\nCorrect! The number was >>> 721\n",
            "500\n750\n700\n721"
        );     

        header("GuessingGame - Read message below for info on Test 2");        
        message("To pass this test, once again force a specific magic number.  Change your code to:\nint magicNumber = 15;");
        testMethod("GuessingGame", "main", new Object[]{new String[0]}, 
            "Let's play a guessing game!\nThe number to guess will be from 1 to 1000\nYou have 7 attempts to guess the number correctly.\n\nEnter your guess (whole number from 1 to 1000) >>> 1\nToo low! Guesses remaining >>> 6\n\nEnter your guess (whole number from 1 to 1000) >>> 2\nToo low! Guesses remaining >>> 5\n\nEnter your guess (whole number from 1 to 1000) >>> 3\nToo low! Guesses remaining >>> 4\n\nEnter your guess (whole number from 1 to 1000) >>> 721\nToo high! Guesses remaining >>> 3\n\nEnter your guess (whole number from 1 to 1000) >>> 4\nToo low! Guesses remaining >>> 2\n\nEnter your guess (whole number from 1 to 1000) >>> 5\nToo low! Guesses remaining >>> 1\n\nEnter your guess (whole number from 1 to 1000) >>> 6\nOut of guesses! Number was 15",
            "1\n2\n3\n721\n4\n5\n6"
        );  

    }    
}