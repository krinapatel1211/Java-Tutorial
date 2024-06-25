package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices.Challenges;

public class ThreadTask1 implements Runnable{
    
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.printf("\nCurrent Thread %s started", currentThread.getName());

        try {
            Thread.sleep(getRandomNumber()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("\nCurrent Thread %s ended", currentThread.getName());
    }

    public int getRandomNumber() {
        int randomNumber = (int) Math.random()*5+1;
        System.out.printf("Sleep for %d", randomNumber);
        return randomNumber;
    }

}
