import static java.lang.System.in;
import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class Objs {
    private static Scanner cons = new Scanner(in);
    private static Random rnd = new Random();

    private Objs() {

    }

    static Scanner getScanner() {
        return cons;
    }

    static Random getRandom() {
        return rnd;
    }

    static boolean getExploring() {
        return ControlVars.stillExploring;
    }

    static int getOpt() {
        return ControlVars.opt;
    }

    static char getSubOpt() {
        return ControlVars.subOpt;
    }

    static String readFile(String file) {
        try {
            return new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            e.toString();
        }
        return "how did you get here?";
    }

    static String getOString() {
        return System.getProperty("os.name").toLowerCase();
    }

    static void setExploring(boolean newState) {
        ControlVars.stillExploring = newState;
    }

    static void setOpt(int newState) {
        ControlVars.opt = newState;
    }

    static void setSubOpt(char newState) {
        ControlVars.subOpt = newState;
    }

    private static class ControlVars {
        private static boolean stillExploring = true;
        private static int opt;
        private static char subOpt;
    }

    static void clearScreen() {
        if (System.console() != null) {
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