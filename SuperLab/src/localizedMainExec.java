import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class localizedMainExec {
    static final String FILENOTFOUND = "Oops! File not found, make sure all text files are present!";

    private localizedMainExec() {
    }

    public static void localizer() throws IOException, InterruptedException {
        switch (params.getInstance().getOsNum()) {
            case 0:
                linux.main();
                return;
            case 1:
                win.main();
                return;
            case 2:
                bluej.main();
                return;
            default:
                throw new UnsupportedOperationException("Invalid option given");
        }
    }
}

class linux {
    private linux() {
    }

    static void main() throws IOException, InterruptedException {
        try (UnivObjs clearObj = new UnivObjs()) {
            Scanner console = UnivObjs.getScanner();
            try (BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    out.println(line);
                }
            } catch (FileNotFoundException e) {
                out.println(localizedMainExec.FILENOTFOUND);
            }
            while (params.getInstance().getStillExploring()) {
                console.nextLine();
                clearObj.clear();
                try (BufferedReader br = new BufferedReader(new FileReader("Options.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        out.println(line);
                    }
                }
                try (params controlParams = params.getInstance()) {
                    controlParams.setLabNum(console.nextInt());
                    switch (controlParams.getLabNum()) {
                        case -1:
                            params.setStillExploring(false);
                            break;
                        default:
                            labCaller caller = new labCaller();
                            caller.labsIndex();
                            out.print("Press enter to return to selection (or twice).");
                            console.nextLine();
                    }
                }
            }
        }
    }
}

class win {
    private win() {
    }

    static void main() throws IOException, InterruptedException {
        try (BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            out.println(localizedMainExec.FILENOTFOUND);
        }
        while (params.getInstance().getStillExploring()) {
            try (UnivObjs clearObj = new UnivObjs()) {
                Scanner console = UnivObjs.getScanner();

                console.nextLine();
                clearObj.clear();
                try (BufferedReader br = new BufferedReader(new FileReader("Options.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        out.println(line);
                    }
                }
                try (params controlParams = params.getInstance()) {
                    controlParams.setLabNum(console.nextInt());
                    switch (controlParams.getLabNum()) {
                        case -1:
                            params.setStillExploring(false);
                            break;
                        default:
                            labCaller caller = new labCaller();
                            caller.labsIndex();
                            out.print("\nPress enter to return to selection.");
                            console.nextLine();
                    }
                }
            }
        }
    }
}

class bluej {
    private bluej() {
    }

    static void main() throws IOException, InterruptedException {
        try (UnivObjs clearObj = new UnivObjs()) {
            Scanner console = UnivObjs.getScanner();
            try (BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    out.println(line);
                }
            } catch (FileNotFoundException e) {
                out.println(localizedMainExec.FILENOTFOUND);
            }
            while (params.getInstance().getStillExploring()) {
                console.nextLine();
                clearObj.clear();
                try (BufferedReader br = new BufferedReader(new FileReader("Options.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        out.println(line);
                    }
                }
                try (params controlParams = params.getInstance()) {
                    controlParams.setLabNum(console.nextInt());
                    switch (controlParams.getLabNum()) {
                        case -1:
                            params.setStillExploring(false);
                            break;
                        default:
                            labCaller caller = new labCaller();
                            caller.labsIndex();
                            out.print("Press enter to return to selection.");
                            console.nextLine();
                    }
                }
            }
        }
    }
}