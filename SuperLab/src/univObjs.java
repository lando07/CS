import static java.lang.System.in;
import static java.lang.System.out;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class UnivObjs {
    private int osParam;
    private static Scanner console = new Scanner(in);
    private static Random rand = new Random();

    public UnivObjs(int os) {
        osParam = os;
    }

    public static Scanner getScanner() {
        return console;
    }

    public static Random getRandom() {
        return rand;
    }

    private UnivObjs() {
    }

    public void clear() throws InterruptedException, IOException {
        switch (osParam) {
            case 0: // linux/unix systems
                out.print("\033[H\033[2J");
            case 1:// windows systems with dos or powershell
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            case 2:// bluej clear console character
                out.print('\u000c');
        }
    }
}