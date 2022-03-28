//Name: 

import java.util.*;

public class HighLow
{

    public static void main(String[] args) throws Exception
    {
        System.out.print('\u000C');//Clears the BlueJ window
        Random rand = new Random();
        try (Scanner console = new Scanner(System.in)) {
            int upperbound = 101; // Numbers less than 101 will work but NOT equal to 101
            int randNum = rand.nextInt(upperbound); //gives us our random number 0-100
            int userNum = 0;
            int triesUsed = 0;
            int tryAgain = 1;
            boolean playAgain = true;
            String yesOrNo;
            System.out.println("Think you got what it takes to guess my number?");
            Thread.sleep(1000);
            while (playAgain){ // works if user is playing for the first time or wants to play again, loops until user is done playing
                randNum = rand.nextInt(upperbound);
                if (randNum == 0){
                    randNum = rand.nextInt(upperbound);//if the number ever equals 0, reassign it a new value
                }
                else{ //when randNum is not 0, go ahead and start the game, will not start until condition is met this is the start of the game
                    while (userNum != randNum){ //when user has not guessed the number, this loop runs
                        if(triesUsed <=10){ //if they still have tries left they get to guess the number
                            System.out.print("Enter a number(NO DECIMALS): ");
                            userNum = console.nextInt();
                            console.nextLine();
                            if (userNum < randNum){ //condition so player can get feedback on how close the number is to their number
                                System.out.println("Too low!");
                                triesUsed ++;
                            }
                            else if (userNum > randNum ) { // same as above
                                System.out.println("Too high!");
                                triesUsed ++;
                            }
                        }
                        else { //if user fails to get the number, this plays
                            System.out.println("Sorry but you couldn't find the number. The number was " + randNum);
                            break;
                        }
                    } //below happens after the user guesses the number or runs out of tries
                    if(userNum == randNum){ //if user guessed number, you get a congratulation
                        System.out.println("Great job! It took you " + triesUsed + " attempts!");
                        userNum = 0;
                        tryAgain = 1;
                        triesUsed = 0;
                    }
                    while(tryAgain == 1){ //this is true from the start, but won't play until reached. asks user if they want to play again or not
                        System.out.println("Want to play again?(Y or N) ");
                        yesOrNo = console.nextLine();
                        if(yesOrNo.equals("Y") || yesOrNo.equals("y")){ 
                            playAgain = true;
                            tryAgain = 0;
                            System.out.print('\u000C');
                        }
                        else if (yesOrNo.equals("N") || yesOrNo.equals("n")){
                            playAgain = false;
                            tryAgain = 0;
                            System.out.print('\u000C');
                        }
                        else { //this is a safeguard so nobody can troll the code, this while statement also will run until they say Y or N
                            System.out.println("Cannot accept that as an answer. Try again");
                        }
                    }
                }
            }
        }
        System.out.println("Thanks for playing!");// ending line to say goodbye, code is done and ends after this.
    }
}