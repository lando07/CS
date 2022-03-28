package control;

import static java.lang.System.in;

import java.util.Random;
import java.util.Scanner;

public class objs {
    private static objs objs;
    private static Scanner cons = new Scanner(in);
    private static Random rnd = new Random();
    private static Scanner console;
    private static Random rand;

    public static Scanner getScanner() {
        return console;
    }

    public static Random getRandom() {
        return rand;
    }

    private objs() {
        console = cons;
        rand = rnd;
    }

    public static void startIntstance() {
        if (objs == null)
            objs = new objs();
    }
}