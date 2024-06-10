
public class CheckEvenNumber {
    public static boolean checkEvenNumber(int number){
        if (number%2==0){
            return true;
        }
        else{ return false;}
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(checkEvenNumber(n));
    }
}
