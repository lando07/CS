import static java.lang.System.out;
//Name: 

public class RectangleRunner
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        out.println("r1 length is " + r1.getLength());
        out.println("r1 width is " + r1.getWidth());
        out.println("r1 area is " + r1.getArea());
        r1.setWidth(2);
        r1.setLength(8);
        out.println("r1 new area after changes is " + r1.getArea());
        out.println("Here's what r1 looks like: ");
        r1.drawRectangle();
        Rectangle r2 = new Rectangle(3,3);
        out.println("r2 perimeter is " + r2.getPerimeter());
        out.println("Here's what r2 looks like:");
        r2.setDimensions(4,4);
        r2.drawRectangle();
        out.println("Here's what r1 looks like:");
        r1.drawRectangle();
        out.println();
        r1.setDimensions(2,3);
        r1.drawRectangle();
        r2.setDimensions(16,2);
        r2.drawRectangle();
        Rectangle r3 = new Rectangle(8,3);
        r3.drawRectangle();
        r2.drawRectangle();
        r1.drawRectangle();
    }
}
