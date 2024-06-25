package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;

public class TestingMethodReferences {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
            .filter(number -> number % 2==1)
            .forEach(number -> System.out.println(number + " "));

        System.out.println("Using Method reference :");
        numbers.stream()
            .filter(number -> number % 2==1)
            .forEach(System.out::println);

        int newSumReduce = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum using reduce is : "+ newSumReduce);
    }
}
