package LeetCode;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 7;
        System.out.println(isHappyNumber(number));
        
    }

    public static int isHappyNumber(int number){
        if (number <10){
            return number;
        }
        int sum = 0;
        String numString = String.valueOf(number);
        for(char c : numString.toCharArray()){
            sum += Math.pow((int) c-'0', 2);
        }
        return isHappyNumber(sum);
    }
}
