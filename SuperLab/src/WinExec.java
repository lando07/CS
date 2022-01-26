import static java.lang.System.getProperty;
import static java.lang.System.out;

public class WinExec {
    // this makes sure the class is not instansiated
    private WinExec() {
    }

    public static void win() throws Exception {
        UnivRefs refs = UnivRefs.getInstance();
        refs.cls();
        refs.bufferedReader("Welcome.txt");
        UnivRefs.console.nextLine();
        refs.cls();
        while (refs.getStillExploring()) {// The loop so they can run multiple labs
            refs.bufferedReader("Options.txt");
            out.print("Enter a lab number(or -1 to exit):");
            int opt = UnivRefs.console.nextInt();
            UnivRefs.console.nextLine();
            refs.cls();
            if (opt == -1) {
                refs.setStillExploring(false);
                continue;
            } else if (opt == 16) { //Lab 16 needs this because there is some left over buffer code
                LabCaller.chooseLab(opt);
                UnivRefs.console.nextLine();
            } else {
                LabCaller.chooseLab(opt);
            }
            out.print("\nPress ENTER to return to the menu: ");
            UnivRefs.console.nextLine();
            refs.cls();
            Thread.sleep(100);
        }
        refs.cls();
        out.println("Exiting...");
        Thread.sleep(500);
        refs.cls();
    }
}