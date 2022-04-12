import static java.lang.System.out;
//Name: 

public class CircleRunner
{

    public static void main(String[] args)
    {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(3.5);
        out.println("Diameter of circle 1 is " + c1.getDiameter());
        c1.setRadius(6);
        out.println("Diameter of circle 1 is " + c1.getDiameter());
        out.println("Area of circle 2 is " + c2.getArea());
    }
}
