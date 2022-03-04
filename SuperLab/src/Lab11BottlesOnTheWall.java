import java.util.Scanner;
//Name: 

public class Lab11BottlesOnTheWall {
    private Lab11BottlesOnTheWall() {
    }

    public static void Lab11() {
        try (Scanner console = UnivObjs.getScanner()) {
            boolean overAge21;
            int bottles = 99;
            int age;
            int cokeOrBeerNum;
            String cokeOrBeer;
            System.out.print("Enter your age (whole number only) >>> ");
            age = console.nextInt();
            console.nextLine();
            overAge21 = age >= 21;
            if (overAge21) {
                System.out.print("Do you prefer beer or Coke (enter 1 for beer, 2 for Coke) >>> ");
                cokeOrBeerNum = console.nextInt();
                console.nextLine();
                if (cokeOrBeerNum == 1) {
                    cokeOrBeer = "beer";
                } else {
                    cokeOrBeer = "Coke";
                }
            } else {
                cokeOrBeer = "Coke";
            }
            System.out.println();
            System.out.println(bottles + " bottles of " + cokeOrBeer + " on the wall");
            System.out.println(bottles + " bottles of " + cokeOrBeer);
            for (bottles = 98; bottles > 2; bottles--) {
                System.out.println(
                        "Take one down, pass it around, " + bottles + " bottles of " + cokeOrBeer + " on the wall!");
                System.out.println();
                System.out.println(bottles + " bottles of " + cokeOrBeer + " on the wall");
                System.out.println(bottles + " bottles of " + cokeOrBeer);
            }
            System.out.println(
                    "Take one down, pass it around, " + bottles + " bottles of " + cokeOrBeer + " on the wall!");
            System.out.println();
            System.out.println(bottles + " bottles of " + cokeOrBeer + " on the wall");
            System.out.println(bottles + " bottles of " + cokeOrBeer);
            bottles--;
            System.out.println(
                    "Take one down, pass it around, " + bottles + " bottle of " + cokeOrBeer + " on the wall!");
            System.out.println();
            System.out.println(bottles + " bottle of " + cokeOrBeer + " on the wall");
            System.out.println(bottles + " bottle of " + cokeOrBeer);
            bottles--;
            System.out.println("Take one down, pass it around, no more bottles of " + cokeOrBeer + " on the wall!");

            System.out.println();
        }
    }
}