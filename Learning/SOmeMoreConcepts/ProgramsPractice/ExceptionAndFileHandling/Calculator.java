package Learning.SOmeMoreConcepts.ProgramsPractice.ExceptionAndFileHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        A();
        
    }
    private static void A(){
         B();   
    }
    private static void B(){
        C();
    }
    private static void C(){
        System.out.println("In C!");
        D();
    }

    private static void D(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator!");
        System.out.println("Enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        input.close();
        try{
            int[] arr = new int[4];
            System.out.println(arr[6]);
            arr[5] = first / second;
            System.out.println(arr[5]);
            // System.out.println(division);
        }
        catch(ArithmeticException ex){
            System.out.println("You cannot divide by Zero!");
            System.out.println(ex.getMessage());
        }
        // catch(ArrayIndexOutOfBoundsException exception){
        //     System.out.println(exception.getMessage());
        // }
        catch(Throwable th){
            System.out.println("Genaral Exception!");
            throw th;
        }
        finally{
            System.out.println("I am in Finally block!");
        }
    }
}
