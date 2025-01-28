package lesson16.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        University un1 = new University("Университет", 300);
        University un2 = new University("Начальная школа", 150);
        University un3 = new University("Средня школа", 357);
        University un4 = new University("Высшая школа", 246);
        University un5 = new University("Музыкальная школа", 789);
        SortUniversity sortUniv = new SortUniversity();
        int res = sortUniv.compare(un1, un2);
        switch (res) {
            case -1:
                System.out.println(un2.getName() + " больше!");
                break;
            case 1:
                System.out.println(un1.getName() + " больше!");
                break;
            default:
                System.out.println("Два учебных заведения одинаковые по численности");
        }

        ArrayList<University> list = new ArrayList<>();
        list.add(un1);
        list.add(un2);
        list.add(un3);
        list.add(un4);
        list.add(un5);
        System.out.println("\nСортировка по имени: ");
        SortNameUniversity nameCompare = new SortNameUniversity();
        Collections.sort(list, nameCompare);
        for (University name : list) {
            System.out.println(name.getName() + " " + name.getNum_of_students());
        }

        System.out.println("\nСортировка по количеству учеников: ");
        Collections.sort(list, sortUniv);
        for (University count : list) {
            System.out.println(count.getName() + " " + count.getNum_of_students());
        }

    }
}

class University {
    private String name;
    private int num_of_students;

    public University(String name, int num_of_students) {
        this.name = name;
        this.num_of_students = num_of_students;
    }

    public String getName() {
        return name;
    }

    public int getNum_of_students() {
        return num_of_students;
    }
}

// вспомогательный класс Comparator
class SortUniversity implements Comparator<University> {
    @Override
    public int compare(University o1, University o2) {
        if (o1.getNum_of_students() == o2.getNum_of_students())
            return 0;
        else
            return o1.getNum_of_students() > o2.getNum_of_students() ? 1 : -1;

    }
}

class SortNameUniversity implements Comparator<University> {
    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
















