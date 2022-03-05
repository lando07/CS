public class params implements AutoCloseable {
    private static params params;
    private boolean stillExploring = true;
    private int labNum;
    private char AorB;
    private int os;

    private params() {
    }

    boolean getStillExploring() {
        return stillExploring;
    }

    char getAorB() {
        return AorB;
    }

    int getLabNum() {
        return labNum;
    }

    int getOsNum() {
        return os;
    }

    void setOsNum(int osParam) {
        os = osParam;
    }

    void setStillExploring(boolean newState) {
        stillExploring = newState;
    }

    void setAorB(char newState) {
        AorB = newState;
    }

    void setLabNum(int newState) {
        labNum = newState;
    }

    public static params getInstance() {
        if (params == null) {
            params = new params();
            return params;
        } else
            return params;
    }

    public void close() {
        params = null;
    }
}
