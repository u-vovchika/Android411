package Lesson14.enams.excrption.dog;

public class Dog {
    String name;
    boolean isCollarPutOn;  //надет ли ошейник
    boolean isLeashPutOn;  //надет ли поводок
    boolean isMuzzlePutOn;  //надет ли намордник

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет!");
        isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        System.out.println("Собираемся на прогулку");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура!!! Идем гулять! " + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("Собака "
                    + name + "не готова к прогулке! Проверьте экипировку!");
        }
    }
}
