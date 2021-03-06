import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;

public class LuckyDice
{
    public static void main(String[] args){
        int faces;
        long simulations;
        long totalRounds = 0;
        Scanner console = new Scanner(in);
        Random rand = new Random();
        out.print("Number of faces on the die? >>> ");
        faces = console.nextInt();
        out.print("\nNumber of simulations? >>> ");
        simulations = console.nextLong();
        for(long i = 1;i<=simulations;i++){
            long rounds = 0;
            long points = 0;
            while(points < 1000){
                long dice1 = rand.nextInt(faces)+1;
                long dice2 = rand.nextInt(faces)+1;
                points += dice1+dice2;
                rounds++;
            }
            totalRounds += rounds;
            out.println("Simulation " + i + ": Number of rounds to reach 1000 >>> " + rounds);
        }
        out.println("Average number of rounds for all simulations >>> " + (totalRounds/simulations));
        
    }
}
