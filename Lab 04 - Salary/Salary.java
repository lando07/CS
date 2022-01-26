
//Name: 

public class Salary
{

    public static void main(String[] args)
    {
        double hourlyRate, hoursWorked, overtimeHours, totalSalary, overtimePaid;
        hourlyRate = 10;
        hoursWorked = 40;
        overtimeHours = 10;
        totalSalary = hoursWorked*hourlyRate; //I first gathered the money earned normally so it makes more sensse
        overtimePaid = overtimeHours * (hourlyRate*1.5);//the hourlyRate is multiplied first so java doesn't get confused
        totalSalary += overtimePaid;//combining the overtime pay and existing salary
        System.out.println("Hourly rate >>> $" + hourlyRate);
        System.out.println("Regular hours worked >>> " + hoursWorked);
        System.out.println("Overtime hours worked >>> " + overtimeHours);
        System.out.println();
        System.out.println("Total salary (before taxes) >>> $" + totalSalary);
        totalSalary -= totalSalary * 0.25;
        System.out.println("Net salary (after taxes) >>> $" + totalSalary);
    }
}
