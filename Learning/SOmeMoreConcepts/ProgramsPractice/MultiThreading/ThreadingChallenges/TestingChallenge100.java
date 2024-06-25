package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class TestingChallenge100 {
    public static void main(String[] args) throws InterruptedException {
        Challenge100Thread thread = new Challenge100Thread();

        System.out.println("Thread is starting");
        thread.start();

        System.out.println("Thread sleeping");
        Thread.sleep(2000);

        System.out.println("Thread sleeping again");
        Thread.sleep(2000);



    }
}
