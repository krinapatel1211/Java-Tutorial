package LeetCode;

import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int number =7;
        ArrayList<Integer> arr = new ArrayList<>();
        while (number!=1){
            while(number0){
                if (number<9){
                    arr.add(number);
                    break;
                }
                arr.add(number%10);
                number /= 10;
            }
            System.out.println(arr);
            number = 0;
            for (int i: arr){
                number += i*i;
            }
            arr.clear();
        }
        if (number == 1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a Happy Number");
        }
    }
}
