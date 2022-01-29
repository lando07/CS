import static java.lang.System.out;

public class LabCaller {
    private LabCaller() {
    }

    public static void chooseLab(int opt) throws Exception {
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
                Lab04Salary.Lab04();
                break;
            case 5:
                Lab05RoadTrip.Lab05();
                break;
            case 6:
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
                UnivRefs refs = UnivRefs.getInstance();
                refs.bufferedReader("AorB.txt");
                out.print("Enter your choice(A or B (not case-sensitive)): ");
                String primChecOrPrimNumChec = UnivRefs.console.next().toLowerCase();
                UnivRefs.console.nextLine();
                // add A and B options
                if (primChecOrPrimNumChec.equals("a")) {
                    Lab15.Lab15PrimChec();
                } else if (primChecOrPrimNumChec.equals("b")) {
                    Lab15.Lab15PNC();
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
            default:
                out.println("Invalid lab.");
        }
    }
}
