import static java.lang.System.in;
import static java.lang.System.out;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class UnivObjs implements AutoCloseable {
    private static Scanner console = new Scanner(in);
    private static Random rand = new Random();

    public void close() { // so i can use this with try catches
    }

    public static Scanner getScanner() {
        return console;
    }

    public static Random getRandom() {
        return rand;
    }

    public void clear() throws InterruptedException, IOException {
        try (params osParam = params.getInstance()) {
            switch (osParam.getOsNum()) {
                case 0: // linux/unix systems
                    out.print("\033[H\033[2J");
                    return;
                case 1:// windows systems with dos or powershell
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    return;
                case 2:// bluej clear console character
                    out.print('\u000c');
                    return;
                default:
                    out.println("(Screen clears)\n\n");
            }
        }
    }
}