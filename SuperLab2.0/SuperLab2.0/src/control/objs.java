package control;

import static java.lang.System.in;

import java.util.Random;
import java.util.Scanner;

public class objs {
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

    public static void init() {
        console = cons;
        rand = rnd;
    }
    private objs() {
        
    }
}