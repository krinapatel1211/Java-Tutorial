package Other;

import java.util.Scanner;

public class Funtcions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static int calculateFactorial(int number, int fact){
        if (number==1){
            return fact;
        }
        fact *= number;
        return calculateFactorial(number-1, fact);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        System.out.println(calculateFactorial(5, 1));
    }
    
}
