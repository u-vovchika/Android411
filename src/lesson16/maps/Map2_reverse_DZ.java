package lesson16.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2_reverse_DZ {
    public static void main(String[] args) {
        Map<String,Integer> origMap = new HashMap<>();
        origMap.put("X", 1);
        origMap.put("Y", 2);
        origMap.put("Z", 3);
        System.out.println("Исходный Map: "+origMap);

        Map<Integer, List<String>> inverMap = new HashMap<>();
        for (String key : origMap.keySet()){
            Integer val = origMap.get(key);
            inverMap.computeIfAbsent(val, k -> new ArrayList<>()).add(key);
        }
        System.out.println("Измененный Map: " + inverMap);
    }

}
