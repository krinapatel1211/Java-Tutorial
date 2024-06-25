package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class UpdaterThread extends Thread {
    private final COunter count;

    public UpdaterThread(COunter count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count.increament();
        }
    }
}
