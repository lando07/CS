package control;

public class ControlVars {
    private static boolean stillExploring = true;
    private static int labSelection = 0;
    private static char subLabSelection = 0;

    public static boolean getStillExploring() {
        return stillExploring;
    }

    public static int getLabSelection() {
        return labSelection;
    }

    public static char getSublabSelection() {
        return subLabSelection;
    }

    public static void setStillExploring(boolean newState) {
        stillExploring = newState;
    }

    public static void setLabSelection(int newState) {
        labSelection = newState;
    }

    public static void setSubLabSelection(char newState) {
        subLabSelection = newState;
    }

    private ControlVars() {

    }

}
