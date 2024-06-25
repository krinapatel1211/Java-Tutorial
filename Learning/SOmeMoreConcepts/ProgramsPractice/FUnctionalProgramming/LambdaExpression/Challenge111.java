package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.stream.IntStream;

public class Challenge111 {
    public static void main(String[] args) {
        int number = 1;

        // System.out.println("Calculate factorial using structural programming: " + calculateFactorial(number));

        System.out.println("Calculate factorial using functional programming :");

        System.out.println("Using Instream :");
        IntStream.rangeClosed(2, number)
            .reduce((a, b) -> a * b)
            .ifPresent(System.out::println);
    }

    // public static int calculateFactorial(int num){
    //     if (num==1 && num==0){
    //         return 1;
    //     }
    //     return num * calculateFactorial(num-1);
    // }
}
