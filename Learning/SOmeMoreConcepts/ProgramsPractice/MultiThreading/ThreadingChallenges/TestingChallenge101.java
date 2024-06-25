package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class TestingChallenge101 {
    public static void main(String[] args) throws InterruptedException {
        Challenge101Thread t1 = new Challenge101Thread(1);
        Challenge101Thread t2 = new Challenge101Thread(2);
        Challenge101Thread t3 = new Challenge101Thread(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }

}

    
