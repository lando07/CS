import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
//Name: 

public class BirthdayCalculator
{

    public static void main(String[] args)
    {
        try(Scanner console = new Scanner(in)){
            out.print("What month is it now? >>> ");
            int tmpMnth = console.nextInt();
            out.print("What day is it now? >>> ");
            int tmpDay = console.nextInt();
            out.print("What month is your birthday? >>> ");
            int tmpbMnth = console.nextInt();
            out.print("What day is your birthday? >>> ");
            int tmpbDay = console.nextInt();
            out.println();
            int days = calcBDay(tmpDay,tmpMnth,tmpbDay,tmpbMnth);
            out.println("Days until your birthday >>> " + days);
        }
    }

    public static int calcBDay(int currDay, int currMnth, int bDay, int bMonth){
        int days = 0;
        if(bMonth == 3 && currMnth == 2){
            days += 28 - currDay;
            days += bDay;
            return days;
        }
        switch(bDay - currDay){
            case 0:
                return 0;
            case 1:
                return 1;
            case -1:
                if(currMnth < bMonth || (currMnth == bMonth))
                    return 364;
                else
                    return 335;
            default:
        }
        days = mnthCalc(currMnth, bMonth);
        if(currMnth % 2 == 0){
            days -= 30 - currDay;
        }
        else{
            days -= 31 - currDay;
        }
        if(bMonth % 2 == 0){
            days += bDay;
        }
        else{
            days += bDay;
        }
        if(bMonth == 2 || currMnth == 2){
            days -= 28;
        }
        return days;
    }

    private static int mnthCalc(int currMnth, int bMonth){
        int totalMonths = 0;
        if(bMonth <= currMnth){
            totalMonths = (12-currMnth)+bMonth;
        }
        else{
            totalMonths = bMonth - currMnth;
        }
        int daysTotal = 0;
        if(totalMonths % 2 == 0){
            daysTotal += (totalMonths/2)*30;
            daysTotal += (totalMonths/2)*31;
            return daysTotal;
        }
        else{
            daysTotal += ((totalMonths - 1)/2)*30;
            daysTotal += ((totalMonths - 1)/2)*31+31;
            return daysTotal;
        }
    }
}
