import static java.lang.Math.round;
//Name: 

public class BankAccount
{
    private String name;
    private double balance;

    public BankAccount(String n, double bal){
        name = n;
        balance = bal;
    }

    public void deposit(double amt){
        balance+=amt;
    }

    public void withdraw(double amt){
        balance-=amt;
        balance = round(balance*100)/100.0;
    }

    public String toString(){
        return name+" ($"+balance+")";
    }
}
