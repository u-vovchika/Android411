package lesson16.collection;

import java.util.PriorityQueue;

public class PriorityQueue13 {
    public static void main(String[] args) {
        PriorityQueue<Integer> task = new PriorityQueue<>();
        task.add(5);
        task.add(1);
        task.add(9);
        task.add(2);
        task.add(3);
        task.add(3);
        System.out.println(task);

//        while (!task.isEmpty()){
//            System.out.println(task.poll());  // remove() не выбрасывает в исключение
//        }
//        System.out.println(task);
//        System.out.println(task.poll());

        System.out.println(task.element());  // peek() не выбрасывает в исключение
        System.out.println(task);


    }
}
