public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startScript(){
        System.out.println("Script is Active");
        activeSprint = true;
    }
    public void finishScript(){
        System.out.println("Script is not Active");
        activeSprint = false;
    }
}
