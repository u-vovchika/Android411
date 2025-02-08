package lesson16.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(334455, "Михаил Борисов");
        map1.put(778899, "Ринат Зуев");
        map1.put(443366, "Роман Свиридов");
        map1.put(225577, "Анна Полякова");
        map1.put(884466, "Анна Полякова");
        map1.putIfAbsent(334455, "Ирина Мельник");
        map1.put(null, "Виктор Водник");
        map1.put(225544, null);
        System.out.println(map1);
        System.out.println(map1.get(778899));
        System.out.println(map1.get(448899));
        map1.remove(778899);
        System.out.println(map1);
        System.out.println(map1.containsValue("Роман Свиридов"));
        System.out.println(map1.containsValue("Ринат Зуев"));
        System.out.println(map1.containsKey(443366));
        System.out.println(map1.containsKey(448899));
        System.out.println(map1.keySet());  // проверить массив ключейц
        System.out.println(map1.values());  //  проверить массив значений

    }
}


