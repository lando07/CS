import static java.lang.System.out;
//Name: 

public class BicycleRunner
{
    public static void main(String[] args){
        Bicycle bike = new Bicycle("blue");
        bike.setSpeed(10);
        out.println("Color: " + bike.getColor());
        out.println("Speed: " + bike.getSpeed());
        out.println("Miles traveled: " + bike.travelFarther((double)3/60));
        out.println("Current Location: " + bike.getLocation());
        bike.increaseSpeed(5);
        out.println("Speed: " + bike.getSpeed());
        out.println("Miles traveled: " + bike.travelFarther((double)3/60));
        out.println("Current Location: " + bike.getLocation());
    }

}
