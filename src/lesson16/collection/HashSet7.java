package lesson16.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet7 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(43);
        num.add(31);
        num.add(24);
        num.add(54);
        num.add(21);
        System.out.println(num);

        Integer max = null;
        for (Integer item : num) {
            if (max == null) {
                max = item;  // 21
            } else if (max < item) { // 21 < 54
                max = item;
            }

        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + Collections.min(num));
        System.out.println("Максимальное значение: " + Collections.max(num));


    }
}
