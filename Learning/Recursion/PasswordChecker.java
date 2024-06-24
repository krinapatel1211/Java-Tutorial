package Learning.Recursion;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do{
            System.out.println("Enter the password: ");
            password = sc.next();
        }
        while(!isValidPassword(password));
        System.out.println("Thanks for entering");
    }

    public static boolean isValidPassword(String password){
        return password.length()>6;

    }
}
