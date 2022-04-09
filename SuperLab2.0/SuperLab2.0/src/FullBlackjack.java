
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;


public class FullBlackjack {
    public static void FBJ() {

        out.print("\u000c");// clears the screen of anything else that could've been there before
        try (Scanner console = Objs.getScanner()) {
            Random rand = Objs.getRandom(); // upperbound is 10 so it will choose numbers from 0-9 when assigning
                                        // varibles a
                                        // random number, I'll add a +2 to make it from 2 to 11 (shifting all random
                                        // values up by 2)
            out.println("Welcome to Landon's casino! Let's play some Blackjack!");
            boolean playAgain = true; // true means you want to play, false means you're done
            int playAgainNum;
            while (playAgain) {
                String whoBusted;
                String whoWon;// this is so I can use less print statements at the end because only 2 words
                              // are changing
                int playerTotal;
                int dealerTotal;
                int hitOrStandNum;
                int num1 = rand.nextInt(10) + 2;// like said up above, to make it from 2 to 11, I add to to "shift"
                                                // all
                                                // the
                                                // values up by two
                int num2 = rand.nextInt(10) + 2;// num1 and num2 will be used to store the card numbers for later
                                                // use
                boolean hitOrStand;
                boolean somebodyBusted = false;
                boolean tieOrBothBust;
                playerTotal = num1 + num2;
                while (playerTotal >= 21) {// this secretly changes the numbers back into good numbers if they're
                                           // bad
                                           // without anyone knowing until good numbers are drawn
                    num1 = rand.nextInt(10) + 2;
                    num2 = rand.nextInt(10) + 2;
                    playerTotal = num1 + num2;
                }
                out.println("You are dealt a " + num1 + "\nYou are dealt a " + num2
                        + "\nThe dealer is also dealt 2 cards, but you can't see them.\nYour Hand total >>> "
                        + playerTotal);
                num1 = rand.nextInt(10) + 2;
                num2 = rand.nextInt(10) + 2;
                dealerTotal = num1 + num2;
                out.print("Would you like to (1)Hit or (2)Stand? ");
                hitOrStandNum = console.nextInt();
                while (hitOrStandNum > 2 || hitOrStandNum <= 0) {// if any trolls think they can get by by typing a
                                                                 // number
                                                                 // other than 1 or two, this safeguard is here to
                                                                 // protect
                    out.print("Would you like to (1)Hit or (2)Stand? ");
                }
                hitOrStand = hitOrStandNum < 2;
                out.println();
                while (hitOrStand) {// you want to hit
                    num1 = rand.nextInt(10) + 2;
                    playerTotal += num1;
                    out.println("You are dealt a(n) " + num1 + "\nYour new hand total >>> " + playerTotal);
                    if (playerTotal > 21) {
                        whoWon = "Dealer";
                        whoBusted = "Player";
                        somebodyBusted = true;
                        break;
                    }
                    out.print("Would you like to (1)Hit or (2)Stand? ");
                    hitOrStandNum = console.nextInt();
                    while (hitOrStandNum > 2 || hitOrStandNum <= 0) {
                        out.print("Would you like to (1)Hit or (2)Stand? ");
                    }
                    hitOrStand = hitOrStandNum < 2;
                    out.println();
                }
                out.println("Dealer shows >>> " + dealerTotal);
                if (dealerTotal > 21) {
                    whoWon = "Player";
                    whoBusted = "Dealer";
                    somebodyBusted = true;
                } else {
                    while (dealerTotal < 15) {
                        num1 = rand.nextInt(10) + 2;
                        dealerTotal += num1;
                        out.println("Dealer draws a(n) " + num1);
                        out.println("New dealer total >>> " + dealerTotal);
                    }
                }
                tieOrBothBust = playerTotal == dealerTotal || playerTotal > 21 && dealerTotal > 21;
                if (tieOrBothBust) {
                    if (playerTotal == dealerTotal) {
                        out.println("Its a push! nobody wins");
                    } else {
                        out.println("Player busted. Dealer wins");
                    }
                } else {
                    if (dealerTotal > 21) {
                        whoWon = "Player";
                        whoBusted = "Dealer";
                        somebodyBusted = true;
                    }
                    out.println("\nResults:");
                    if (dealerTotal < playerTotal) {
                        whoBusted = "Dealer";
                        whoWon = "Player";
                    } else {
                        whoBusted = "Player";
                        whoWon = "Dealer";
                    }
                    if (somebodyBusted) {
                        out.println(whoBusted + " busted. " + whoWon + " wins.");
                    } else {
                        out.println(whoWon + " wins.");
                    }
                    out.print("Play again? (1)Yes or (2)No? ");
                    playAgainNum = console.nextInt();
                    if (playAgainNum == 1) {
                        out.println("\u000c"); // clears screen in bluej
                        continue;
                    } else if (playAgainNum == 2) {
                        playAgain = false;
                    } else {
                        while (playAgainNum != 1 || playAgainNum != 2) {
                            out.print("Play again? (1)Yes or (2)No? ");
                            playAgainNum = console.nextInt();
                            if (playAgainNum == 1) {
                                out.println("\u000c"); // clears screen in bluej
                            } else if (playAgainNum == 2) {
                                playAgain = false;
                            }
                        }
                    }
                }
                out.println("Bye! Thanks for coming to my casino!");
            }
        }
    }

    private FullBlackjack() {

    }
}
