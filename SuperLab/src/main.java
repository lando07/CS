import static java.lang.System.out;

public class main extends localizedMainExec {
    public static void main(String[] args) {
        String osStr = System.getProperty("os.name").toLowerCase();
        if (osStr.contains("windows"))
            new localizedMainExec(1);
        else {
            if (System.console() != null)
                new localizedMainExec(0);
            else
                new localizedMainExec(2);
        }
    }
}