package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices;

public class PrintTask extends Thread {
    private char threadChar;

    public PrintTask(char threadChar){
        this.threadChar = threadChar;
    }
    @Override
    public void run() {
        System.out.printf("\n%s Thread STarted %c",
            Thread.currentThread().getName(), 
            threadChar);
         
        System.out.println("Thread Sleeping");  
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("\n%s Thread ENDED  aftre sleeping for 5 seconds%c",
            Thread.currentThread().getName(), 
            threadChar);
    }

}
