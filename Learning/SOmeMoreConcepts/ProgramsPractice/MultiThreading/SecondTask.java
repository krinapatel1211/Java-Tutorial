package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class SecondTask extends Thread {
    @Override
    public void run() {
        // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.printf("\n%s  Task with Dollar is completed!", Thread.currentThread().getName());
    }
    
}
