package Lesson11;

public class Sample {
    public static void main(String[] args) {
        //Animal an = new Animal("Том");
//        Cat cat = new Cat("Том");
//        cat.makeSound();
//        cat.sleep();
        Animal animals[] = new Animal[2];
        animals[0] = new Dog("Герда");
        animals[1] = new Cat("Том");

        for (Animal anim : animals) {
            anim.makeSound();
            anim.sleep();
        }

    }
}
// абстрактный класс
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " спит!");
    }

    public abstract void makeSound();  // Абстрактный метод
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает!");
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает!");
    }
}
