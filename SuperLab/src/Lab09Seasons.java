
//Name: 

public class Lab09Seasons {
    private Lab09Seasons() {
    }

    public static void Lab09() {
        int month;
        int day;
        System.out.print("Enter month as integer >>> ");
        month = console.nextInt();
        console.nextLine();
        System.out.print("Enter day as integer >>> ");
        day = console.nextInt();
        console.nextLine();

        if (month == 12 || month <= 3) {
            if (day <= 16) {
                System.out.println("Season: Winter");
            }
        } else if (month >= 3 && month <= 6) {
            if (day < 16) {
                System.out.println("Season: Spring");
            }
        } else if (month >= 6 && month <= 9) {
            if (day < 16) {
                System.out.println("Season: Summer");
            } else {
                System.out.println("Season: Fall");
            }
        }
    }
}
