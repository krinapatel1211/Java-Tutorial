package LeetCode;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                break;
            }
            if(i==0){
                digits = new int[digits.length + 1];
                digits[0] = 1;

            }
            else{
                digits[i]=0;
            }
            
        }
        for(int i: digits){
            System.out.println(i);

        }
    }
}
