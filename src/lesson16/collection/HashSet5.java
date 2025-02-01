package lesson16.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Валентин");
        set.add("Николай");
        set.add("Григорий");
        set.add("Александр");
        set.add("Александр");

        System.out.println(set);
        //System.out.println(set.get(2));
        set.add("Марк");
        System.out.println(set);

       // set.remove("Александр");
        System.out.println(set.size());
        System.out.println(set.contains("Александр"));
        set.add(null);

        for (String s : set){
            System.out.println(s);
        }

        System.out.println(set);
    }
}
