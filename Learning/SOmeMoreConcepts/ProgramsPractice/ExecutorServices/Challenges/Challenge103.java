package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices.Challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge103 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        SimpleTask task1 = new SimpleTask();

        service.submit(task1);
        service.shutdown();
    
    }
}
