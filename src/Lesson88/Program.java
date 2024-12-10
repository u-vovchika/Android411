package Lesson88;

public class Program {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.dispayInfo();
////        p1.name = "Ирина";
////        p1.age = 28;
////        System.out.println(p1.name);
//        Person p2 = new Person("Валентин");
//        p2.dispayInfo();

        Person p3 = new Person("Марина", 225);
       // p3.setName("Валерий");
       // p3.age = 20;
//        System.out.println(p3.getName());
//        p3.setAge(28);
//        p3.setAge(258);
        p3.dispayInfo();
    }
}

class Person {
    private String name;  // свойства
    private int age;


    {
        name = "Неизвестно";
        age = 18;
    }

    public Person() {
     //   this("Неизвестно", 18);
    }

    public Person(String n) {
   //     this(n, 18);
        this.name = n;
    }

    public Person(String name, int age) {

//        this.name = n;
//        this.age = a;
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0 && age < 110)
        this.age = age;
    }




    void dispayInfo() {
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }
}
