package LeetCode;

import java.util.List;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Comparator;

public class RelatingRanking {
    static int listIndexOf(Integer[] numbers, int target) {
        List<Integer> list = Arrays.asList(numbers);
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        TreeMap<Integer, Integer> tmap = new TreeMap<>(Comparator.reverseOrder());
        String[] rank = {"Gold","Silver", "Bronze"};
        int count =0;
        for (int i=0; i<score.length; i++){
            tmap.put(score[i], i);
        }
        String[] str = new String[score.length];
        for (int i: tmap.keySet()){
            int index = tmap.get(i);
            if (count<3){
                str[index] = rank[count++];
            }
            else{
                count++;
                str[index] = Integer.toString(count) + "th";
            }
        }
        for(String s: str){
            System.out.println(s);
        }
        

        

    }
}
