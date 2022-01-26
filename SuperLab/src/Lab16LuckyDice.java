import static java.lang.System.out;

public class Lab16LuckyDice {
    private Lab16LuckyDice() {
    }

    public static void Lab16() {
        int faces;
        long simulations;
        long totalRounds = 0;
        out.print("Number of faces on the die? >>> ");
        faces = UnivRefs.console.nextInt();
        out.print("\nNumber of simulations? >>> ");
        simulations = UnivRefs.console.nextLong();
        for (long i = 1; i <= simulations; i++) {
            long rounds = 0;
            long points = 0;
            while (points < 1000) {
                long dice1 = UnivRefs.rand.nextInt(faces) + 1;
                long dice2 = UnivRefs.rand.nextInt(faces) + 1;
                points += dice1 + dice2;
                rounds++;
            }
            totalRounds += rounds;
            out.println("Simulation " + i + ": Number of rounds to reach 1000 >>> " + rounds);
        }
        out.println("Average number of rounds for all simulations >>> " + (totalRounds / simulations));
    }
}
