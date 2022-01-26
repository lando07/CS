import static java.lang.System.out;

public class OtherExec {
    private OtherExec() {
    }

    public static void whyTho() throws Exception {
        UnivRefs refs = UnivRefs.getInstance();// so I can use the Universal References
        refs.bluejClear();
        refs.bufferedReader("Welcome.txt");
        UnivRefs.console.nextLine();
        refs.bluejClear();
        while (refs.getStillExploring()) {// The loop so they can run multiple labs
            refs.bufferedReader("Options.txt");
            out.print("Enter a lab number(or -1 to exit):");
            int opt = UnivRefs.console.nextInt();
            UnivRefs.console.nextLine();
            refs.bluejClear();
            if (opt == 0) {
                LabCaller.chooseLab(opt);
            } else if (opt == -1) {
                refs.setStillExploring(false);
                continue;
            } else if (opt == 1) {
                LabCaller.chooseLab(opt);
            } else if (opt == 2) {
                LabCaller.chooseLab(opt);
            } else if (opt == 3) {
                LabCaller.chooseLab(opt);
            } else if (opt == 4) {
                LabCaller.chooseLab(opt);
            } else if (opt == 5) {
                LabCaller.chooseLab(opt);
            } else if (opt == 6) {
                LabCaller.chooseLab(opt);
            } else if (opt == 7) {
                LabCaller.chooseLab(opt);
            } else if (opt == 8) {
                LabCaller.chooseLab(opt);
            } else if (opt == 9) {
                LabCaller.chooseLab(opt);
            } else if (opt == 10) {
                LabCaller.chooseLab(opt);
            } else if (opt == 11) {
                LabCaller.chooseLab(opt);
            } else if (opt == 12) {
                LabCaller.chooseLab(opt);
            } else if (opt == 13) {
                LabCaller.chooseLab(opt);
            } else if (opt == 14) {
                LabCaller.chooseLab(opt);
            } else if (opt == 15) {
                LabCaller.chooseLab(opt);
            } else if (opt == 16) {
                LabCaller.chooseLab(opt);
            } else if (opt == 17) {
                LabCaller.chooseLab(opt);
            }
            out.print("\nPress ENTER to return to the menu: ");
            UnivRefs.console.nextLine();
            refs.bluejClear();
            Thread.sleep(100);
        }
        refs.bluejClear();
        out.println("Exiting...");
        Thread.sleep(500);
        refs.bluejClear();
    }
}
