
import java.util.*;
//Name: 

public class PracticeProblems
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        int num1,num2;
        System.out.print("Enter a value for num1 >>> ");
        num1 = console.nextInt();
        console.nextLine();
        System.out.print("Enter a value for num2 >>> ");
        num2 = console.nextInt();
        console.nextLine();
        
        //2
        boolean numsAreSame = num1 == num2;
        //3
        System.out.println("num1 and num2 are the same? >>> " + numsAreSame);
        System.out.println();
        
        //4
        double totalBill;
        double discount;
        System.out.print("Enter total bill amount >>> $");
        totalBill = console.nextInt();
        console.nextLine();
        if (totalBill >= 1000 && totalBill < 2000){
            discount = totalBill * 0.10;
            System.out.println("10% discount >>> $" + discount);
            totalBill -= discount;
        }
        else if (totalBill >= 2000){
            discount = totalBill * 0.15;
            System.out.println("15% discount >>> $" + discount);
            totalBill -= discount;
        }
        System.out.println("New total after discount (if applicable) >>> $" + totalBill);
        System.out.println();
        
        //5
        boolean hasCoupon;
        System.out.print("Customer has a coupon? >>> ");
        hasCoupon = console.nextBoolean();
        console.nextLine();
        discount = 0;
        if (hasCoupon == true){
            discount = totalBill * 0.05;
            totalBill -= discount;
        }
        System.out.println("Coupon discount >>> $" + discount);
        System.out.println("New total after coupon (if applicable) >>> $" + totalBill);
        
        //6
        //a Cold
    }
}
