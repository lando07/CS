package Lab10;

import java.util.*;

public class BasicBlackjack {
    void lab10() {
        Scanner console = new Scanner(System.in);
        int player1Hand, player2Hand;
        boolean badNumber = false, badHandP1 = false, badHandP2 = false, handsBust = false;
        System.out.print("Player 1, enter hand value >>> ");
        player1Hand = console.nextInt();
        console.nextLine();
        System.out.print("Player 2, enter hand value >>> ");
        player2Hand = console.nextInt();
        console.nextLine();
        if (player1Hand < 0 || player2Hand < 0) {
            badNumber = true;
        }
        if (player1Hand > 21) {
            badHandP1 = true;
        }
        if (player2Hand > 21) {
            badHandP2 = true;
        }
        if (badHandP1 && badHandP2) {
            handsBust = true;
        }
        if (!badNumber) {
            if (!handsBust) {
                if (badHandP1) {
                    System.out.println("Player 2 wins!");
                } else if (badHandP2) {
                    System.out.println("Player 1 wins!");
                } else if (player1Hand > player2Hand) {
                    System.out.println("Player 1 wins!");
                } else if (player1Hand < player2Hand) {
                    System.out.println("Player 2 wins!");
                }
            } else {
                System.out.println("Bust!");
            }
        } else {
            System.out.println("You entered bad numbers.");
        }
    }
}
