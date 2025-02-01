package lesson16.collection;

import java.util.Vector;

public class Vector4 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Сергей");
        vector.add("Михаил");
        vector.add("Николай");
        vector.add("Виктор");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
    }
}
