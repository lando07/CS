
import static java.lang.System.in;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Objs {
    /**
     *
     */
    private static final String EXISTS_IN_THE_SAME_DIRECTORY_AS_THE_JAR_OR_CLASS = "exists in the same directory as the jar or class!";
    private static Scanner cons = new Scanner(in);
    private static Random rnd = new Random();
    private static Scanner console;
    private static Random rand;
    private static int clearScreenLocalizer;

    public static Scanner getScanner() {
        return console;
        
    }

    public static Random getRandom() {
        return rand;
    }

    public static void init(int localizerState) {
        console = cons;
        rand = rnd;
        clearScreenLocalizer = localizerState;
    }

    public static void clearScreen() throws InterruptedException {
        switch (clearScreenLocalizer) {
            case 0:// windows
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (IOException e) {
                    out.println(e);
                }
                break;
            case 1:// linux
                out.print("\033[H\033[2J");
                out.flush();
                break;
            case 2:// bluej
                out.print("\u000c");
                break;
            default:
        }
    }

    public static void fileReader(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.print(line);
            }
        } catch (FileNotFoundException e) {
            out.println("Oops! File not found! Check the that " + file
                    + EXISTS_IN_THE_SAME_DIRECTORY_AS_THE_JAR_OR_CLASS);
        }
    }

    public static void labCaller() {
        switch (ControlVars.getLabSelection()) {
            case 0:
                MyFirstProgram.MFP();
                break;
            case 1:
                HelloWorld.HW();
                break;
            case 2:
                NomNomNom.NNN();
                break;
            case 3:
                BigMacWalk.bmw();
                break;
            case 4:
                Salary.Salary();
                break;
            case 5:
                RoadTrip.RT();
                break;
            case 6:
                Calculator.calc();
                break;
            case 7:
                DeadOrAlive.DOrAlive();
                break;
            case 8:
                NutsAndBolts.NAB();
                break;
            case 9:
                Seasons.Seasons();
                break;
            case 10:
                BasicBlackjack.bbb();
                break;
            case 11:
                BottlesOnTheWall.bow();
                break;
            case 12:
                GuessingGame.GG();
                break;
            case 13:
                HailstoneSeries.HS();
                break;
            case 14:
                FullBlackjack.FBJ();
                break;
            case 15:
                chooseLab15();
                break;
            case 16:
                LuckyDice.LD();
                break;
            case 17:
                Pendulum.pendulum();
                break;
            case 18:
                TShirtLauncher.TShirtL();
                break;
            case 19:
                NameThatCelebrity.NTC();
                break;
            case 20:
                PigLatin.pigLatin();
                break;
            case 21:
                SimpleHistogram.SH();
                break;
            case 22:
                ArrayAnalyzer.arrAnalyzer();
                break;
            case 23:
                chooseLab23();
                break;
            case 24:
                out.println("Lab 24 is a lie");
                console.nextLine();
                break;
            case 25:
                PiCalculator.PiC();
                break;
            case 26:
                BirthdayCalculator.bDayCalculator();
                break;
            case 27:
                WordScramble.WS();
                break;
            case 28:
                out.println("Lab 28 is a lie");
                break;
            case 29:
                WaffleIrons.WI();
                break;
            default:
                out.println("Bruh");
                console.nextLine();
        }
    }

    private static void chooseLab15() {

    }

    private static void chooseLab23() {

    }

    private Objs() {

    }
}