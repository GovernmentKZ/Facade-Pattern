public class Runner {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    public void solveProblems(){
        job.doJob();
        bugTracker.startScript();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
