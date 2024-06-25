package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices.Challenges;

public class SimpleTask implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.printf("\nNumber is %d", i);
        }
    }


}
