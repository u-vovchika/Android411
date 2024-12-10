package Lesson88.personal_data;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(
                "Юля",
                "23.05.1986",
                "45-46-98",
                "Рассия",
                "Москва",
                "Чистопрудный бульвар, 14");
        h1.printInfo();
        h1.setName("Юлия");
        System.out.println(h1.getName());
    }
}
