import static java.lang.Math.*;
//Name: 

public class Circle
{
    private double radius;
    
    public Circle(double rad){
        radius = rad;
    }
    
    public double getDiameter(){
        return radius*2;
    }
    
    public double getArea(){
        return PI*pow(radius,2);
    }
    
    public double getCircumference(){
        return PI*2*radius;
    }
    
    public void setRadius(double r){
        radius = r;
    }
}
