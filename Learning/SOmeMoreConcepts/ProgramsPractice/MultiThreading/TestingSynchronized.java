package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class TestingSynchronized {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        COunter counter = new COunter();

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
    
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted" + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        
        System.out.printf("Final counter value: %d \nand Time taken %d", counter.getCount(), endTime-startTime);
    }
}
