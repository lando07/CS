public class labCaller {
    int opt;

    public labCaller(int inputOpt) {
        opt = inputOpt;
    }

    public void labsIndex() throws Exception {
        switch (opt) {
            case 0:
                Lab00MyFirstProgram.Lab00();
                return;
            case 1:
                Lab01HelloWorld.Lab01();
                return;
            case 2:
                Lab02NomNomNom.Lab02();
                return;
            case 3:
                Lab03BigMacWalk.Lab03();
                return;
            case 4:
                Lab05RoadTrip.Lab05();
                return;
            case 5:
                Lab06Calculator.Lab06();
                return;
            case 7:
                Lab07DeadOrAlive.Lab07();
                return;
            case 8:
                Lab08NutsAndBolts.Lab08();
                return;
            case 9:
                Lab09Seasons.Lab09();
                return;
            case 10:
                Lab10BasicBlackjack.Lab10();
                return;
            case 11:
                Lab11BottlesOnTheWall.Lab11();
                return;
            case 12:
                Lab12GuessingGame.Lab12();
                return;
            case 13:
                Lab13HailstoneSeries.Lab13();
                return;
            case 14:
                Lab14FullBlackjack.Lab14();
                return;
            case 15:
                lab15.lab15Caller();
                return;
            case 16:
                Lab16LuckyDice.Lab16();
                return;
            case 17:
                Lab17Pendulum.Lab17();
                return;
            case 18:
                Lab18TShirtLauncher.Lab18();
                return;
            case 19:
                Lab19NameThatCelebrity.Lab19();
                return;
            case 20:
                Lab20PigLatin.Lab20();
                return;
            case 21:
                Lab21SimpleHistogram.Lab21();
                return;
            case 22:
                Lab22ArrayAnalyzer.Lab22();
                return;
            case 23:
                // TODO get lab 23 imported
                return;
        }
    }

    private class lab15 {
        static void lab15Caller() {

        }
    }
}