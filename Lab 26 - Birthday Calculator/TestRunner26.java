public class TestRunner26 extends TestGUI.TestData{ 
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
        srcButton("PracticeProblems, BirthdayCalculator");

        message("Best possible score: 20 green, 7 yellow, 0 red");
        
        header("letterGrade"); 
        Class pp = getClassFromName("PracticeProblems");
        if (pp != null) {
            boolean correctReturn;
            try {                
                correctReturn = pp.getDeclaredMethod("letterGrade", new Class[]{double.class}).getReturnType().getName().contains("String");                  
                if (! correctReturn)
                    message("Error: letterGrade method should receive a double and return a String.", false);
            } catch (Exception e) { message("Error: letterGrade method should receive a double and return a String.", false);   }
        }
        testMethod("PracticeProblems", "letterGrade", new Object[]{80}, "B");
        testMethod("PracticeProblems", "letterGrade", new Object[]{62.3}, "F");
        testMethod("PracticeProblems", "letterGrade", new Object[]{105}, "A");        

        header("squareBoard");
        if (pp != null) {
            boolean correctReturn;
            try {                
                correctReturn = pp.getDeclaredMethod("squareBoard", new Class[]{int.class}).getReturnType().getName().contains("void");                  
                if (! correctReturn)
                    message("Error: squareBoard method should receive an int and have a void return type", false);
            } catch (Exception e) { message("Error: squareBoard method should receive an int and have a void return type", false);   }
        }
        testMethod("PracticeProblems", "squareBoard", new Object[]{2}, "# # \n# #");     
        testMethod("PracticeProblems", "squareBoard", new Object[]{4}, "# # # # \n# # # # \n# # # # \n# # # #");    

        header("checkerBoard");
        testMethod("PracticeProblems", "checkerBoard", new Object[]{5}, "# # # # # \n # # # # # \n# # # # # \n # # # # # \n# # # # # ");  

        header("printPow2");
        testMethod("PracticeProblems", "printPow2", new Object[]{4}, "2^0 = 1\n2^1 = 2\n2^2 = 4\n2^3 = 8");    
        testMethod("PracticeProblems", "printPow2", new Object[]{5}, "2^0 = 1\n2^1 = 2\n2^2 = 4\n2^3 = 8\n2^4 = 16");  

        header("quad");
        if (pp != null) {
            boolean correctReturn;
            try {               
                correctReturn = pp.getDeclaredMethod("quad", new Class[]{double.class, double.class, double.class}).getReturnType().isArray();                  
                if (! correctReturn)
                    message("Error: quad method should receive 3 doubles and return an array of doubles", false);
            } catch (Exception e) { message("Error: quad method should receive 3 doubles and return an array of doubles", false);   }
        }
        testMethod("PracticeProblems", "quad", new Object[]{6.0, -11.0, 2.0}, "[%double1.62_1.63%, %double0.20_0.21%]", 0.001);    
        testMethod("PracticeProblems", "quad", new Object[]{2.0, -8.0, 4.0}, "[%double3.41_3.42%, %double0.58_0.59%]", 0.001);

        header("convertTemp");
        testMethod("PracticeProblems", "convertTemp", new Object[]{0.0, false}, "32.0");    
        testMethod("PracticeProblems", "convertTemp", new Object[]{100, false}, "212.0");    
        testMethod("PracticeProblems", "convertTemp", new Object[]{32, true}, "0.0");    
        testMethod("PracticeProblems", "convertTemp", new Object[]{212.0, true}, "100.0");    

        header("simpleSearch");
        int[] myNums = {2, 4, 6, 8, 10};
        testMethod("PracticeProblems", "simpleSearch", new Object[]{myNums, 2}, "0");
        testMethod("PracticeProblems", "simpleSearch", new Object[]{myNums, 10}, "4");
        testMethod("PracticeProblems", "simpleSearch", new Object[]{myNums, 1}, "-1");

        header("printReverse");
        testMethod("PracticeProblems", "printReverse", new Object[]{765}, "567");
        testMethod("PracticeProblems", "printReverse", new Object[]{2345}, "5432");                

        header("contains");
        int[] seqA = {1, 2, 4, 5, 3};
        int[] seqB = {2, 4, 5};   
        int[] seqC = {4, 5, 3};     
        int[] seqD = {2, 5};     
        testMethod("PracticeProblems", "contains", new Object[]{seqA, seqB}, "true");
        testMethod("PracticeProblems", "contains", new Object[]{seqA, seqC}, "true");
        testMethod("PracticeProblems", "contains", new Object[]{seqA, seqD}, "false");

        header("Running main in PracticeProblems");
        message("Output should look similar to output in the sampleoutput file");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]},
            "Grade of 80 is a B\nGrade of 62.3 is a F\nGrade of 105 is a A\n\nPrinting a size 2 square\n# # \n# # \nPrinting a size 3 square\n# # # \n# # # \n# # # \n\nPrinting a size 3 checkerboard\n# # # \n # # # \n# # # \n\nHere are the first 2 powers of 2\n2^0 = 1\n2^1 = 2\nHere are the first 3 powers of 2\n2^0 = 1\n2^1 = 2\n2^2 = 4\n\nRoots using 1.0, 2.0, 1.0: [-1.0, -1.0]\nRoots using 1.0, 1.0, -4.0: [%double1.56_1.57%, %double-2.57_-2.56%]\nRoots using 1.0, -2.0, -4.0: [%double3.23_3.24%, %double-1.24_-1.23%]\n\nConverting 24.2 C to F: 75.56\nConverting 86 F to C: 30.0\n\nMy array is [7, 6, 9, 4, 3, 7, 2]\nSearching for 7.  Location: 0\nSearching for 3.  Location: 4\nSearching for 5.  Location: -1\n\nPrint 123 in reverse: 321\nPrint 3674 in reverse: 4763\n\nIs [1, 2, 3] found in [1, 2, 1, 2, 3]? true\nIs [1, 2, 3, 4] found in [1, 2, 1, 2, 3]? false"
        );

        header("BirthdayCalculator");
        testMethod("BirthdayCalculator", "main", new Object[]{new String[0]}, 
            "What month is it now? >>> 3\nWhat day is it now? >>> 15\nWhat month is your birthday? >>> 2\nWhat day is your birthday? >>> 14\n\nDays until your birthday >>> %int335_336%\n", 
            "3\n15\n2\n14\n"); 
        testMethod("BirthdayCalculator", "main", new Object[]{new String[0]}, 
            "What month is it now? >>> 1\nWhat day is it now? >>> 1\nWhat month is your birthday? >>> 1\nWhat day is your birthday? >>> 2\n\nDays until your birthday >>> %int0_1%\n", 
            "1\n1\n1\n2\n"); 
        testMethod("BirthdayCalculator", "main", new Object[]{new String[0]}, 
            "What month is it now? >>> 1\nWhat day is it now? >>> 2\nWhat month is your birthday? >>> 1\nWhat day is your birthday? >>> 1\n\nDays until your birthday >>> %int364_365%\n", 
            "1\n2\n1\n1\n");     
        testMethod("BirthdayCalculator", "main", new Object[]{new String[0]}, 
            "What month is it now? >>> 2\nWhat day is it now? >>> 1\nWhat month is your birthday? >>> 3\nWhat day is your birthday? >>> 1\n\nDays until your birthday >>> %int27_28%\n", 
            "2\n1\n3\n1\n");     


    }    
}