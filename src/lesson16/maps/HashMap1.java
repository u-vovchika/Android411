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
        map1.put(334455, "Ирина Мельник");
        map1.put(null, "Виктор Водник");
        map1.put(225544, null);
        System.out.println(map1);
    }
}


