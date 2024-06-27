package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

public class Employee {
    private final String EmployeeName;
    private final Integer Salary;
    
    public Employee(String employeeName, Integer salary) {
        EmployeeName = employeeName;
        Salary = salary;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public Integer getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee [EmployeeName=" + EmployeeName + ", Salary=" + Salary + "]";
    }

    

    

}
