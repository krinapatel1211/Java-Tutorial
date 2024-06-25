package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FetchName t1 = new FetchName("Deep");
        FetchName t2 = new FetchName("Mine");
        FetchName t3 = new FetchName("KGF");
        FetchName t4 = new FetchName("Kuch Bhi");

        Future<String> name1 = service.submit(t1);
        Future<String> name2 = service.submit(t2);
        Future<String> name3 = service.submit(t3);
        Future<String> name4 = service.submit(t4);

        System.out.printf("\nFull name is : %s",name1.get());
        System.out.printf("\nFull name is : %s",name2.get());
        System.out.printf("\nFull name is : %s",name3.get());
        System.out.printf("\nFull name is : %s",name4.get());

        service.shutdown();
    }
}
