package Lab2;
//Name:

public class NomNomNom {

    void Lab2() {
        int cookiesAvailable;
        int cakesAvailable;
        double myHeightInFeet, myWeight;
        cookiesAvailable = 6;
        cakesAvailable = 0;
        myHeightInFeet = 5.5;
        myWeight = 127.3;
        System.out.print("Number of cookies to start >>> ");
        System.out.println(cookiesAvailable);
        System.out.print("Number of cakes to start >>> ");
        System.out.println(cakesAvailable);
        System.out.print("My starting height >>> ");
        System.out.println(myHeightInFeet);
        System.out.print("My starting weight >>> ");
        System.out.println(myWeight);
        System.out.println("");
        cookiesAvailable += 12;
        System.out.print("Thanks, Mom. Cookies available >>> ");
        System.out.println(cookiesAvailable);
        cookiesAvailable /= 2;
        System.out.print("Tasty! Cookies available >>> ");
        System.out.println(cookiesAvailable);
        myWeight += 0.3;
        myHeightInFeet += 0.25;
        System.out.print("My new Weight >>> ");
        System.out.println(myWeight);
        System.out.print("My new Height >>> ");
        System.out.println(myHeightInFeet);
        cakesAvailable += 16;
        System.out.print("Happy Birthday to me! Cakes available >>> ");
        System.out.println(cakesAvailable);
        cakesAvailable -= 16;
        System.out.print("Nom nom nom! Remaining cakes >>> ");
        System.out.println(cakesAvailable);
        myWeight *= 2;
        System.out.print("My new weight >>> ");
        System.out.println(myWeight);
        myWeight -= 67.7;
        System.out.print("Obligitory workout montage. My new weight >>> ");
        System.out.print(myWeight);
        System.out.println("");
        System.out.println("");
        System.out.print("Number of cookies at end >>> ");
        System.out.println(cookiesAvailable);
        System.out.print("Number of cakes at end >>> ");
        System.out.println(cakesAvailable);
        System.out.print("My final height >>> ");
        System.out.println(myHeightInFeet);
        System.out.print("My final weight >>> ");
        System.out.print(myWeight);
    }
}