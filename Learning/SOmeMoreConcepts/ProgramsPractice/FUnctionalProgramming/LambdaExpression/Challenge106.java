package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;
import java.util.function.BinaryOperator;

public class Challenge106 {
    public static void main(String[] args) {
        
        BinaryOperator<Integer> multi = (a, b) -> a*b;
        System.out.println(multi.apply(6, 8));

        List<Integer> numbers = List.of(2,3,4,5,6,7,8,9);
        int product1 = numbers.stream().reduce(0, (a,b) -> a * b);
        System.out.println("Multiplication is :" +  product1);

    }
}
