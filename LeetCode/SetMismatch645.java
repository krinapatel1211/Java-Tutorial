package LeetCode;
import java.util.*;

public class SetMismatch645 {
    public static void main(String[] args) {
        int[] pair = {1,1};
        int[] nums = {3,4,4,1,2,2,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);

        for (int i=1; i<nums.length+1; i++){
            if (map.containsKey(i)){
                if(map.get(i)==2){
                    pair[0] = i;
                }
                else{
                    pair[1]= i;
                }
            }
        }
        for (int p : pair){
            System.out.print(p + " ");
        }
    }
}
