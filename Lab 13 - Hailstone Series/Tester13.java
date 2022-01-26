//v1.1
public class Tester13 extends TestGUI.TestData{ 
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

        srcButton("PracticeProblems, HailstoneSeries");
        message("Best possible score: 5 green, 0 yellow, 0 red");
        header("PracticeProblems - Input Data 1"); 
        message("Notes about this test:\n\nI used a single tab (\\t) to seperate month and potency.\n\nDue to rounding differences when working with doubles, our potency values may be different by tiny amounts. As long as you are within +/- .001 of the correct answer it will not be counted wrong.  It will just make the test turn yellow.");
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter an integer >>> 6\nsalsa salsa salsa salsa salsa salsa \n\nEnter a new integer >>> 2\nsalsa salsa \nsalsa salsa \n\nWant to see this message again? (true or false) >>> true\nWant to see this message again? (true or false) >>> true\nWant to see this message again? (true or false) >>> false\nVery well.  I was getting bored with this anyway.\n\nEnter first integer (or 0 to quit) >>> 3\nEnter another integer (or 0 to quit) >>> 5\nEnter another integer (or 0 to quit) >>> 0\nSum of integers >>> 8\n\nMonth: 0\tPotency: 100.0\nMonth: 1\tPotency: 93.0\nMonth: 2\tPotency: 86.49\nMonth: 3\tPotency: 80.4357\nMonth: 4\tPotency: 74.805201\nMonth: 5\tPotency: 69.56883693\nMonth: 6\tPotency: 64.6990183449\nMonth: 7\tPotency: 60.170087060757\nMonth: 8\tPotency: 55.95818096650401\nMonth: 9\tPotency: 52.04110829884873\nMonth: 10\tPotency: 48.398230717929316 <<< DISCARD",        
            .001,
            "6\n2\ntrue\ntrue\nfalse\n3\n5\n0"
        );   
        
        
        

        header("PracticeProblems - Input Data 2");        
        testMethod("PracticeProblems", "main", new Object[]{new String[0]}, 
            "Enter an integer >>> 3\nsalsa salsa salsa \n\nEnter a new integer >>> 5\nsalsa salsa salsa salsa salsa \nsalsa salsa salsa salsa salsa \nsalsa salsa salsa salsa salsa \nsalsa salsa salsa salsa salsa \nsalsa salsa salsa salsa salsa \n\nWant to see this message again? (true or false) >>> false\nVery well.  I was getting bored with this anyway.\n\nEnter first integer (or 0 to quit) >>> 0\nNo integers entered.  Thanks for nothing, skrub.\n\nMonth: 0\tPotency: 100.0\nMonth: 1\tPotency: 93.0\nMonth: 2\tPotency: 86.49\nMonth: 3\tPotency: 80.4357\nMonth: 4\tPotency: 74.805201\nMonth: 5\tPotency: 69.56883693\nMonth: 6\tPotency: 64.6990183449\nMonth: 7\tPotency: 60.170087060757\nMonth: 8\tPotency: 55.95818096650401\nMonth: 9\tPotency: 52.04110829884873\nMonth: 10\tPotency: 48.398230717929316 <<< DISCARD", 
            .001,
            "3\n5\nfalse\n0"
        );   

        header("HailstoneSeries - Input Data 1");  
        testMethod("HailstoneSeries", "main", new Object[]{new String[0]}, 
            "Enter an integer from 1 to 1000 >>> 6\n6\n3\n10\n5\n16\n8\n4\n2\n1\nSeries took 8 steps to reach a value of 1",
            "6"
        );  
        
        header("HailstoneSeries - Input Data 2");  
        testMethod("HailstoneSeries", "main", new Object[]{new String[0]}, 
            "Enter an integer from 1 to 1000 >>> 14\n14\n7\n22\n11\n34\n17\n52\n26\n13\n40\n20\n10\n5\n16\n8\n4\n2\n1\nSeries took 17 steps to reach a value of 1",
            "14"
        );
        
        header("HailstoneSeries - Input Data 3");  
        testMethod("HailstoneSeries", "main", new Object[]{new String[0]}, 
            "Enter an integer from 1 to 1000 >>> 27\n27\n82\n41\n124\n62\n31\n94\n47\n142\n71\n214\n107\n322\n161\n484\n242\n121\n364\n182\n91\n274\n137\n412\n206\n103\n310\n155\n466\n233\n700\n350\n175\n526\n263\n790\n395\n1186\n593\n1780\n890\n445\n1336\n668\n334\n167\n502\n251\n754\n377\n1132\n566\n283\n850\n425\n1276\n638\n319\n958\n479\n1438\n719\n2158\n1079\n3238\n1619\n4858\n2429\n7288\n3644\n1822\n911\n2734\n1367\n4102\n2051\n6154\n3077\n9232\n4616\n2308\n1154\n577\n1732\n866\n433\n1300\n650\n325\n976\n488\n244\n122\n61\n184\n92\n46\n23\n70\n35\n106\n53\n160\n80\n40\n20\n10\n5\n16\n8\n4\n2\n1\nSeries took 111 steps to reach a value of 1",
            "27"
        );

    }    
}