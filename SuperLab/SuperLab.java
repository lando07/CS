import static java.lang.System.out;

import java.util.Scanner;

public class SuperLab {
    private static final String WELCOME = Objs.readFile("Welcome.txt");
    private static final String OPT = Objs.readFile("opt.txt");

    public static void main(String[] args) {
        Objs.clearScreen();
        try (Scanner console = Objs.getScanner()) {
            out.print(WELCOME);
            console.nextLine();
            Objs.clearScreen();
            out.print(OPT);
            Objs.setOpt(console.nextInt());
            console.nextLine();
            Objs.clearScreen();
            
        }
    }
}