//Version 1.1
public class Tester23 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, Hangman");
        message("Best possible score: 4 green, 0 yellow, 1 red");
        message("Since the array is initialized with specific values in our code (rather than user-input), it will not be possible to pass both the 1st Test and the 2nd Test at the same time.  Check one and then check the other by changing the array.");

        header("PracticeProblems - 1st Test (See message below.)");  
        message("To pass this test, your array must be set to these values.\nString[] s = {\"Hello\", \"Goodbye\", \"Computer\", \"Science\", \"Um\", \"Do\", \"What\", \"Now\"};");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "The array has 8 elements.\nThe first letters of each String >>> H G C S U D W N \nNumber of strings that end with 'e' >>> 2\nTotal number of characters in the array >>> 38\nI see some long words!\nThe array contains 5 e's.\nNumber of words with an 'e' >>> 4"
        );

        header("PracticeProblems - 2nd Test (See message below.)");
        message("To pass this test, your array must be set to these values.\nString[] s = {\"oeee\", \"Do\", \"What\", \"Now\"};");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "The array has 4 elements.\nThe first letters of each String >>> o D W N \nNumber of strings that end with 'e' >>> 1\nTotal number of characters in the array >>> 13\nMostly short\nThe array contains 3 e's.\nNumber of words with an 'e' >>> 1"
        );        

        header("Hangman");        

        testMethod("Hangman", "main", new Object[]{new String[0]}, 
            "Enter a secret word >>> salsa\n\u000c\nWord: _ _ _ _ _ \nGuesses remaining: 6\nPlease guess a letter >>> s\n\nWord: s _ _ s _ \nGuesses remaining: 6\nPlease guess a letter >>> l\n\nWord: s _ l s _ \nGuesses remaining: 6\nPlease guess a letter >>> o\n\nWord: s _ l s _ \nGuesses remaining: 5\nPlease guess a letter >>> a\n\nYou got it!  The word was: salsa\n",
            "salsa\ns\nl\no\na\n"
        );                                                     

        testMethod("Hangman", "main", new Object[]{new String[0]}, 
            "Enter a secret word >>> method\n\u000c\nWord: _ _ _ _ _ _ \nGuesses remaining: 6\nPlease guess a letter >>> p\n\nWord: _ _ _ _ _ _ \nGuesses remaining: 5\nPlease guess a letter >>> o\n\nWord: _ _ _ _ o _ \nGuesses remaining: 5\nPlease guess a letter >>> l\n\nWord: _ _ _ _ o _ \nGuesses remaining: 4\nPlease guess a letter >>> q\n\nWord: _ _ _ _ o _ \nGuesses remaining: 3\nPlease guess a letter >>> q\n\nWord: _ _ _ _ o _ \nGuesses remaining: 2\nPlease guess a letter >>> q\n\nWord: _ _ _ _ o _ \nGuesses remaining: 1\nPlease guess a letter >>> q\n\nOut of guesses!  Get rekt.  The word was: method",
            "method\np\no\nl\nq\nq\nq\nq"
        );

        testMethod("Hangman", "main", new Object[]{new String[0]}, 
            "Enter a secret word >>> abacab\n\nWord: _ _ _ _ _ _ \nGuesses remaining: 6\nPlease guess a letter >>> a\n\nWord: a _ a _ a _ \nGuesses remaining: 6\nPlease guess a letter >>> x\n\nWord: a _ a _ a _ \nGuesses remaining: 5\nPlease guess a letter >>> b\n\nWord: a b a _ a b \nGuesses remaining: 5\nPlease guess a letter >>> y\n\nWord: a b a _ a b \nGuesses remaining: 4\nPlease guess a letter >>> c\n\nYou got it!  The word was: abacab",
            "abacab\na\nx\nb\ny\nc\n"
        );

    }    
}