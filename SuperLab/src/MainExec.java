import static java.lang.System.console;
import static java.lang.System.getProperty;

//Name: Landon Smith

public class MainExec {

    public static void main(String[] args) throws Exception {
        UnivRefs refs = UnivRefs.getInstance();
        if (console() != null) {
            String os = getProperty("os.name").toLowerCase();
            if (os.contains("windows")) {
                // run for windows
                WinExec.win();
            } else {
                // run for other os' besides windows
                LinuxExec.linux();
            }
        } else {
            refs.bufferedReader("Warning.txt");
            // run in non-console env.(why tho...)
            OtherExec.whyTho();
        }
    }
}
