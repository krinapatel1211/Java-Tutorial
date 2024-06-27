package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;

public class Challenge115 {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "4", "8", "3", "9", "2");

        numbers.stream()
            .map(Integer::parseInt)
            .map(num -> Math.pow(num, 2))
            .reduce((a,b) -> a+b)
            .ifPresent(System.out::println);




    }
}
