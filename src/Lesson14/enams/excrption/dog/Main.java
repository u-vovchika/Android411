package Lesson14.enams.excrption.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лекцус");
       // dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyException e){
            System.out.println(e.getMessage());
            System.out.println("\nПрверяем снаряжение!" +
                    "\nОшейник надет: " + dog.isCollarPutOn +
                    "\nПоводок надет: " + dog.isLeashPutOn +
                    "\nНамордник надет: " + dog.isMuzzlePutOn);
        }

    }
}
