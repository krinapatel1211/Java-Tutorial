package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class TestingTrafficSignal {
    public static void main(String[] args) throws InterruptedException{
        TrafficSignalThread t1 = new TrafficSignalThread("RED", 3000);
        TrafficSignalThread t2 = new TrafficSignalThread("GREEN", 5000);
        TrafficSignalThread t3 = new TrafficSignalThread("YELLOW", 1000);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();


    }
}
