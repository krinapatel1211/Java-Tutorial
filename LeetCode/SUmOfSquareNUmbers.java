package LeetCode;

public class SUmOfSquareNUmbers {
    public static void main(String[] args) {
        int number = 1;
        for (int i=0; i<=number; i++){
            for(int j=i; j<=number; j++){
                int sum = 0;
                sum = i*i + j*j;
                if (sum == number){
                    System.out.println(i + ", " + j);
                }
                if (sum > number){
                    break;
                }
            }
        }
    }
}
