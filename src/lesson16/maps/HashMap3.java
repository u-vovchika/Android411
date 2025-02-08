package lesson16.maps;

import java.security.Key;
import java.util.HashMap;
import java.util.Objects;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put(new Key1("Виталий"), 20);
        map.put(new Key1("Александр"), 30);
        map.put(new Key1("Виталий"), 40);
        map.put(new Key1("Александра"), 25);

        System.out.println();
        System.out.println("Значение для Виталий: " + map.get(new Key1("Виталий")));
        System.out.println("Значение для Александр: " + map.get(new Key1("Александр")));
        System.out.println("Значение для Александра: " + map.get(new Key1("Александра")));
    }
}

class Key1{
    String key;

    public Key1(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        return key.equals(((Key1) o).key);
    }

    @Override
    public int hashCode() {
        int hash = key.charAt(0);
        System.out.println("hashCode для ключа: "+ key + " = " + hash);
        return hash;
    }
}