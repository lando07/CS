package labs;

import java.util.Scanner;

import control.objs;

public class BigMacWalk {
    protected static void bmw() {
        try (Scanner console = objs.getScanner()) {
            int numBigMacs = 4;
            int bigMacMeals = 4;
            double bigMacCals = 590;
            double friesAndDrinkCals = 400;
            double bigMacMealCals = bigMacCals + friesAndDrinkCals;
            double calsPerMile = 94;
            System.out.print("Big Macs eaten >>> ");
            System.out.println(numBigMacs);
            System.out.print("Total calories consumed >>> ");
            System.out.println(numBigMacs * bigMacCals);
            System.out.print("Miles to walk off after all those Big Macs >>> ");
            System.out.println((numBigMacs * bigMacCals) / calsPerMile);
            System.out.println();
            System.out.print("Big Mac meals eaten >>> ");
            System.out.println(bigMacMeals);
            System.out.print("Total calories consumed >>> ");
            System.out.println(bigMacMealCals * bigMacMeals);
            System.out.print("Miles to walk off all thoes Big Mac meals >>> ");
            System.out.println((bigMacMealCals * bigMacMeals) / calsPerMile);
        }
    }

    private BigMacWalk() {

    }
}