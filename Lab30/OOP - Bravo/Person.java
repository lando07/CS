import java.util.Random;

public class Person{
    private String name;
    private int happiness;

    public Person (String n, int h){
        name = n;
        happiness = h;
    }

    public String getName(){
        return name;
    }

    public int getHappiness(){
        return happiness;
    }

    public String toString(){
        return name + " ("+happiness+")";
    }

    public String actOfKindness(Person other){
        Random rand = new Random();
        int happinessInc = rand.nextInt(21)+10;
        other.happiness += happinessInc;
        switch(rand.nextInt(4)){
            case 0:
                return name + " hugs " + other.getName() + "(+"+happinessInc+" happiness)";
            case 1:
                return name + " compliments " + other.getName()+"'s shoes"+ "(+"+happinessInc+" happiness)";
            case 2:
                return name + " helps " + other.getName() + " with homework."+ "(+"+happinessInc+" happiness)";
            case 3:
                return name + " goes to the park with " + other.getName()+ "(+"+happinessInc+" happiness)";
            default:
                return null;
        }
    }
}