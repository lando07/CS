
import static java.lang.System.in;
import static java.lang.System.out;

//Name: 
import java.util.Scanner;


public class NameThatCelebrity {
    private static final String CELEB = "Bill Clinton";

    public static void NTC() {
        String clue = "This person was a president not too long ago";
        boolean guessedIt = false;
        try (Scanner console = Objs.getScanner()) {
            int triesLeft = 4;
            int difNum = 0;
            out.print("Choose a difficulty level (easy, medium, or hard) >>> ");
            String diff = console.nextLine();
            diff = diff.toLowerCase();
            String brokCELEB;
            if (diff.contains("easy"))
                difNum = 1;
            else if (diff.contains("medium"))
                difNum = 2;
            else if (diff.contains("hard"))
                difNum = 3;
            else
                out.println("Invalid difficulty, rerun with the right spelling and word");
            if (difNum == 1)
                brokCELEB = CELEB.substring(0, 3) + CELEB.substring(7);
            else if (difNum == 2)
                brokCELEB = CELEB.substring(0, 0) + CELEB.substring(2, 6) + CELEB.substring(9);
            else if (difNum == 3) {
                brokCELEB = CELEB.substring(0, 1);
                brokCELEB += CELEB.substring(2, 4);
                brokCELEB += CELEB.substring(5, 7);
            } else {
                brokCELEB = null;
                triesLeft = 0;
            }
            out.println("\nGood choice. Here's your clue: \n\n>>> " + brokCELEB + "\n");
            while (triesLeft > 0) {
                out.print("What's your guess? >>> ");
                String ans = console.nextLine();

                if (ans.equalsIgnoreCase(CELEB)) {
                    if (triesLeft >= 1) {
                        out.println("Correct!! Nice job.");
                    }
                    break;
                } else
                    out.println("Incorrect, sorry!\n");
                if (triesLeft == 2)
                    out.println("Hint: " + clue);
                if (triesLeft == 1) {
                    triesLeft--;
                    break;
                }
                out.println(">>> " + brokCELEB + "\n");
                triesLeft--;
            }
            if (triesLeft == 0)
                out.println("You lose! The answer was " + CELEB);
        }
    }
}