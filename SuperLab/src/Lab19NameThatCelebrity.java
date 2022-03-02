import static java.lang.System.out;

public class Lab19NameThatCelebrity {
    public static final String celeb = "Bill Clinton";

    public static void Lab19() {
        String clue = "This person was a president not too long ago";
        int triesLeft = 4;
        int difNum = 0;
        out.print("Choose a difficulty level (easy, medium, or hard) >>> ");
        String diff = console.nextLine();
        diff = diff.toLowerCase();
        String brokCeleb;
        if (diff.contains("easy"))
            difNum = 1;
        else if (diff.contains("medium"))
            difNum = 2;
        else if (diff.contains("hard"))
            difNum = 3;
        else
            out.println("Invalid difficulty, rerun with the right spelling and word");
        if (difNum == 1)
            brokCeleb = celeb.substring(0, 3) + celeb.substring(7);
        else if (difNum == 2)
            brokCeleb = celeb.substring(0, 0) + celeb.substring(2, 6) + celeb.substring(9);
        else if (difNum == 3) {
            brokCeleb = celeb.substring(0, 1);
            brokCeleb += celeb.substring(2, 4);
            brokCeleb += celeb.substring(5, 7);
        } else {
            brokCeleb = null;
            triesLeft = 0;
        }
        out.println("\nGood choice. Here's your clue: \n\n>>> " + brokCeleb + "\n");
        while (triesLeft > 0) {
            out.print("What's your guess? >>> ");
            String ans = console.nextLine();

            if (ans.equalsIgnoreCase(celeb)) {
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
            out.println(">>> " + brokCeleb + "\n");
            triesLeft--;
        }
        if (triesLeft == 0)
            out.println("You lose! The answer was " + celeb);
    }
}
