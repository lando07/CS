public class params implements AutoCloseable{
    private static params params;
    private boolean stillExploring = true;
    private int labNum;
    
    private params() {
    }

    private boolean getStillExploring(){
        return stillExploring;
    }
    private void setStillExploring(boolean newState){
        stillExploring = newState;
    }

    private int getLabNum(){
        return labNum;
    }

    private void setLabNum(int newState){
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
