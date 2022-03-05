import java.io.IOException;

public class Superlab {
    public static void main(String[] args) throws IOException, InterruptedException {
        String osStr = System.getProperty("os.name").toLowerCase();
        try (params inputParams = params.getInstance()) {
            int osParam;
            if (System.console() != null) {
                if (osStr.contains("windows")) {
                    osParam = 1;
                    inputParams.setOsNum(osParam);
                    localizedMainExec.localizer();
                } else {
                    osParam = 0;
                    inputParams.setOsNum(osParam);
                    localizedMainExec.localizer();

                }
            } else {
                osParam = 2;
                inputParams.setOsNum(osParam);
                localizedMainExec.localizer();
            }
        }
    }
}