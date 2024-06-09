package Other;
import java.util.*;
import java.util.Iterator;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        for (int value: nums){
            set.add(value);
        }
 
        System.out.println(set.contains(1));
        System.out.println(set + " " + set.size());

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // if(nums.length == 0){
        //     System.out.println("Empty list");
        // }
        // int i=0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[i]!=nums[j]){
        //         i++;
        //         nums[i]=nums[j];
        //     }
        // }
        // System.out.println(i+1);
        // for(int j: nums){
        //     System.out.print(nums[j] + ", ");
        // }

    }
}
