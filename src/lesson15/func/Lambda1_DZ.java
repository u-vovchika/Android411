package lesson15.func;

import java.util.function.Predicate;

public class Lambda1_DZ {
    public static void main(String[] args) {
        Predicate<String> isEmpty = str -> str == null || str.isEmpty();  // isEmply = пустой

        String str1 = "";
        String str2 = "Строка содержит текст!";

        System.out.println("Строка 1: " + str1);
        System.out.println("Строка 1 пустая: " + isEmpty.test(str1));    // test = проверка
        System.out.println();
        System.out.println("Строка 2: " + str2);
        System.out.println("Строка 2 пустая: " + isEmpty.test(str2));
    }
}
