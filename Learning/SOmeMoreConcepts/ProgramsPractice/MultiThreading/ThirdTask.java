package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class ThirdTask extends Thread {
    @Override
    public void run() {
        // Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n%s  Task with HASH is completed!", Thread.currentThread().getName());
    }
}
