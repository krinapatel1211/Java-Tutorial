package LeetCode;

public class SquareRoots {
    public static void main(String[] args) {
        int number = 2147395599;
        if (number==0 || number==1){
            System.out.println("Squrt =" + number);
        }
        int low = 1; int high = number/2;
        int result = 0;

        while(low<=high){
            int mid = (high+low)/2;
            System.out.println(low + " : " + mid + " : " + high);
            if(mid*mid == number){
                result = mid;
                break;
            }
            else if(mid * mid < number){
                low = mid +1;
                result = mid;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(result);
    }
}
