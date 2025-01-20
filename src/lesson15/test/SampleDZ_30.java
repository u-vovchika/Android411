package lesson15.test;

interface Animals{
    String compareAnimals(String word_1, String word_2);
}

public class SampleDZ_30 {
    public static void main(String[] args) {
        // Лямбда выражение ////////////////////////////////////////
        Animals animals = (word_1, word_2) -> word_1.length() <= word_2.length() ? word_1 : word_2;
        // Анонимный класс  ////////////////////////////////////////
//        Animals animals = new Animals() {
//            @Override
//            public String compareAnimals(String word_1, String word_2) {
//                return word_1.length() <= word_2.length() ? word_1 : word_2;
//            }
//        };
        String wordD = "Собака";
        String wordC = "Кот";
        System.out.println("Первое слово: " + wordD);
        System.out.println("Второе слово: " + wordC);
        String showShortWord = animals.compareAnimals(wordD,wordC);
        System.out.println("Самое короткое слово: " + showShortWord );
    }
}
