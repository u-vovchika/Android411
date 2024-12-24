package lesson10.animals;

public class Cat extends Animal {

   // @Override
    public void voice(String name) {
        System.out.println(name + "Мяу!");
    }

    @Override
    public void voice() {
        super.voice();
    }
}
