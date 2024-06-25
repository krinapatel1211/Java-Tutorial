package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis();

        RunnableTask1 task1 = new RunnableTask1('*');
        RunnableTask1 task2 = new RunnableTask1('$');
        RunnableTask1 task3 = new RunnableTask1('#');
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        Thread t3 = new Thread(task3);

        System.out.println("\nThread 0 started!");
        t1.start();
        System.out.println("\nThread 1 started!");

        t2.start();
        System.out.println("\nThread 2 started!");
        t1.join();

        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("\n\n%s Total Time taken: %d", Thread.currentThread().getName(), endTime-startTime);
    }
}
