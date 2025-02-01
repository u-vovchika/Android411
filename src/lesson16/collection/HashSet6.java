package lesson16.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet6 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.addAll(Arrays.asList(1,2,3,4,5,6,7));
        b.addAll(Arrays.asList(5,6,7,8,9));

        System.out.println(a);
        System.out.println(b);

        HashSet<Integer> union = new HashSet<>(a);
        System.out.println("union start:  " + union);
        union.addAll(b); // объединение двух Set-ов
        System.out.println("union finish: " + union);

        HashSet<Integer> intersect = new HashSet<>(a);
        intersect.retainAll(b);  // пересечение (общие элементы из двух сетов)
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(a);
        subtract.removeAll(b);   //  разность ( из первого сета вычитается второй, т.е. те которые есть в первом, но нет во втором)
        System.out.println(subtract);

    }
}
