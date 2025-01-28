package lesson16.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Валерий");
        arrayList.add("Ирина");
        arrayList.add("Игорь");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>(20);
        arrayList2.add("Валерий");
        arrayList2.add("Ирина");
        System.out.println(arrayList2.size());
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>(20);
        arrayList3.add("Валерий");
        arrayList3.add("Ирина");
        System.out.println(arrayList3);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList);
        System.out.println(arrayList4);
        arrayList4.add("Владимир");
        System.out.println(arrayList4);
        System.out.println(arrayList);

        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("Валерий");
        arrayList5.add(7);
        arrayList5.add(true);
        System.out.println(arrayList5);

        System.out.println(arrayList5.get(2));
        arrayList5.set(1,false);
        System.out.println(arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");
        arrayList6.addAll(1, arrayList);
        System.out.println(arrayList6);
//        arrayList6.removeAll(arrayList);  // удаляем
//        System.out.println(arrayList6);
//        arrayList6.retainAll(arrayList);
//        System.out.println(arrayList6);
        List<String> myList = arrayList6.subList(0,3);
        System.out.println(myList);
        myList.add("Борис");
        System.out.println(myList);
        System.out.println(arrayList6);

        String[] array = arrayList6.toArray(new String[6]);
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println("\n" + array.length);

        Collections.sort(arrayList6);
        System.out.println(arrayList6);

//        Collections.shuffle(arrayList6);
//        System.out.println(arrayList6);


//        Collections.reverse(arrayList6);
//        System.out.println(arrayList6);

        Collections.swap(arrayList6, 0,2);
        System.out.println(arrayList6);

        // Итератор - переборщик
        Iterator<String> iterator = arrayList6.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            iterator.next();
            iterator.remove();

        }
        System.out.println(arrayList6);




    }
}
