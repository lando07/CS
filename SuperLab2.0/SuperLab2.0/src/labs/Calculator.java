package labs;

//Name: 

import java.util.*;

import control.objs;

public class Calculator {

    protected static void calc() {
        double num1;
        double num2;
        double endResult;
        int operator;

        try (Scanner console = objs.getScanner()) {
            System.out.println("1 - addition (+)");
            System.out.println("2 - subtraction (-)");
            System.out.println("3 - multiplication (*)");
            System.out.println("4 - division (/)");
            System.out.println("5 - modulus (%)");
            System.out.println("");
            System.out.print("Choose an operation from the menu >>> ");
            operator = console.nextInt();
            console.nextLine();
            System.out.print("Enter first number >>> ");
            num1 = console.nextDouble();
            console.nextLine();
            System.out.print("Enter second number >>> ");
            num2 = console.nextDouble();
            console.nextLine();
            if (operator == 1) {
                endResult = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + endResult);
            } else if (operator == 2) {
                endResult = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + endResult);
            } else if (operator == 3) {
                endResult = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + endResult);
            } else if (operator == 4) {
                endResult = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + endResult);
            } else if (operator == 5) {
                endResult = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + endResult);
            }
        }
    }

    private Calculator() {

    }
}