package Learning.SOmeMoreConcepts.ProgramsPractice.FUnctionalProgramming.LambdaExpression;

public class TestingLambda {
    public static void main(String[] args) {

        TestingLambda test = new TestingLambda();
        System.out.println("Hello World!");
        test.printString("Hello Krina!");
        System.out.printf("Sum is %d", test.sum(4,5));

    }

    public int sum(int a, int b){
        return (a+b);
    }

    public void printString(String str){
        System.out.println(str);
    }
}
