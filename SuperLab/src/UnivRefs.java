import static java.lang.System.in;
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class UnivRefs {
    private static Scanner cons = new Scanner(in);

    public static final Scanner console = cons;

    private static Random privRand = new Random();

    public static final Random rand = privRand;

    private boolean stillExlporing = true;

    private static UnivRefs univRefs = null;

    public void setStillExploring(boolean newStillExploring) {
        stillExlporing = newStillExploring;
    }

    public boolean getStillExploring() {
        return stillExlporing;
    }

    private UnivRefs() {
    }

    public static UnivRefs getInstance() {
        if (univRefs == null) {
            univRefs = new UnivRefs();
        }
        return univRefs;
    }

    public void cls() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public void bluejClear() {
        out.print("\u000c");
    }

    public void termClear() {
        System.out.print("\033[H\033[2J");
    }

    public void bufferedReader(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        }
    }

    public void returnToSelection() {
        out.println("Press enter to return to selection or 0 to quit");
    }
}
