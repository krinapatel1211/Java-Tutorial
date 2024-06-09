package Functions;

import java.util.Scanner;

public class Exercise1_1 {
    public static float calculateAverage(int[] numbers){
        float total = 0;
        for (int i=0; i<numbers.length; i++){
            total += numbers[i];
        }
        return total/numbers.length;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you would like to enter? ");
        int number = sc.nextInt();
        int marks[] = new int[number];
        for (int i=0; i<number; i++){
            System.out.print("Enter marks for subject "+i+ ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println(calculateAverage(marks));
        sc.close();
    }
}
