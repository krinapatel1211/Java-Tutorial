package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices.Challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Challenge104 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            ThreadTask1 task = new ThreadTask1();
            service.submit(task);
        }

        if (!service.awaitTermination(15,TimeUnit.SECONDS)){
            System.out.println("\n *******************");
            service.shutdownNow();
        }
    }
}
