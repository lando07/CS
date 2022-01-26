//Version 1.0
public class Tester05 extends TestGUI.TestData{ 
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

        srcButton("PracticeProblems, RoadTrip");
        message("Best possible score: 4 green, 0 yellow, 0 red");
        message("When doing calculations with doubles, java has to round irrational numbers a tiny bit.  If we do our calculations in a slightly different order, the rounded answers may be a little different.  That's okay.  I've coded this to accept answers that are within a +/- .001 allowance from my answer.\nIf your answer is exactly like mine, it will turn green. Great!\nIf it differs by a small amount, it will turn yellow and still be considered correct.\nIf it turns red, you have a mistake you should fix.");
        header("PracticeProblems - Input Data 1");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> 34\nTen more than that is 44\n\nWhat is your name? >>> Dagar\nHello, Dagar!\n\nEnter a number with a decimal >>> 1.1\nThat number squared is 1.2100000000000002\n\nType a name >>> Fred\nType an age >>> 42\nFred is 42 years old.\n\nEnter the radius of a circle (decimals are allowed) >>> 1.0\nThe area of that circle is 3.14159\n\nEnter the number of seconds of free fall >>> 1.4\nDistance traveled (in feet) >>> 31.530519999999996\n\nWho is your favorite person? >>> Mom\nMomMomMom",
            .001,
            "34\nDagar\n1.1\nFred\n42\n1.0\n1.4\nMom"            
        );   
        header("PracticeProblems - Input Data 2"); 
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a whole number >>> -17\nTen more than that is -7\n\nWhat is your name? >>> Mr. McCoy\nHello, Mr. McCoy!\n\nEnter a number with a decimal >>> 4.0\nThat number squared is 16.0\n\nType a name >>> Bob\nType an age >>> 99\nBob is 99 years old.\n\nEnter the radius of a circle (decimals are allowed) >>> 7.0\nThe area of that circle is 153.93791\n\nEnter the number of seconds of free fall >>> 2.5\nDistance traveled (in feet) >>> 100.54375\n\nWho is your favorite person? >>> SpongeBob\nSpongeBobSpongeBobSpongeBob",
            .001,
            "-17\nMr. McCoy\n4.0\nBob\n99\n7.0\n2.5\nSpongeBob"            
        );
       
        header("RoadTrip - Input Data 1");        
        testMethod("RoadTrip", "main", new Object[]{new String[0]}, 
            "Please enter information for my calculations.\nFuel economy >>> 20\nTotal miles of trip >>> 600\nAnticipated average speed (mph) >>> 60\nAvg. price of gas (per gallon) >>> $2\n\nRoad trip calculations:\nGallons of gas used >>> 30.0\nTotal cost of gas >>> $60.0\nTotal driving hours >>> 10.0",
            .001,
            "20\n600\n60\n2"
        );
        header("RoadTrip - Input Data 2");        
        testMethod("RoadTrip", "main", new Object[]{new String[0]}, 
            "Please enter information for my calculations.\nFuel economy >>> 20.0\nTotal miles of trip >>> 900.0\nAnticipated average speed (mph) >>> 30.0\nAvg. price of gas (per gallon) >>> $3.19\n\nRoad trip calculations:\nGallons of gas used >>> 45.0\nTotal cost of gas >>> $143.55\nTotal driving hours >>> 30.0",
            .001,
            "20.0\n900.0\n30.0\n3.19"
        );

    }    
}