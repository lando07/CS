
/**
 * Write a description of class PracticeProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeProblems
{
    public static void main(String[] args) {
        //1
        int num = 1;
        while (num != 10){
            System.out.print(num);
            num++;
        }
        System.out.println("\n");

        //2
        num = 1;
        while (num != 10){
            System.out.print(num + " ");
            num++;
        }
        System.out.println("\n");

        //3
        num = 1;
        while (num != 21){
            System.out.print(num + " ");
            num+=2;
        }
        System.out.println("\n");

        //4
        num = 5;
        do
        {
            System.out.print(num + " ");
            num += 5;   
        }
        while (num != 55);
        System.out.println("\n");

        //5
        num = 10;
        while (num != 0){
            System.out.print(num + " ");
            num --;
        }
        System.out.println("\n");

        //6 hes still alive

        //7
        num = -4;
        while (num != -44){
            System.out.print(num + " ");
            num -=4;
        }
        System.out.println("\n");

        //8
        num = 1;
        while (num != 512){
            System.out.print(num + " ");
            num *=2;
        }
        System.out.println("\n");

        //9
        num = 1000;
        while (num != 1){
            System.out.print(num + " ");
            num /= 2;
        }
        System.out.println("\n");

        //10
        num = 1;
        while (num != 9){
            System.out.print(num + " ");
            System.out.print("-"+ num + " ");
            num++;
        }
    }
}