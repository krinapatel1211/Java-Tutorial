package Recursion;

public class FibonacciSeries {

    public static void printFibonnacciSeries(long a, long b, long number){
        if (number==0){
            return;
        }
        long c = a+b;
        System.out.println(c + ", ");
        printFibonnacciSeries(b, c, number-1);

    }
    public static void main(String[] args) {
        long n=100; //it should print 0,1,1,2,3
        long a=0;long b=1;
        System.out.print(a + ", ");
        System.out.print(b + ", ");

        printFibonnacciSeries(a, b, n-2);

    }
}
