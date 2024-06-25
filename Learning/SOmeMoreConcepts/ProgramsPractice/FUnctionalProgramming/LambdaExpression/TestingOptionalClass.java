package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;
import java.util.Optional;

public class TestingOptionalClass {
    public static void main(String[] args) {
         List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

         Optional<Integer> newSum = numbers.stream().reduce(Integer::sum);

         if (newSum.isPresent()){
            System.out.println(newSum.get());
         }
         else{
            System.out.println("List is Empty!");
         }
    }
}
