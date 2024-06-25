package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices.Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Challenge105 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Calculatefactorial task = new Calculatefactorial(i+1);
            list.add(service.submit(task));
        }
        for (int i = 0; i <10; i++) {
            System.out.printf("\nFactorial of %d is %d",i+1, list.get(i).get());
        }
        service.shutdown();
    }
}
