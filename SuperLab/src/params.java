public class params {
    private static params params;
    private boolean stillExploring = true;
    private int osNum;
    private params() {
    }

    public static params getInstance() {
        if (params == null) {
            params = new params();
            return params;
        } else
            return params;
    }
}
