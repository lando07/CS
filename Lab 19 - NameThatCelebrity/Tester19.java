//Version 1.1
public class Tester19 extends TestGUI.TestData{ 
    
    
    /**  **********************************************************************
     *   IMPORTANT!  You have to alter the variable below for the test to work!
     *   **********************************************************************
     */      
    
    final static String CORRECT_ANSWER = NameThatCelebrity.celeb;
    // Example: final static String CORRECT_ANSWER = "Bob Dylan";   
    
    
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
        srcButton("PracticeProblems, NameThatCelebrity");
        message("Best possible score: 2 green, 2 yellow, 0 red");
        header("PracticeProblems");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Type something, will ya >>> salsa\nThat string is 5 long.\n\nType something else >>> tortilla chips\nRemoving first character: ortilla chips\n\nType something else >>> mountain dew\nRemoving last character: mountain de\n\nType a word >>> Salsa\nType another word >>> Good\nGoodSalsaGood\n\nType a string to cut in half >>> ComputerScience!\nFirst half: Computer\n\nType a word >>> Salsa\nType another word >>> Chips\nalsahips\n\nType something that might start with salsa >>> salsaTownUSA!\nYummy!\n\nType something else >>> don't wanna\nInside part: on't wann\n\nType fish please >>> no\nLame!\n\nType a string with an odd number of characters >>> SalsaGood!!\nMiddle 3: aGo",
            "salsa\ntortilla chips\nmountain dew\nSalsa\nGood\nComputerScience!\nSalsa\nChips\nsalsaTownUSA!\ndon't wanna\nno\nSalsaGood!!"
        );
        
        header("PracticeProblems");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Type something, will ya >>> qwerty\nThat string is 6 long.\n\nType something else >>> qwerty\nRemoving first character: werty\n\nType something else >>> qwerty\nRemoving last character: qwert\n\nType a word >>> qwerty\nType another word >>> a\naqwertya\n\nType a string to cut in half >>> qwerty\nFirst half: qwe\n\nType a word >>> qwerty\nType another word >>> asdf\nwertysdf\n\nType something that might start with salsa >>> salsas\nYummy!\n\nType something else >>> qwerty\nInside part: wert\n\nType fish please >>> fish\n\nType a string with an odd number of characters >>> asdfg\nMiddle 3: sdf",
            "qwerty\nqwerty\nqwerty\nqwerty\na\nqwerty\nqwerty\nasdf\nsalsas\nqwerty\nfish\nasdfg"
        );
        
        header("Name That Celebrity - Losing Game");        
        message("This test uses wildcards, which allows the verification system to omit certain portions of your output from comparison.  Since I don't know who your celebrity is, I don't know exactly what your output will look like.  But all the information surrounding your celebrity name is still testable.");
        testMethod("NameThatCelebrity", "main", new Object[]{new String[0]}, 
            "Choose a difficulty level (easy, medium, or hard) >>> MeDiUm\n\nGood choice.  Here's your clue: \n\n>>> %line%\n\nWhat's your guess? >>> idk\nIncorrect, sorry!\n\n>>> %line%\n\nWhat's your guess? >>> don't know\nIncorrect, sorry!\n\n>>> %line%\n\nWhat's your guess? >>> still idk\nIncorrect, sorry!\n\nHint: %line%\n\n>>> %line%\n\nWhat's your guess? >>> I give up\nIncorrect, sorry!\n\nYou lose! The answer was %line%\n",
            "MeDiUm\nidk\ndon't know\nstill idk\nI give up"
        );  
        
        header("Name That Celebrity - Winning Game");        
        message("IMPORTANT: For the tester to win the game, it needs to know the correct answer.  Open Tester19 and alter the variable CORRECT_ANSWER.");
        testMethod("NameThatCelebrity", "main", new Object[]{new String[0]}, 
            "Choose a difficulty level (easy, medium, or hard) >>> eAsY\n\nGood choice.  Here's your clue: \n\n>>> %line%\n\nWhat's your guess? >>> B"+CORRECT_ANSWER+"\nIncorrect, sorry!\n\n>>> %line%\n\nWhat's your guess? >>> G"+CORRECT_ANSWER+"\nIncorrect, sorry!\n\n>>> %line%\n\nWhat's your guess? >>> "+CORRECT_ANSWER+"\nCorrect!! Nice job.",
            "eAsY\nB"+CORRECT_ANSWER+"\nG"+CORRECT_ANSWER+"\n"+CORRECT_ANSWER
        ); 
    }    
}