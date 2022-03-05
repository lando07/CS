import java.util.Scanner;

public class Lab10BasicBlackjack {
    private Lab10BasicBlackjack() {
    }

    public static void Lab10() {
        try {
            Scanner console = UnivObjs.getScanner();
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
            if (badHandP1 == true && badHandP2 == true) {
                handsBust = true;
            }
            if (badNumber == false) {
                if (handsBust == false) {
                    if (badHandP1 == true) {
                        System.out.println("Player 2 wins!");
                    } else if (badHandP2 == true) {
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
        } finally {
        }
    }
}
