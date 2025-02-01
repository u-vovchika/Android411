package lesson16.collection;

import java.util.TreeSet;

public class TreeSet11 {
    public static void main(String[] args) {
        TreeSet<Student2> treeSet = new TreeSet<>();
        Student2 st1 = new Student2("Виктор", 5);
        Student2 st2 = new Student2("Герман", 3);
        Student2 st3 = new Student2("Ольга", 1);
        Student2 st4 = new Student2("Ирина", 4);
        Student2 st5 = new Student2("Михаил", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);

    }
}

class Student2 implements Comparable<Student2>{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
    @Override
    public int compareTo(Student2 o){
        return  course - o.course;
    }

}
