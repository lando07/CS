import static java.lang.System.out;

public class LabCaller {
    private LabCaller() {
    }

    public static void chooseLab(int opt) throws Exception {
        if (opt == 0) {
            Lab00MyFirstProgram.Lab00();
        } else if (opt == 1) {
            Lab01HelloWorld.Lab01();
        } else if (opt == 2) {
            Lab02NomNomNom.Lab02();
        } else if (opt == 3) {
            Lab03BigMacWalk.Lab03();
        } else if (opt == 4) {
            Lab04Salary.Lab04();
        } else if (opt == 5) {
            Lab05RoadTrip.Lab05();
        } else if (opt == 6) {
            Lab06Calculator.Lab06();
        } else if (opt == 7) {
            Lab07DeadOrAlive.Lab07();
        } else if (opt == 8) {
            Lab08NutsAndBolts.Lab08();
        } else if (opt == 9) {
            Lab09Seasons.Lab09();
        } else if (opt == 10) {
            Lab10BasicBlackjack.Lab10();
        } else if (opt == 11) {
            Lab11BottlesOnTheWall.Lab11();
        } else if (opt == 12) {
            Lab12GuessingGame.Lab12();
        } else if (opt == 13) {
            Lab13HailstoneSeries.Lab13();
        } else if (opt == 14) {
            Lab14FullBlackjack.Lab14();
        } else if (opt == 15) {
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
        } else if (opt == 16) {
            Lab16LuckyDice.Lab16();
        } else if (opt == 17) {
            Lab17Pendulum.Lab17();
        }
        else if (opt == 18){
            Lab18TShirtLauncher.Lab18();
        }
        else if (opt == 19){
            //I have yet to add this
        }
        else if (opt == 20){
            Lab20PigLatin.Lab20();
        }
        else{
            out.println("Invalid lab.");
        }
    }
}
