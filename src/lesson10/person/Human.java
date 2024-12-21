package lesson10.person;

public class Human {
    private String lastName;
    private String firstName;
    private int age;

//    public Human() {
//    }

    public Human(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        System.out.println("HumanConstructor\t"
                + Integer.toHexString(hashCode()));
        //шестнацеричное предствление хэш-кода объекта

    }

    public Human(Human other) {
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.age = other.age;
        System.out.println("HumanConstructor\t"
                + Integer.toHexString(hashCode()));
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
        // return super.toString();
    }
}
