package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;

public class Challenge107 {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "BananaPineapple", "Date","Orange", "Pomogranate");
        System.out.println(fruits);

        fruits.stream().forEach(fruit -> System.out.println(fruit));

        System.out.println("Filtering the length > 10");
        fruits.stream()
            .filter(fruit -> fruit.length()<10)
            .forEach(fruit -> System.out.println(fruit));

        String concatStr = fruits.stream()
            .filter(fruit -> fruit.length()>10)
            .reduce("", (a, b) -> a + " " + b);
        System.out.println(concatStr); 

    }
}
