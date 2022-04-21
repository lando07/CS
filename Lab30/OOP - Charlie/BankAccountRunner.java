import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
//Name: 

public class BankAccountRunner
{
    private static BankAccount accounts[] = {new BankAccount("McCoy", 1000000), 
            new BankAccount("Jim",600.45),
            new BankAccount("Bob",0.32)};
    public static void main(String[] args)
    {
        Scanner console = new Scanner(in);
        out.print('\u000c');
        do{
            int opt;
            int acc;
            listOptions(1);
            opt = console.nextInt();
            listOptions(2);
            out.print("Select an account >>> ");
            acc = console.nextInt();
            out.print("\nEnter amount >>> $");
            switch(opt){
                case 1:
                accounts[acc-1].deposit(console.nextDouble());
                out.println("Deposit successful. Account details: " + accounts[acc-1]);
                break;
                case 2:
                accounts[acc-1].withdraw(console.nextDouble());
                out.println("Withdrawal successful. Account details: " + accounts[acc-1]);
            }
            out.print("Perform another transaction? (y/n) >>> ");
        }while(console.next().charAt(0) == 'y');
    }

    private static void listOptions(int prompt){
        switch(prompt){
            case 1:
            out.print("(1) Deposit Funds\n(2) Withdraw Cash\n"+
                "What would you like to do? >>> ");
            return;
            case 2:
            out.println("\n(1) "+accounts[0]+
                "\n(2) "+accounts[1]+
                "\n(3) "+accounts[2]);
        }
    }
}
