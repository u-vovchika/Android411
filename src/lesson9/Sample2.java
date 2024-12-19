package lesson9;

public class Sample2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шарик");
        d1.run();

        Dog d2 = new Dog("Найда");
        d2.run();


    }
}

class Dog{
    private String name;
    private Foot foot;

    public Dog(String name) {
        this.name = name;
        foot = new Foot();
    }

    void run(){
        foot.run();
    }

    class Foot{
        void run(){
            String name = "Foot";
            System.out.println("Собака " + Dog.this.name + " бежит...");
        }
    }
}
