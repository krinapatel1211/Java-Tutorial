package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class Challenge99Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("\n%d Hello from Thread 2", i);
        }

    }
}
