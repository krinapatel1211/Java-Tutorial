package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class RunnableTask1 implements Runnable{
    private final char targetCharacter;

    public RunnableTask1(char targetCharacter){
        this.targetCharacter = targetCharacter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%s ", i, targetCharacter);
        }
        System.out.printf("\n%s Task with %c is completed!", Thread.currentThread().getName(), targetCharacter);
    }
}
