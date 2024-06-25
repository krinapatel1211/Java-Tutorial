package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.Sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Befor Sleeping");
        Thread.sleep(5000);
        System.out.println("Woke UP");
    }
}
