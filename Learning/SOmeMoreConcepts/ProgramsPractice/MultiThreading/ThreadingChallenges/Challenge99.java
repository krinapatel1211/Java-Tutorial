package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class Challenge99 {
    public static void main(String[] args) {
        Challenge99Thread t1 = new Challenge99Thread();
        Challenge99Thread2 t2 = new Challenge99Thread2();

        System.out.println("Thread 1 started\n");
        t1.start();
        System.out.println("Thread 2 started\n");
        t2.start();
    }
}
