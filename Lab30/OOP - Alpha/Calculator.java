import static java.lang.System.out;
import static java.lang.Math.pow;

public class Calculator{
    private double num1, num2;
    private int op;

    //constructors
    public Calculator(){
        num1 = num2 = op = 0;
    }

    //mutators
    public void setNumber1(double n){
        num1 = n;
    }

    public void setNumber2(double n){
        num2 = n;
    }

    public void setOperation(int o){
        op = o;
    }
    //accessors
    public double getAnswer(){
        switch(op){
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1*num2;
            case 4:
                return num1/num2;
            case 5:
                return num1%num2;
            case 6:
                return pow(num1,num2);
            default:
                return 0;
        }
    }

    public void displayChoices(){
        out.println("(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division\n(5) Modulus\n(6) Exponentiation");
    }
    
    public String getProblem(){
        switch(op){
            case 1:
                return num1 + " + " + num2;
            case 2:
                return num1 + " - " + num2;
            case 3:
                return num1 + " * " + num2;
            case 4:
                return num1 + " / " + num2;
            case 5:
                return num1 + " % " + num2;
            case 6:
                return num1 + " ^ " + num2;
            default:
                return null;
        }
    }
}