package lesson16.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {
    public static void main(String[] args) {
        Student st1 = new Student("Victor", 2);
        Student st2 = new Student("Anna", 3);
        Student st3 = new Student("Irina", 1);
        Student st4 = new Student("Igor", 3);
        Student st5 = new Student("Roman", 2);
        LinkedList<Student> stLL = new LinkedList<>();
        stLL.add(st1);
        stLL.add(st2);
        stLL.add(st3);
        stLL.add(st4);
        stLL.add(st5);
        System.out.println("LinkedList = " + stLL);
        System.out.println(stLL.get(2));
        Student st6 = new Student("Maria", 2);
        Student st7 = new Student("Sergey", 1);
        stLL.add(st6);
        stLL.add(1, st7);
        System.out.println("LinkedList = " + stLL);
        Student st8 = new Student("Vlad", 3);
        stLL.set(1, st8);
        System.out.println("LinkedList = " + stLL);
        stLL.remove(3);
        stLL.removeFirst();
        stLL.removeLast();
        System.out.println("LinkedList = " + stLL);

        for (Student element : stLL) {
            System.out.println(element);
        }

        for (int i = 0; i < stLL.size(); i++) {
            System.out.println("Элемент по индексу " + i + ": " + stLL.get(i));
        }

//        Iterator p = stLL.listIterator(2);
//        while (p.hasNext()){
//            System.out.println(p.next());
//        }

        Iterator it = stLL.descendingIterator(); // развернуть элементы в другую сторону
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Первый элемент: " + stLL.getFirst());
        System.out.println("Последний элемент: " + stLL.getLast());
        stLL.clear();
        System.out.println("LinkedList = " + stLL);
        System.out.println("Пустой список? " + stLL.isEmpty());

        ListIterator<Student> listIterator = stLL.listIterator();

        System.out.println("Итерация в прямом направлении");
        while (listIterator.hasNext()) {
            System.out.println("Index = " + listIterator.nextIndex() + ", Element = " + listIterator.next());
        }

        System.out.println("Итерация в обратном направлении");
        while (listIterator.hasPrevious()) {
            System.out.println("Index = " + listIterator.previousIndex() + ", Element = " + listIterator.next());
        }

    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
