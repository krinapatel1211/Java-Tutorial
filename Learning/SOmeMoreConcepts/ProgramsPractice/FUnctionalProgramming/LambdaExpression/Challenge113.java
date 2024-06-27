package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge113 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,3,5,7,3,0);

        List<Integer> dictinctNumbers = numbers.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(dictinctNumbers);
    }
}
