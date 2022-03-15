import java.lang.reflect.*;

public class TestRunner25 extends TestGUI.TestData{ 
    public static void main (String[] args) {        
        if (VERSION_NUM < 2.172)
            System.out.println("This test script requires TestGUI version 2.172 or higher.\nPlease download a newer version of TestGUI.java.");
        else
            new TestGUI();    
    }

    @SuppressWarnings("unchecked") 
    public static void runTests() {  //Your test sequence must be within a method called runTests()
        //WRITE ALL YOUR TEST CASES IN HERE       
        // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces
        setTimeOutSec(1); 

        srcButton("PracticeProblems, PiCalculator");
        message("Best possible score: 30 green, 1 yellow, 0 red");
        header("isOdd");        
        testMethod("PracticeProblems", "isOdd", new Object[]{11}, "true");
        testMethod("PracticeProblems", "isOdd", new Object[]{12}, "false");

        header("isSingleDigit");        
        testMethod("PracticeProblems", "isSingleDigit", new Object[]{5}, "true");
        testMethod("PracticeProblems", "isSingleDigit", new Object[]{-5}, "true");
        testMethod("PracticeProblems", "isSingleDigit", new Object[]{-10}, "false");
        testMethod("PracticeProblems", "isSingleDigit", new Object[]{10}, "false");
        testMethod("PracticeProblems", "isSingleDigit", new Object[]{365}, "false");

        header("getMax");
        testMethod("PracticeProblems", "getMax", new Object[]{10, 20}, "20");    
        testMethod("PracticeProblems", "getMax", new Object[]{20, 10}, "20");  
        testMethod("PracticeProblems", "getMax", new Object[]{-5, -999}, "-5");  
        testMethod("PracticeProblems", "getMax", new Object[]{-999, 5}, "5");

        header("rollDice  (no parameter version)");
        message("Lowest possible number = 1.  Highest possible number = 6. Running several tests...");
        boolean good = true;
        boolean found1 = false;
        boolean found6 = false;
        String nums = "";
        for (int i = 0; i < 40; i++) {
            Object ret = testMethod("PracticeProblems", "rollDice", null);    
            if (ret instanceof Integer) {
                Integer val = (Integer)ret;
                nums += val + " ";                
                if (val < 1 && val > 6) { good = false; break; }
                if (val == 1) found1 = true;
                if (val == 6) found6 = true;
                if (found1 && found6) break;
            }
        }
        if (!found1 || !found6)
            message("Can't verify accuracy because never rolled both bounds >> " + nums, false);

        else
            message("Testing your method several times >> " + nums, good);

        header("rollDice  (single param overload)");
        message("Lowest possible number = 1.  Highest possible number = 8. ");
        good = true;
        boolean foundLower = false;
        boolean foundUpper = false; 
        nums = "";
        for (int i = 0; i < 40; i++) {
            Object ret = testMethod("PracticeProblems", "rollDice", new Object[]{8});    
            if (ret instanceof Integer) {
                Integer val = (Integer)ret;
                nums += val + " ";                
                if (val < 1 && val > 8) { good = false; break; }
                if (val == 1) foundLower = true;
                if (val == 8) foundUpper = true;
                if (foundLower && foundUpper) break;
            }
        }
        if (!foundLower || !foundUpper)
            message("Can't verify accuracy because never rolled both bounds >> " + nums, false);

        else
            message("Testing your method several times >> " + nums, good);

        header("capitalizeOnlyFirst");
        testMethod("PracticeProblems", "capitalizeOnlyFirst", new Object[]{"fRED"}, "Fred");    
        testMethod("PracticeProblems", "capitalizeOnlyFirst", new Object[]{"QWERTY"}, "Qwerty");    
        testMethod("PracticeProblems", "capitalizeOnlyFirst", new Object[]{"salsa"}, "Salsa");    

        header("circleArea");
        testMethod("PracticeProblems", "circleArea", new Object[]{10}, "314.1592653589793", .001);  
        testMethod("PracticeProblems", "circleArea", new Object[]{2.0}, "12.566370614359172", .001);  

        header("isMultiple");
        testMethod("PracticeProblems", "isMultiple", new Object[]{11, 121}, "true");    
        testMethod("PracticeProblems", "isMultiple", new Object[]{11, 123}, "false"); 

        header("isPrime");
        testMethod("PracticeProblems", "isPrime", new Object[]{2}, "true");    
        testMethod("PracticeProblems", "isPrime", new Object[]{5}, "true");
        testMethod("PracticeProblems", "isPrime", new Object[]{307}, "true");
        testMethod("PracticeProblems", "isPrime", new Object[]{33}, "false");
        testMethod("PracticeProblems", "isPrime", new Object[]{301}, "false");

        header("printDiagonal");
        testMethod("PracticeProblems", "printDiagonal", new Object[]{"salsa"}, "s\n a\n  l\n   s\n    a");
        testMethod("PracticeProblems", "printDiagonal", new Object[]{"bye"}, "b\n y\n  e");                

        Class pp = getClassFromName("PracticeProblems");
        if (pp != null) {
            try {
                Method m = pp.getDeclaredMethod("printDiagonal", new Class[]{String.class}); 
                boolean isVoid = m.getReturnType().getName().equals("void");
                if (! isVoid)
                    message("Error: Your printDiagonal method should be void.", false);
            } catch (Exception e) { message("Error: Your printDiagonal method should be void.", false);   }
        }

        header("Running main in PracticeProblems");
        message("Output should look similar to output in the sampleoutput file");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]},
        "5 is Odd? >>> true \n6 is Odd? >>> false \n \n15 is a single digit? >>> false \n-7 is a single digit? >>> true \n \nMax between 100 and 200? >>> 200 \nMax between -3 and 4? >>> 4 \n \nRandom Roll >>> %int1_6% \nRandom Roll >>> %int1_6% \n \nRandom Roll (20 faces) >>> %int1_20% \nRandom Roll (1000 faces) >>> %int1_1000% \n \nCaps fixing frEd >>> Fred \nCaps fixing sAlSA >>> Salsa \n \nArea of circle with radius 1.0? >>> 3.141592653589793 \nArea of circle with radius 8.5? >>> 226.98006922186258 \n \n35 is a multiple of 5? >>> true \n31 is a multiple of 3? >>> false \n \n5 is prime? >>> true \n33 is prime? >>> false \n2 is prime? >>> true \n301 is prime? >>> false \n307 is prime? >>> true \n \nPrinting fred as diagonal \nf \n r \n  e \n   d \nPrinting salsa as diagonal \ns \n a \n  l \n   s \n    a \n",
        .0001
        );

        header("PiCalculator");
        testMethod("PiCalculator", "approximatePi", new Object[]{1}, "4.0", 0.0001); 
        testMethod("PiCalculator", "approximatePi", new Object[]{30}, "3.108268566698947", 0.0001); 
        testMethod("PiCalculator", "approximatePi", new Object[]{1000}, "3.140592653839794", 0.0001); 

    }    
}