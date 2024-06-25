package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading.ThreadingChallenges;

public class Challenge101Thread extends Thread{
    private int threadNumber;

    public Challenge101Thread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        System.out.printf("\n%s Thread STarted %d",
            Thread.currentThread().getName(), 
            threadNumber);
         
            
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("\n%s Thread ENDED %d",
            Thread.currentThread().getName(), 
            threadNumber);

    
    }
}
