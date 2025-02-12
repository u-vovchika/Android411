package Lesson17.serializable_pakage;


import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
//            Person p = new Person("Александр", 37, 187,true);
//            oos.writeObject(p);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
//            Person p = (Person) ois.readObject();
//            System.out.println("Name: " + p.getName() + "\nAge: " + p.getAge());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        String fileName = "people.txt";
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Михаил", 30,175, false));
        people.add(new Person("Александр", 37, 187,true));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(people);
            System.out.println("Файл был записан");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ArrayList<Person> newPeople = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            newPeople = (ArrayList<Person>) ois.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (Person p : newPeople){
            System.out.println("Name: " + p.getName() + "\nAge: " + p.getAge());
        }


    }
}

class Person implements Serializable {
    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}