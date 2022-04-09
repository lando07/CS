
//Name: 

import java.util.*;


public class GuessingGame {

    public static void GG() {
        try (Scanner console = Objs.getScanner()) {
            Random rand = Objs.getRandom();
            int upperbound = 1001; // Numbers less than 101 will work but NOT equal to 101
            // int randNum = rand.nextInt(upperbound); //gives us our random number 0-100
            int randNum = rand.nextInt(upperbound);
            int userNum = 0;
            int triesUsed = 7;
            int tryAgain = 1;
            boolean playAgain = true;
            String yesOrNo;
            System.out.println("Let's play a guessing game!");
            System.out.println("The number to guess will be from 1 to 1000");
            System.out.println("You have 7 attempts to guess the number correctly.");
            System.out.println();
            while (playAgain == true) { // works if user is playing for the first time or wants to play again, loops
                                        // until user is done playing
                // randNum = rand.nextInt(upperbound);
                if (randNum == 0) {
                    // randNum = rand.nextInt(upperbound);//if the number ever equals 0, reassign it
                    // a new value
                } else { // when randNum is not 0, go ahead and start the game, will not start until
                         // condition is met this is the start of the game
                    while (userNum != randNum) { // when user has not guessed the number, this loop runs
                        if (triesUsed > 0) { // if they still have tries left they get to guess the number
                            System.out.print("Enter your guess (whole number from 1 to 1000) >>> ");
                            userNum = console.nextInt();
                            console.nextLine();
                            if (userNum < randNum) { // condition so player can get feedback on how close the number is
                                                     // to
                                                     // their number
                                triesUsed--;
                                if (triesUsed == 0) {
                                    continue;
                                } else {
                                    System.out.println("Too low! Guesses remaining >>> " + triesUsed);
                                    System.out.println();
                                }
                            } else if (userNum > randNum) { // same as above
                                triesUsed--;
                                System.out.println("Too high! Guesses remaining >>> " + triesUsed);
                                System.out.println();
                            }
                        } else { // if user fails to get the number, this plays
                            System.out.println("Out of guesses! Number was " + randNum);
                            break;
                        }
                    } // below happens after the user guesses the number or runs out of tries
                    if (userNum == randNum) { // if user guessed number, you get a congratulation
                        System.out.println("Correct! The number was >>> " + randNum);
                        userNum = 0;
                        tryAgain = 1;
                        triesUsed = 0;
                        playAgain = false;
                    }
                    playAgain = false;
                }
            }
            // System.out.println("Thanks for playing!");// ending line to say goodbye, code
            // is done and ends after this.
        }
    }
}