package lesson16.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator2_DZ {
    public static void main(String[] args) {
        System.out.println();
        Raduga col1 = new Raduga(0, "Красный");
        Raduga col2 = new Raduga(1, "Оранжевый");
        Raduga col3 = new Raduga(2, "Желтый");
        Raduga col4 = new Raduga(3, "Зеленый");
        Raduga col5 = new Raduga(4, "Голубой");
        Raduga col6 = new Raduga(5, "Синий");
        Raduga col7 = new Raduga(6, "Фиолетовый");
        LinkedList<Raduga> colors = new LinkedList<>();
        colors.add(col1);
        colors.add(col2);
        colors.add(col3);
        colors.add(col4);
        colors.add(col5);
        colors.add(col6);
        colors.add(col7);
        System.out.println("Список: " + colors);
        System.out.println();

        ListIterator<Raduga> listIterator = colors.listIterator();
        System.out.println("Список итераторов в прямом направлении:");
        while (listIterator.hasNext()) {
            System.out.println("Индекс = " + listIterator.nextIndex() + ", Элемент = " + listIterator.next());
        }
        System.out.println();
        ListIterator<Raduga> listIterator2 = colors.listIterator(colors.size());
        System.out.println("Список итераторов в обратном направлении:");
        while (listIterator2.hasPrevious()) {
            System.out.println("Индекс = " + listIterator2.previousIndex() + ", Элемент = " + listIterator2.previous());
        }

    }
}

class Raduga {
    String color;
    int index;

    public Raduga(int index, String color) {
        this.index = index;
        this.color = color;
    }

    @Override
    public String toString() {
        return "" +
                "" + index +
                "" + color;
    }
}

