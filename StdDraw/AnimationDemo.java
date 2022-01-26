public class AnimationDemo
{
    public static void main(String[] args) 
    {      
        //Set up the Canvas
        int canvasWidth = 400, canvasHeight = 300;
        Drw.setCanvasSize(canvasWidth, canvasHeight);
        Drw.setXscale(0, canvasWidth);
        Drw.setYscale(0, canvasHeight);
        Drw.enableDoubleBuffering();  // pre-draw offscreen

        //Setup the animation variables
        double boxHalfWidth = 26, boxHalfHeight = 16;
        double x = 30, y = 50;
        double amtToChange = 2;        
        boolean movingRight = true, movingUp = true;
        int frameDelay = 30;  //milliseconds

        //Animate
        while (true) //forever
        {                                          
            //Draw DVD Logo
            Drw.clear(Drw.BLACK);
            Drw.setPenColor(Drw.MAGENTA);
            Drw.filledRectangle(x, y, boxHalfWidth, boxHalfHeight);
            Drw.setPenColor(Drw.BLACK);
            Drw.text(x, y, "DVD");
            Drw.show(); //display buffered image
            
            //Wait a moment so we can see it
            Drw.pause(frameDelay);      
            
            //Change location so it will be drawn in different spot next time.
            if (movingRight) x += amtToChange;
            else x -= amtToChange;
            if (movingUp)  y += amtToChange;
            else y -= amtToChange;
            
            //Bounce when needed
            if (x + boxHalfWidth >= canvasWidth) movingRight = false;
            if (x - boxHalfWidth <= 0) movingRight = true;
            if (y + boxHalfHeight >= canvasHeight) movingUp = false;
            if (y - boxHalfHeight <= 0) movingUp = true;
        }
    }
}
