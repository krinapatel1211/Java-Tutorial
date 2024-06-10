
import java.util.ArrayList;
import java.util.List;

public class GreaterCommonDivisor {
    public static void calculateGCD(int number1, int number2){
        List<Integer> factorsNum1= new ArrayList<Integer>();
        List<Integer> factorsNum2= new ArrayList<Integer>();
        
        for (int i=1; i<number1/2; i++){
            if (number1%i==0){
                factorsNum1.add(i);
            }
        }
        factorsNum1.add(number1);
        for (int i=1; i<number2/2; i++){
            if (number2%i==0){
                factorsNum2.add(i);
            }
        }
        factorsNum2.add(number2);
        System.out.println("Factors of : "+ number1 + " are: " + factorsNum1);
        System.out.println("Factors of : "+ number2 + " are: " + factorsNum2);

        List<Integer> l3 = new ArrayList<Integer>(factorsNum1);
        l3.retainAll(factorsNum2);

        System.out.println(l3);
    }
    public static void main(String[] args) {
        calculateGCD(13, 48);
    }
    
}
