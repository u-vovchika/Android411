package lesson15.test;

interface HumanFactory<P extends Human>{
    P create(String firstName, String lastName);
}

public class Lesson7 {
    public static void main(String[] args) {
        HumanFactory<Human> humanHumanFactory = Human ::new;
        Human human = humanHumanFactory.create("Olga", "Pavlova");
        System.out.println(human);
    }
}

class Human{
    String firstName;
    String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
