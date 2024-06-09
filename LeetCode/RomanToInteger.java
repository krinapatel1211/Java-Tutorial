package LeetCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String romanNumber = "IX";

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        System.out.println(map);

        int result = 0;
        for (int i=0; i<romanNumber.length(); i++){
            if (i+1 < romanNumber.length() && map.get(romanNumber.charAt(i)) < map.get(romanNumber.charAt(i+1))){
                result -= map.get(romanNumber.charAt(i));
            }
            else{
                result += map.get(romanNumber.charAt(i));
            }
        }

        System.out.println("Integer value for Roman " + romanNumber + " = " + result);
    }
}
