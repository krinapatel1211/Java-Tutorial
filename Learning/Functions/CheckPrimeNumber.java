package Functions;

public class CheckPrimeNumber {
    public static boolean checkPrimeNumber(int number){
        if (number==1){
            return false;
        }
        for(int i=2; i<number/2; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 1;
        System.out.println(checkPrimeNumber(number));
    }
    
}
