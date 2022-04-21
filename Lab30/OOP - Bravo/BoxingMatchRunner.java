import java.util.*;
import static java.lang.System.out;
//Name: 

public class BoxingMatchRunner
{

    public static void main(String[] args)
    {
        Boxer b1 = new Boxer("Fred", 100);
        Boxer b2 = new Boxer("George", 110);
        out.println(b1);
        out.println(b2);
        out.println("FIGHT!!!! \n");
        while(b1.getHealth() > 0 && b2.getHealth() > 0){
            Random rand = new Random();
            if(rand.nextBoolean()){
                b1.punch(b2);
            }
            else{
                b2.punch(b1);
            }
            out.println(b1 + " ::: " + b2+'\n');
        }
        if(b1.getHealth() > 0)
            out.println("The winner by knockout is..... " + b1.getName());
        else
            out.println("The winner by knockout is..... " + b2.getName());
        out.println("\nMatch Statistics:\nPunches Thrown\t\t"+b1.getName()+": "+
            b1.getPunchCount()+"\t"+b2.getName()+": "+b2.getPunchCount());
        out.println("Damage Caused\t\t" + b1.getName()+": "+
            b1.getDamageTotal()+"\t"+b2.getName()+": "+b2.getDamageTotal());
        out.println("Average Punch Damage\t" + b1.getName()+": "+b1.getAveragePunchDamage()+
            "\t"+b2.getName() + ": " + b2.getAveragePunchDamage());
    }
}
