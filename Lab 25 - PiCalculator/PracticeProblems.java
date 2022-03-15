import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.Random;
//Name:

public class PracticeProblems {
    private static Random rand=new Random();

    public static void main(String[] args) {
        //1
        out.println(5+" is Odd? >>> "+isOdd(5)+"\n"+6+" is Odd? >>> "+isOdd(6)+'\n');
        //2
        out.println(15+" is a single digit? >>> "+isSingleDigit(15)+"\n"+-7+" is a single digit? >>> "+isSingleDigit(-7)+'\n');
        //3
        out.println("Max between "+100+" and "+200+"? >>> "+getMax(100,200)+"\nMax between "+ -3+" and "+4+"? >>> "+getMax(-3,4)+'\n');
        //4idk
        //5
        out.println("Random Roll >>> "+rollDice()+"\nRandom Roll >>> "+rollDice()+'\n');
        //6
        out.println("Random Roll (20 faces) >>> "+rollDice(20)+"\nRandom Roll (1000 faces) >>> "+rollDice(1000)+'\n');
        //7
        out.println("Caps fixing frEd >>> "+capitalizeOnlyFirst("frEd")+"\nCaps fixing sAlSA >>> "+capitalizeOnlyFirst("sAlSA")+'\n');
        //8
        out.println("Area of circle with radius 1.0? >>> "+circleArea(1)+"\nArea of circle with radius 8.5? >>> "+circleArea(8.5)+'\n');
        //9
        out.println(35 + " is a multiple of " + 5+"? >>> " + isMultiple(5,35)+'\n'+31+" is a multiple of 3? >>> " + isMultiple(3,31)+'\n');
        //10
        boolean[] primeArr = {isPrime(5),isPrime(33),isPrime(2),isPrime(301),isPrime(307)};
        int[] numArr = {5,33,2,301,307};
        for (int i = 0; i<primeArr.length; i++){
            out.println(numArr[i]+" is prime? >>> "+primeArr[i]);
        }
        out.println();
        //11
        out.println("Printing fred as diagonal");
        printDiagonal("fred");
        out.println("Printing salsa as diagonal");
        printDiagonal("salsa");
    }

    public static boolean isOdd(int a){
        return a%2!=0;
    }

    public static boolean isSingleDigit(int a){
        return a/10==0;
    }

    public static int getMax(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public static int rollDice(){
        return rand.nextInt(6)+1;
    }

    public static int rollDice(int faces){
        return rand.nextInt(faces)+1;
    }

    public static String capitalizeOnlyFirst(String name){
        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }

    public static double circleArea(double radius){
        return PI*pow(radius,2);
    }

    public static boolean isMultiple(int a,int b){
        return b%a==0;
    }

    public static boolean isPrime(long num){
        boolean prime=true;
        if(num==2)
            return prime;
        for(long i=2;i<sqrt(num)+1;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }

    public static void printDiagonal(String s){
        for(int i=0;i<s.length();i++){
            for(int e=0;e<i;e++){
                out.print(" ");
            }
            out.print(s.substring(i,i+1));
            out.println();
        }
    }
}
