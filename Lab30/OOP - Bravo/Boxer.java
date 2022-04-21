import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.round;
//Name: 

public class Boxer
{
    private String name;
    private int health;
    private int punchCount;
    private int damageTotal;

    public Boxer(String n, int h){
        name = n;
        health = h;
    }

    public void punch(Boxer other){
        Random rand = new Random();
        int amount = rand.nextInt(10) + 1;
        if(amount < 4){ //hook
            out.print(name + " nails " + other.name + " with a left hook.");
            out.println("  Power: " + amount);
        }
        else if(amount < 8){ //jab
            out.print(name + " smacks " + other.name + " with a right jab");
            out.println("  Power: " + amount);
        }
        else{ //uppercut
            out.print(name + " destroys " + other.name + " with an uppercut");
            out.println("  Power: " + amount);
        }
        this.punchCount++;
        this.damageTotal += amount;
        other.health -= amount;
    }

    public String toString(){
        return name + " (Health: " + health +")";
    }
    
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getPunchCount(){
        return punchCount;
    }
    
    public int getDamageTotal(){
        return damageTotal;
    }
    
    public double getAveragePunchDamage(){
        return round(10*((double)damageTotal/punchCount))/10.0;
    }
}
