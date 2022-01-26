//Version 1.1
public class Tester18 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, TShirtLauncher");
        message("Best possible score: 5 green, 0 yellow, 0 red");
        header("Practice Problems");        
        message("I have given an allowance of +/- .001 on accuracy of doubles.  There is no penalty as long as you are within this threshold (tests will show yellow).");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a double for x >>> 3.6\nEnter a double for y >>> 2.5\nUsing formula in problem 1, the answer is about 6071\n\nEnter a double for r >>> 4.5\nUsing formula in problem 2, the answer is 381.7035074111598\n\nEnter a double for z >>> 8.2\nUsing formula in problem 3, the answer is 4520.217599999998\n\nEnter a double for x >>> 6.5\nUsing formula in problem 4, the answer is 0.8750612633917001\n\nEnter a double for x >>> 4.7\nUsing formula in problem 5, the answer is about 2428\n\nEnter a double for a >>> 3.3\nEnter a double for b >>> 2.2\nUsing formula in problem 6, the answer is 2.459674775249768\n\nEnter a runway bearing (as whole num) >>> 179\nOh, you're talking about Runway 18\n\nEnter three integers (separated by spaces) >>> 13 -15 11\nThe smallest of those 3 numbers is -15",
            .001,
            "3.6\n2.5\n4.5\n8.2\n6.5\n4.7\n3.3\n2.2\n179\n13 -15 11"
        );  

        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a double for x >>> 1.1\nEnter a double for y >>> 2.2\nUsing formula in problem 1, the answer is about -350\n\nEnter a double for r >>> 3.3\nUsing formula in problem 2, the answer is 150.5325535894085\n\nEnter a double for z >>> 4.4\nUsing formula in problem 3, the answer is 373.8096000000001\n\nEnter a double for x >>> 4.4\nUsing formula in problem 4, the answer is 0.7323937598229685\n\nEnter a double for x >>> 3.3\nUsing formula in problem 5, the answer is about 295\n\nEnter a double for a >>> 2.2\nEnter a double for b >>> 1.1\nUsing formula in problem 6, the answer is 1.9052558883257653\n\nEnter a runway bearing (as whole num) >>> 256\nOh, you're talking about Runway 26\n\nEnter three integers (separated by spaces) >>> -5 4 6\nThe smallest of those 3 numbers is -5",
            .001,
            "1.1\n2.2\n3.3\n4.4\n4.4\n3.3\n2.2\n1.1\n256\n-5 4 6"
        ); 
        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter a double for x >>> 10\nEnter a double for y >>> 9\nUsing formula in problem 1, the answer is about 1472021\n\nEnter a double for r >>> 8\nUsing formula in problem 2, the answer is 2144.660584850632\n\nEnter a double for z >>> 7\nUsing formula in problem 3, the answer is 2400.0\n\nEnter a double for x >>> 6\nUsing formula in problem 4, the answer is 0.8450980400142568\n\nEnter a double for x >>> 5\nUsing formula in problem 5, the answer is about 3710\n\nEnter a double for a >>> 4\nEnter a double for b >>> 3\nUsing formula in problem 6, the answer is 2.6457513110645907\n\nEnter a runway bearing (as whole num) >>> 251\nOh, you're talking about Runway 25\n\nEnter three integers (separated by spaces) >>> -1 -2 -3\nThe smallest of those 3 numbers is -3",
            .001,
            "10\n9\n8\n7\n6\n5\n4\n3\n251\n-1 -2 -3"
        ); 
        
        
        header("T-Shirt Launcher");        
        message("I have given an allowance of +/- .001 on accuracy of doubles.  There is no penalty as long as you are within this threshold (tests will show yellow).");
        testMethod("TShirtLauncher", "main", new Object[]{new String[0]}, 
            "Enter launch velocity (m/s) >>> 20\nEnter launch angle (degrees) >>> 45\n\nProjectile's path:\nTime: 0 seconds\n	x-pos: 0.0 meters\n	y-pos: 0.0 meters\nTime: 1 seconds\n	x-pos: 14.142135623730951 meters\n	y-pos: 9.242135623730949 meters\nTime: 2 seconds\n	x-pos: 28.284271247461902 meters\n	y-pos: 8.684271247461897 meters\nTime: 3 seconds\n	x-pos: 42.42640687119285 meters\n	y-pos: 0.0 meters",
            .001,
            "20\n45\n"
        );     
        testMethod("TShirtLauncher", "main", new Object[]{new String[0]}, 
            "Enter launch velocity (m/s) >>> 60\nEnter launch angle (degrees) >>> 60\n\nProjectile's path:\nTime: 0 seconds\n	x-pos: 0.0 meters\n	y-pos: 0.0 meters\nTime: 1 seconds\n	x-pos: 30.000000000000007 meters\n	y-pos: 47.061524227066315 meters\nTime: 2 seconds\n	x-pos: 60.000000000000014 meters\n	y-pos: 84.32304845413262 meters\nTime: 3 seconds\n	x-pos: 90.00000000000003 meters\n	y-pos: 111.78457268119897 meters\nTime: 4 seconds\n	x-pos: 120.00000000000003 meters\n	y-pos: 129.44609690826525 meters\nTime: 5 seconds\n	x-pos: 150.00000000000003 meters\n	y-pos: 137.30762113533154 meters\nTime: 6 seconds\n	x-pos: 180.00000000000006 meters\n	y-pos: 135.36914536239792 meters\nTime: 7 seconds\n	x-pos: 210.00000000000006 meters\n	y-pos: 123.63066958946422 meters\nTime: 8 seconds\n	x-pos: 240.00000000000006 meters\n	y-pos: 102.09219381653048 meters\nTime: 9 seconds\n	x-pos: 270.00000000000006 meters\n	y-pos: 70.75371804359679 meters\nTime: 10 seconds\n	x-pos: 300.00000000000006 meters\n	y-pos: 29.615242270663032 meters\nTime: 11 seconds\n	x-pos: 330.00000000000006 meters\n	y-pos: 0.0 meters",
            .001,
            "60\n60\n"
        );
 
       
    }    
}