package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class TestingFilterAndReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Date","Orange");
        System.out.println(fruits);

        System.out.println("Printing fruits using Stream.");
        fruits.stream().forEach(new Consumer<String>() {
            public void accept(String fruit) {
                System.out.println(fruit);
            };
        });

        //Filtering and Reduce
        System.out.println("Printing fruits using filtering and  Lambda expression.");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));

        // Reduce
        List<Integer> numbers = List.of(1,2,3,4,5,6,0,7,8,99);
        int newSum = numbers.stream()
            .reduce(0, new BinaryOperator<Integer>() {
                public Integer apply(Integer t, Integer u) {
                    return t+u;
                };
            });

        System.out.printf("Sum using reduce is : %d ", newSum);

        // Reduce using lambda
        int newSumReduce = numbers.stream().reduce(0, (a, b) -> a+b);
        System.out.println("Sum using reduce is : "+ newSumReduce);
        
        int maxNumber = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a>b ? a: b);
        System.out.println("Max number is : "+ maxNumber);
        
        
        

    }
}
