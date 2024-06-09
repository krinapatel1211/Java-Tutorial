package LeetCode;

public class PowerOfTwo {

    //Using Recursion
    public static boolean calculatePowerOfTwo(int number, int index, int poweredNumber){
        if (poweredNumber==number){
            return true;
        }
        poweredNumber = poweredNumber*2;
        if(poweredNumber>number){
            return false;
        }
        else{
            return calculatePowerOfTwo(number, index+1, poweredNumber);
        }
    }

    //Without using Recursion
    public static boolean calculateWithoutRecursion(int number){
        int powerofTwo = 1;
        while(true){
            powerofTwo *= 2;
            if (powerofTwo >= number){
                break;
            }
        }
        return (powerofTwo==number) ? true: false;

    }   

    public static void main(String[] args) {
        int n=1024;
        //System.out.println(calculatePowerOfTwo(n, 0, 1));
        System.out.println(calculateWithoutRecursion(n));
    }
}
