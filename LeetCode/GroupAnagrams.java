package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        // String[] strs = {"act","pots","tops","cat","stop","hat"};
        String[] strs = {"", ""};
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
           char[] ch = s.toCharArray();
           Arrays.sort(ch);
           String key = String.valueOf(ch);
           if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
           }
           map.get(key).add(s);
        }
        System.out.println(map.values());
        // System.out.println(new ArrayList<>(map.values());
      
    }

}
