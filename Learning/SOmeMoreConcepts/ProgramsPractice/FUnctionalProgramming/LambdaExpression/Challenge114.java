package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

import java.util.List;

public class Challenge114 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Krina", 150000),
            new Employee("Deep", 100000),
            new Employee("Dhyey", 120000),
            new Employee("Neel", 110000),
            new Employee("Dhruvi", 180000),
            new Employee("Ram", 15000)
        );

         employees.stream()
            .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
            .forEach(System.out::println);

        // System.out.println(employees);
    }
}
