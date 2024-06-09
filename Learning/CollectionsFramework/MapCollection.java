package CollectionsFramework;

import java.util.HashMap;
import java.util.TreeMap;

public class MapCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Krina", 1);
        map.put("Deep", 2);
        System.out.println(map.putIfAbsent("Krina", 3));
        map.put("Neel", 3);
        System.out.println(map);

        //TreeMap 
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Krina", 1);
        tmap.put("Deep", 2);
        System.out.println(tmap.putIfAbsent("Krina", 3));
        tmap.put("Neel", 3);
        System.out.println(tmap);
        System.out.println(tmap.get("Krina"));
        System.out.println(tmap.keySet());

        
    }
}
