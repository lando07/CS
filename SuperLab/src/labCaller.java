import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class labCaller {
    private int opt;

    public labCaller() {
        opt = params.getInstance().getLabNum();
    }

    void labsIndex() throws InterruptedException{
        switch (opt) {
            case 0:
                Lab00MyFirstProgram.Lab00();
                break;
            case 1:
                Lab01HelloWorld.Lab01();
                break;
            case 2:
                Lab02NomNomNom.Lab02();
                break;
            case 3:
                Lab03BigMacWalk.Lab03();
                break;
            case 4:
                Lab05RoadTrip.Lab05();
                break;
            case 5:
                Lab06Calculator.Lab06();
                break;
            case 7:
                Lab07DeadOrAlive.Lab07();
                break;
            case 8:
                Lab08NutsAndBolts.Lab08();
                break;
            case 9:
                Lab09Seasons.Lab09();
                break;
            case 10:
                Lab10BasicBlackjack.Lab10();
                break;
            case 11:
                Lab11BottlesOnTheWall.Lab11();
                break;
            case 12:
                Lab12GuessingGame.Lab12();
                break;
            case 13:
                Lab13HailstoneSeries.Lab13();
                break;
            case 14:
                Lab14FullBlackjack.Lab14();
                break;
            case 15:
                try {
                    lab15.lab15Caller();
                } catch (IOException e) {
                    out.println("io exception found:\n");
                    e.printStackTrace();
                }
                break;
            case 16:
                Lab16LuckyDice.Lab16();
                break;
            case 17:
                Lab17Pendulum.Lab17();
                break;
            case 18:
                Lab18TShirtLauncher.Lab18();
                break;
            case 19:
                Lab19NameThatCelebrity.Lab19();
                break;
            case 20:
                Lab20PigLatin.Lab20();
                break;
            case 21:
                Lab21SimpleHistogram.Lab21();
                break;
            case 22:
                Lab22ArrayAnalyzer.Lab22();
                break;
            case 23:
                // TODO get lab 23 imported
                break;
            default:
                out.println("Invalid option.");
        }
    }

    private class lab15 {
        static void lab15Caller() throws IOException, InterruptedException {
            try (BufferedReader br = new BufferedReader(new FileReader("AorB.txt"))) {
                String line;
                while ((line = br.readLine()) != null)
                    out.println(line);
            }
            try (Scanner console = UnivObjs.getScanner()) {
                try (params inputParams = params.getInstance()) {
                    inputParams.setAorB(console.next().toLowerCase().charAt(0));
                    try (UnivObjs obj = new UnivObjs()) {
                        switch (inputParams.getAorB()) {
                            case 'a':
                                Lab15.Lab15PrimChec();
                                break;
                            case 'b':
                                Lab15.Lab15PNC();
                                break;
                            default:
                                out.println("invalid choice");
                        }
                        obj.clear();
                    }
                }
            }
        }
    }
}