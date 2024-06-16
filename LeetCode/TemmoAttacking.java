package LeetCode;

public class TemmoAttacking {
    public static void main(String[] args) {
        int[] timeSeries = {1,2,3,4,5,6,7,8,9};
        int duration = 1;
        int i=0;
        int poisonEffect = 0;
        
        while(i<timeSeries.length){
            if (poisonEffect<timeSeries[i]){
                poisonEffect += duration;
            }
            else if(poisonEffect>=timeSeries[i]){
                poisonEffect = timeSeries[i] + duration - 1;
            }
            i++;
        }
        System.out.println(poisonEffect);
    }
}
