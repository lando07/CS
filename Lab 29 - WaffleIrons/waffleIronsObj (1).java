import static java.lang.Math.round;

public class waffleIronsObj{
    private double total = 0;
    private static final double[] modelPrices = {10.98, 14.50, 19.98, 24.49, 26.87};
    
    public waffleIronsObj(){
        
    }
    
    double getTotal(){
        return (round(100*total))/(double)100;
    }
    
    void calcSales(int model, int quantity){
        total += modelPrices[model-1]*quantity;
    }
}