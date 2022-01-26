
//Name: 

public class Lab12GuessingGame {
    private Lab12GuessingGame() {
    }

    public static void Lab12() throws Exception {
        int upperbound = 1000; // Numbers less than 101 will work but NOT equal to 101
        // int randNum = UnivRefs.rand.nextInt(upperbound); //gives us our random number
        // 0-100
        int randNum = UnivRefs.rand.nextInt(upperbound) + 1;
        int userNum = 0;
        int triesUsed = 7;
        boolean playAgain = true;
        System.out.println("Let's play a guessing game!");
        System.out.println("The number to guess will be from 1 to 1000");
        System.out.println("You have 7 attempts to guess the number correctly.");
        System.out.println();
        while (playAgain) { // works if user is playing for the first time or wants to play again, loops
                            // until user is done playing
            randNum = UnivRefs.rand.nextInt(upperbound) + 1;
            // condition is met this is the start of the game
            while (userNum != randNum) { // when user has not guessed the number, this loop runs
                if (triesUsed > 0) { // if they still have tries left they get to guess the number
                    System.out.print("Enter your guess (whole number from 1 to 1000) >>> ");
                    userNum = UnivRefs.console.nextInt();
                    UnivRefs.console.nextLine();
                    if (userNum < randNum) { // condition so player can get feedback on how close the number is to
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
                triesUsed = 0;
                playAgain = false;
            }
            playAgain = false;
        }
        System.out.println("Thanks for playing!");// ending line to say goodbye, code is done and ends after this.
    }
}