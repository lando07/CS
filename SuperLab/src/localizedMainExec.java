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

    public static void localizer(int os) throws IOException, InterruptedException{
        switch (os) {
            case 0:
                linux.main();
            case 1:
                win.main();
            case 2:
                bluej.main();
        }
    }
}

class linux {
    private linux() {
    }

    static void main() throws IOException, InterruptedException {
        UnivObjs clearObj = new UnivObjs(0);
        Scanner console = UnivObjs.getScanner();
        try (BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            out.println(localizedMainExec.FILENOTFOUND);
        }
        console.nextLine();
        clearObj.clear();
        try(BufferedReader br = new BufferedReader(new FileReader("Options.txt"))){
            String line;
            while((line = br.readLine()) != null){
                out.println(line);
            }
        }
        try(params controlParams = params.getInstance()){
            controlParams.setLabNum(console.nextInt());
        }

    }
}

class win {
    private win() {
    }

    static void main() throws IOException {
        UnivObjs univObjs = new UnivObjs(1);
        try (BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            out.println(localizedMainExec.FILENOTFOUND);
        }

    }
}

class bluej {
    private bluej() {
    }

    static void main() throws IOException {
        UnivObjs univObjs = new UnivObjs(2);
        try (BufferedReader br = new BufferedReader(new FileReader("Welcome.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            out.println(localizedMainExec.FILENOTFOUND);
        }
        // univObjs.nextLine(); isa confused
    }
}