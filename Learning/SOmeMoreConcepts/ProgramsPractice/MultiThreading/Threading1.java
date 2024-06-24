package Learning.SOmeMoreConcepts.ProgramsPractice.MultiThreading;

public class Threading1 {
    // need of Multi threading

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n Task with Star is completed!");

        // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n Task with Dollar is completed!");

        // Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n Task with HASH is completed!");

        long endTime = System.currentTimeMillis();

        System.out.printf("Total Time taken: %d", endTime-startTime);
    }
}
