package LeetCode;

public class Palindrome {
    public static void main(String[] args) {
        int x = 123421;
        if (x<0){
            System.out.println("Not Palindrome");
        }
        else{
            String strNumber = Integer.toString(x);
            StringBuilder sb = new StringBuilder(strNumber);
            if(strNumber.equals(sb.reverse().toString())){
                System.out.println("Is Palindrome!");
            }
            else{
            System.out.println("Not Palindrome");

            }
        }
    }
}
