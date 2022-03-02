import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{
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