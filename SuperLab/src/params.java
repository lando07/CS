public class params implements AutoCloseable{
    private static params params;
    private boolean stillExploring = true;
    private int labNum;
    
    private params() {
    }

    boolean getStillExploring(){
        return stillExploring;
    }
    void setStillExploring(boolean newState){
        stillExploring = newState;
    }

    int getLabNum(){
        return labNum;
    }

    void setLabNum(int newState){
        labNum = newState;
    }

    public static params getInstance() {
        if (params == null) {
            params = new params();
            return params;
        } else
            return params;
    }
    public void close(){
        params = null;
    }
}
