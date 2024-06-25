package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class Challenge100Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Thread Execution in Progress!");    
        }
        System.out.println("Task COMPLETED!");
    }
}
