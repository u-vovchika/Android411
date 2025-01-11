package Lesson14.enams;

enum Seasons {
    WINTER("Зима"),    // ЗИМА
    SUMMER("Лето"),    // ЛЕТО
    SPRING("Весна"),    // ВЕСНА
    AUTUMN("Осень");    // ОСЕНЬ

    private String title;
    Seasons(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '}' ;
    }
}



public class Main {
    public static void main(String[] args) {
//        System.out.println(Seasons.WINTER);
        for (Seasons s : Seasons.values()){
            System.out.println(s.name());
        }

        int ind = Seasons.SPRING.ordinal();
        System.out.println(ind);
        System.out.println(Seasons.values().length);


//        Seasons arg = Seasons.SPRING;
//        switch (arg) {
//            case WINTER:
//                System.out.println("Сейчвс зима");
//                break;
//            case SUMMER:
//                System.out.println("Сейчас лето");
//                break;
//            case SPRING:
//                System.out.println("Сейчас весна");
//                break;
//            case AUTUMN:
//                System.out.println("Сейчас осень");
//                break;
//        }
    }
}
