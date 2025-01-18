package Lesson14.enams.excrption.exceptionDZ29;

import java.util.Scanner;

class VowelLettersException extends Exception {
    public VowelLettersException(String message) {
        super(message);
    }
}


public class ExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Исходная строка: ");
        String input = scanner.nextLine();
        try {
            checkVowel(input);
            System.out.println("Строка содержит гласные буквы.");
        } catch (VowelLettersException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void checkVowel(String str) throws VowelLettersException {
        boolean presentVowel = false;

        for (int i = 0; i < str.length(); i++) {
            char vl = str.charAt(i);

            if (vl == 'a' || vl == 'e' || vl == 'i' ||
                    vl == 'o' || vl == 'u' || vl == 'A' ||
                    vl == 'E' || vl == 'I' || vl == 'O' ||
                    vl == 'U' || vl == 'a' || vl == 'А' ||
                    vl == 'и' || vl == 'И' || vl == 'о' ||
                    vl == 'О' || vl == 'у' || vl == 'У' ||
                    vl == 'ы' || vl == 'Ы' || vl == 'э' ||
                    vl == 'Э' || vl == 'е' || vl == 'Е' ||
                    vl == 'ё' || vl == 'Ё' || vl == 'ю' ||
                    vl == 'Ю' || vl == 'я' || vl == 'Я') {
                presentVowel = true;
                break;
            }
        }
        if (presentVowel == false) {
            throw new VowelLettersException("Строка не содержит гласные буквы.");
        }
    }
}
