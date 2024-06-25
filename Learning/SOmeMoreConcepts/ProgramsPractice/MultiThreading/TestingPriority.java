package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class TestingPriority {
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();

        RunnableTask1 task1 = new RunnableTask1('*');
        RunnableTask1 task2 = new RunnableTask1('$');
        RunnableTask1 task3 = new RunnableTask1('#');
        
        Thread t1 = new Thread(task1);
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(task2);
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3 = new Thread(task3);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("%s Total Time taken: %d", Thread.currentThread().getName(), endTime-startTime);
    }
}
