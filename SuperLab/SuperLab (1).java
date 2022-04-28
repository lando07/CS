import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;

public class SuperLab {
    private static final String WELCOME = Objs.readFile("Welcome.txt");
    private static final String OPT = Objs.readFile("opt.txt");

    public static void main(String[] args) {
        clearScreen();
        try (Scanner console = Objs.getScanner()) {
            out.println(WELCOME);
            console.nextLine();
            clearScreen();
            out.println(OPT);
            Objs.setOpt(console.nextInt());
        }
    }

    private static void clearScreen() {
        if (System.console() == null) {
            if (Objs.getOString().contains("windows")) {
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (InterruptedException | IOException e) {
                    if (e.toString().contains("Interrupt")) {
                        out.print(e);
                        Thread.currentThread().interrupt();
                    } else {
                        out.print(e);
                    }
                }
            } else {
                out.print("\033[H\033[2J");
                out.flush();
            }
        } else {
            out.print("\u000c");
        }
    }
}