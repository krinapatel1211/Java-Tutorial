package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class TrafficSignalThread extends Thread {
    private String signal;
    private int offTime;
    
    public TrafficSignalThread(String signal, int offTime) {
        this.signal = signal;
        this.offTime = offTime;
    }

    @Override
    public void run() {
        System.out.printf("\n%s signal is On for %d seconds", signal, offTime/1000);
        try {
            Thread.sleep(offTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("\n%s signal is Ended After %d seconds", signal, offTime);
    }
        
}
