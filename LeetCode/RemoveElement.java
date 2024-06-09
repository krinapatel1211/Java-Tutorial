package LeetCode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        if (nums.length==0){
            System.out.println("Array Empty");
        }
        for (int i=0; i<nums.length; i++){
            if(nums[i]==val){
                nums[i]=nums[i+1];
            }
        }
    }
}
