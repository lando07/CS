import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class SuperLab2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        if (System.console() == null) {
            Objs.init(2);
        } else if ("windows".equalsIgnoreCase(System.getProperty("os"))) {
            Objs.init(0);
        } else {
            Objs.init(1);
        }
        Start.main();
    }
}

class Start {
    private Start() {
    }

    static void main() throws IOException, InterruptedException {
        Objs.clearScreen();
        try (Scanner console = Objs.getScanner()) {
            Objs.fileReader("Welcome.txt");
            console.nextLine();
            Objs.clearScreen();
            Objs.fileReader("Opt.txt");
            ControlVars.setLabSelection(console.nextInt());
            
        }
    }
}