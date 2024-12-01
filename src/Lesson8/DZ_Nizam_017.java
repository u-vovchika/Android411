package Lesson8;

public class DZ_Nizam_017 {
    public static void main(String[] args) {
        String originalString = " Текст с повторяющимися символами ";
        String modifiedString = removeDuplicatesAndSpaces(originalString);
        System.out.println("Исходная строка - " + originalString.trim() + "");
        System.out.println("Измененная строка - " + modifiedString + "");
    }
    public static String removeDuplicatesAndSpaces(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Массив для отслеживания встреченных символов

        for (char c : input.toCharArray()) {
            if (c != ' ' && !seen[c]) { // Проверяем, не является ли символ пробелом и встречался ли он ранее
                seen[c] = true; // Отмечаем символ как встреченный
                result.append(c); // Добавляем символ в результат
            }
        }

        return result.toString(); // Возвращаем результат в виде строки
    }

}
