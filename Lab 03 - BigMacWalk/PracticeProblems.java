
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        //1
        double tuna = 2.99;
        System.out.println(tuna + 3);
        
        //2
        tuna ++;
        System.out.println(tuna);
        
        //3
        tuna += 5;
        System.out.println(tuna);
        
        //4
        tuna = tuna/10;
        System.out.println(tuna);
        
        //5
        int a = 4, b = 6;
        System.out.println(2 * a + 3 * b * (a + b) / 2);
        
        //6
        int c = 5, d = 9;
        System.out.println(-1 * (c + d) * (c + d) / 4);
        
        //8
        double something = 4.5;
        System.out.println(something*something);
        
        //9
        final double PI = 3.14159;
        double radius = 6.5;
        System.out.print("Area of circle 1 >>> ");
        System.out.println(PI*radius*radius);
        radius = 7.2;
        System.out.print("Area of circle 2 >>> ");
        System.out.println(PI*radius*radius);
        System.out.println();
        //10
        int cards = 52, players = 6;
        System.out.print("Cards in each hand >> ");
        System.out.println(cards / players);
        System.out.print("Cards left over >>> ");
        System.out.println(cards % players);
    }
}
