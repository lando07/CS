public class PracticeProblems
{
    public static void main(String[] args){
        //1
        int canvasWidth = 400, canvasHeight = 400;
        Drw.setCanvasSize(canvasWidth, canvasHeight);
        Drw.setXscale(0, canvasWidth);
        Drw.setYscale(0, canvasHeight);
        
        //2
        Drw.clear(Drw.WHITE);
        Drw.setPenColor(Drw.GREEN);
        Drw.filledCircle(200,200,150);
        
        //3
        Drw.setPenColor(Drw.BLUE);
        Drw.setPenRadius(0.05);
        Drw.point(150,250);
        Drw.point(250,250);
        
        //4
        Drw.setPenColor(Drw.GRAY);
        Drw.setPenRadius(0.01);
        Drw.rectangle(200,190,10,25);
        
        //5
        Drw.setPenColor(Drw.RED);
        double[] xValues = {190,210,250,215,185,150};//this is apparently called an array, this is my first time using one lol
        double[] yValues = {125,125,115,85,85,115};
        Drw.filledPolygon(xValues, yValues);
    }
}
