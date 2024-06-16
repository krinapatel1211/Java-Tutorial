package LeetCode;
import java.util.*;
public class TopKElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,2,2,4,7,7};
        List<Integer> lst = Arrays.asList(nums);
        // int k = 1;
        PriorityQueue<Integer> pQueueMax = new PriorityQueue<>(Comparator.reverseOrder());
        pQueueMax.addAll(nums1);
        System.out.println(pQueueMax);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // List<Integer>[] bucket = new List[nums.length-1];
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i: nums){
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        // // System.out.println(map);

        // for (int key: map.keySet()){
        //     int occurence = map.get(key);
        //     if (bucket[occurence]==null){
        //         bucket[occurence] = new ArrayList<>();
        //     }
        //     bucket[occurence].add(key);
        // }
        // // System.out.println(bucket);
        
        // int[] result = new int[k];
        // int count=0;
        // for (int i = bucket.length-1; i>=0 && count<k; i--) {
        //     if (bucket[i]!=null){
        //         for (Integer n: bucket[i]){
        //             result[count++] = n;
        //         }
        //     }
        // }
        // for (int n: result){
        //     System.out.println(n);
        // }
    }
}
