import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;

class ThreadTemplate extends Thread {

}

public class MultithreadPNC {
    public static void main(String[] args) {
        String yesOrNo;
        long integer;
        try(Scanner console = new Scanner(in)){
            long primeCounter = 0;
            do{
                out.print("Would you like to check the prime numbers between 0 and your number?(yes or no): ");
                yesOrNo = console.nextLine();
                yesOrNo.toLowerCase();
                if(yesOrNo.contains("no"))
                    continue;
                out.print("Enter an integer to calculate up to: ");
                integer = console.nextLong();
                console.nextLine();
                if(integer % 8 == 0){
                    out.println("No decmial number found");
                }
                else{
                    double amountPerThread = integer / (double) 8;
                    double amountToCompensate = amountPerThread - (int) amountPerThread;
                    amountToCompensate *= 8;
                    out.println(amountToCompensate);
                }
            }while(yesOrNo.contains("yes"));
        }
    }
}