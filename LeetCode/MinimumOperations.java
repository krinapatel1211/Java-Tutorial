import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MinimumOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,1,5,4,2));
        int k=2;
        
        HashSet<Integer> set = new HashSet<>();
        int i = list.size() - 1;
        
        for(; i > -1 && set.size() != k; i--) {
            if(list.get(i) <= k) set.add(list.get(i));
            System.out.println(set);
        }
        
        System.out.println(list.size() - i - 1);

        


    }
}
