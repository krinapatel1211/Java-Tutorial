package Learning.SOmeMoreConcepts.ProgramsPractice.ExecutorServices.Challenges;

import java.util.concurrent.Callable;

public class Calculatefactorial implements Callable<Integer>{
    private int number;

    
    public Calculatefactorial(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int fact = calculateFact(number);
        return fact;
       
    }

    public static int calculateFact(int number){
        if (number==1){
            return 1;
        }
        return number * calculateFact(number-1);
    }

}
