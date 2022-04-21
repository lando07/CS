
//Name: 
//Constructors first, mutators second, accessors last
public class Bicycle
{
    private String color;
    private double location;
    private double speed;
    
    public Bicycle(String c){
        color = c;
        location = 0;
        speed = 0;
    }
    
    public void setSpeed(double newSpeed){
        speed = newSpeed;
    }
    
    public void increaseSpeed(double deltaSpeed){
        speed += deltaSpeed;
    }
    
    public double travelFarther(double hours){
        double oldLocation = location;
        location += speed*hours;
        return location - oldLocation;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getSpeed(){
        return speed;
    }
    
    public double getLocation(){
        return location;
    }
}
