package LeetCode;

import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i=0; i<nums.length; i=i+2){
            if(nums[i]<=nums[i+1]){
                maxSum += nums[i];
            }
            else{
                maxSum += nums[i+1];
            }
        }
        System.out.println(maxSum);
        
    }
}
