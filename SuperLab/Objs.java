import static java.lang.System.in;

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
}