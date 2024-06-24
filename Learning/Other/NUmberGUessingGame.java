package Learning.Other;

import java.util.Scanner;

public class NUmberGUessingGame {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberByComputer = 10;
        int numberByUser;
        do{
            System.out.println("Guess the number: ");
            numberByUser = sc.nextInt();
        }while(numberByComputer!=numberByUser);
        System.out.println("Number Guessed Correct");
    }
}
