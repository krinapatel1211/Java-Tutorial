package Recursion;

public class Recursion1 {

    public static void printNumbers(int x){
        if(x > 5){
            return;
        }
        System.out.println(x);
        printNumbers(x+1);
    }

    public static void printFirstNNaturalNumbers(int n, int sum){
        if (n==0){
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        printFirstNNaturalNumbers(n-1, sum);
    }

    public static int calculateFactorial(int number){
        if (number==0 || number==1){
            System.out.println("Calculating factorial of " + (number) + "! = " + 1);
            return 1;
        }
        int factorial = number * calculateFactorial(number-1);
        System.out.println("Calculating factorial of " + (number) + "! = " + factorial);
        return factorial;
    }
    
    public static void main(String[] args) {
        // int n = 1;
        // printNumbers(n);

        // int x = 10;
        // int sum = 0;
        // printFirstNNaturalNumbers(x, sum);

        int n = 10;
        System.out.println(calculateFactorial(n));
    }
}
