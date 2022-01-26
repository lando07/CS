//Version 1.1
public class Tester17 extends TestGUI.TestData{ 
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
      
      srcButton("PracticeProblems, Pendulum");
      message("Best possible score: 3 green, 0 yellow, 0 red");
      header("Practice Problems");        
      message("For the practice problem only, I have given an allowance of +/- .001 on accuracy of doubles.  There is no penalty if you are within this threshold (tests will show yellow).");
      testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
         "Enter a double >>> 4.7\nEnter a double >>> 2.4\nThe bigger one number is 4.7\n\nEnter a double to cube >>> 3.5\nThe cube of 3.5 is 42.875\n\nEnter a base >>> 5\nEnter an exponent >>> 3\n5.0^3.0 = 125.0\n\nEnter a double to round >>> 45.87\nIf you round 45.87 you get 46\n\nEnter a double to root >>> 81.0\nThe square root of 81.0 is 9.0\n\nEnter sideA of a triangle >>> 20.0\nEnter sideB of a triangle >>> 21.0\nThe hypotenuse is 29.0\n\nEnter cylinder radius >>> 4\nEnter cylinder height >>> 3\nSurface area is 175.92918860102841\n\nEnter sphere diameter >>> 8\nVolume is 268.082573106329",
         .001,
         "4.7\n2.4\n3.5\n5\n3\n45.87\n81.0\n20.0\n21.0\n4\n3\n8"
         );  
   
      testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
         "Enter a double >>> 1.1\nEnter a double >>> 2.2\nThe bigger one number is 2.2\n\nEnter a double to cube >>> 3.3\nThe cube of 3.3 is 35.937\n\nEnter a base >>> 1.1\nEnter an exponent >>> 2.2\n1.1^2.2 = 1.2332863005546628\n\nEnter a double to round >>> 3.3\nIf you round 3.3 you get 3\n\nEnter a double to root >>> 1.1\nThe square root of 1.1 is 1.0488088481701516\n\nEnter sideA of a triangle >>> 2.2\nEnter sideB of a triangle >>> 3.3\nThe hypotenuse is 3.966106403010388\n\nEnter cylinder radius >>> 1.1\nEnter cylinder height >>> 2.2\nSurface area is 22.8079626650619\n\nEnter sphere diameter >>> 3.3\nVolume is 18.816569198676063",
         .001,
         "1.1\n2.2\n3.3\n1.1\n2.2\n3.3\n1.1\n2.2\n3.3\n1.1\n2.2\n3.3"
         ); 
      
      
      header("Pendulum");  
      message("For my gravitational constant, I used 9.8.  If you used a more precise version, our answers may differ slightly.  Change your constant to 9.8 to get it to match.");
      testMethod("Pendulum", "main", new Object[]{new String[0]}, 
         "Enter pendulum length in meters (or 0 to quit) >>> 7.2\nFor a length of 7.2m, the pendulum's period is 5.4 seconds.\n\nEnter pendulum length in meters (or 0 to quit) >>> 8.9\nFor a length of 8.9m, the pendulum's period is 6.0 seconds.\n\nEnter pendulum length in meters (or 0 to quit) >>> 5.5\nFor a length of 5.5m, the pendulum's period is 4.7 seconds.\n\nEnter pendulum length in meters (or 0 to quit) >>> 100\nFor a length of 100.0m, the pendulum's period is 20.1 seconds.\n\nEnter pendulum length in meters (or 0 to quit) >>> 0\nGoodbye.",
         "7.2\n8.9\n5.5\n100\n0\n"
         );         
   
     
   }    
}