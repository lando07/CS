import static java.lang.System.out;

import java.util.Scanner;
import static java.lang.System.in;

public class univObjs {
    private int osParam;
    private static Scanner console = new Scanner(in);

    public univObjs(int os) {
        osParam = os;
    }

    public void clear() throws Exception {
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