package lesson16.collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_DZ {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Сщздайте программу, которая наполнит TreeSet 5-ю целыми числами с клавиатуры");
        System.out.println("и выведет наименьший (последний по величине) элемент: ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            int num = input.nextInt();
            treeSet.add(num);
        }
       // System.out.println(treeSet);
        Integer max = null;
        for (Integer item : treeSet) {
            if (max == null) {
                max = item;
            } else if (max < item) {
                max = item;
            }
        }
        System.out.println("Наименьший элемент в TreeSet: " + Collections.min(treeSet));
    }
}
