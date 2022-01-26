//Version 1.1
public class Tester20 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, PigLatin");
        message("Best possible score: 3 green, 0 yellow, 0 red");
        header("PracticeProblems");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Type something, will ya >>> okay\nOkay\n\nType something, will ya >>> WaCkY wEaSeLs\nwacky weaseLS\n\nType something, will ya >>> heebie jeebie\nThat string has 6 e's.\n\nType something, will ya >>> thick hipster chips\nhi appears 3 times.\n\nEnter a string >>> booger\nEnter a target string >>> og\nFound It!\n\nEnter a string >>> salsa is good\nRepeat how many last letters? >>> 4\ngoodgoodgoodgood\n\nType your first and last name >>> Kris McCoy\nKris MCCOY\n\nEnter an email address >>> mccoykr@friscoisd.org\nfriscoisd.org\n\nEnter a string with *'s >>> *a*b**c*d*e*f*****\nabcdef",
            "okay\nWaCkY wEaSeLs\nheebie jeebie\nthick hipster chips\nbooger\nog\nsalsa is good\n4\nKris McCoy\nmccoykr@friscoisd.org\n*a*b**c*d*e*f*****"
            );
        
        header("PracticeProblems");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Type something, will ya >>> hipe**@chicken.com\nHipe**@chicken.com\n\nType something, will ya >>> hipe**@chicken.com\nhipe**@chicken.cOM\n\nType something, will ya >>> hipe**@chicken.com\nThat string has 2 e's.\n\nType something, will ya >>> hipe**@chicken.com\nhi appears 2 times.\n\nEnter a string >>> hipe**@chicken.com\nEnter a target string >>> z\nNope\n\nEnter a string >>> hipe**@chicken.com\nRepeat how many last letters? >>> 4\n.com.com.com.com\n\nType your first and last name >>> qwerty asdf\nqwerty ASDF\n\nEnter an email address >>> hipe**@chicken.com\nchicken.com\n\nEnter a string with *'s >>> hipe**@chicken.com\nhipe@chicken.com",
            "hipe**@chicken.com\nhipe**@chicken.com\nhipe**@chicken.com\nhipe**@chicken.com\nhipe**@chicken.com\nz\nhipe**@chicken.com\n4\nqwerty asdf\nhipe**@chicken.com\nhipe**@chicken.com"
        );
        
        
        

        
        header("Pig Latin");        
        testMethod("PigLatin", "main", new Object[]{new String[0]}, 
            "Type a word (or \"quit\") >>> integer\nintegerhay\nType a word (or \"quit\") >>> double\noubleday\nType a word (or \"quit\") >>> string\ningstray\nType a word (or \"quit\") >>> character\naracterchay\nType a word (or \"quit\") >>> quit\nBye!\n",
            "integer\ndouble\nstring\ncharacter\nquit"
        );         
       
    }    
}