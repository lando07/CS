import java.io.IOException;

public class Superlab {
    public static void main(String[] args) throws IOException, InterruptedException {
        String osStr = System.getProperty("os.name").toLowerCase();
        if (System.console() != null) {
            if (osStr.contains("windows"))
                localizedMainExec.localizer(1);
            else
                localizedMainExec.localizer(0);
        } else {
            localizedMainExec.localizer(2);
        }
    }
}