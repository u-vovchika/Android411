package Lesson_main;

import java.util.Scanner;

public class Renault_Calc {
    public static void main(String[] args) {

        System.out.println("Renault Radio Calc");
        System.out.println("------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву: ");
        String vv0 = scanner.nextLine();

        char letter = 0;
        // Проверяем, что введена ровно одна буква
        if (vv0.length() == 1 && Character.isLetter(vv0.charAt(0))) {
            letter = vv0.charAt(0); // Получаем первую букву
            // Проверяем, является ли буква заглавной
            if (Character.isUpperCase(letter)) {
                //System.out.println("Вы ввели заглавную букву: " + letter);
            } else {
                System.out.println("Ошибка: введите заглавную букву: " + letter);
                return;
            }
            //System.out.println("Вы ввели букву: " + letter);
        } else {
            System.out.println("Ошибка: введите только одну букву.");
            return;
        }




        int v0 = 0;
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Пример строки букв

        for (char letterR : letters.toCharArray()) {
            v0 = -1; // Инициализация переменной v0
            // Проверка, находится ли буква в диапазоне от 'A' до 'Z'
            if (letterR >= 'A' && letterR <= 'Z') {
                C = letterR - 'A'; // Вычисляем значение v0
            }
            //System.out.println("Значение v0 для буквы " + letterR + ": " + v0);
        }


//        if (letter == 'A') v0 = 0;
//        if (letter == 'B') v0 = 1;
//        if (letter == 'C') v0 = 2;
//        if (letter == 'D') v0 = 3;
//        if (letter == 'E') v0 = 4;
//        if (letter == 'F') v0 = 5;
//        if (letter == 'G') v0 = 6;
//        if (letter == 'H') v0 = 7;
//        if (letter == 'I') v0 = 8;
//        if (letter == 'J') v0 = 9;
//        if (letter == 'K') v0 = 10;
//        if (letter == 'L') v0 = 11;
//        if (letter == 'M') v0 = 12;
//        if (letter == 'N') v0 = 13;
//        if (letter == 'O') v0 = 14;
//        if (letter == 'P') v0 = 15;
//        if (letter == 'Q') v0 = 16;
//        if (letter == 'R') v0 = 17;
//        if (letter == 'S') v0 = 18;
//        if (letter == 'T') v0 = 19;
//        if (letter == 'U') v0 = 20;
//        if (letter == 'V') v0 = 21;
//        if (letter == 'W') v0 = 22;
//        if (letter == 'X') v0 = 23;
//        if (letter == 'Y') v0 = 24;
//        if (letter == 'Z') v0 = 25;



        v0 = v0 + 65;
        //System.out.println(v0);

        System.out.print("Введите три цифры: ");
        Integer v10 = scanner.nextInt();

        System.out.println("Security CODE: " + vv0 + "" + v10);
        // выделяем отдельные цифры серийника, если sn = 0X506;
        int var3 = (v10 % 10);
        v10 = v10 / 10;   // 3 цифра - var3=6
        int var2 = (v10 % 10);
        v10 = v10 / 10;   // 2 цифра - var2=0
        int var1 = (v10 % 10);                     // 1 цифра - var1=5
        var3 = var3 + 48;
        var2 = var2 + 48;
        var1 = var1 + 48;


        // расчет кода
        int var5 = var1 + (10 * v0) - 698;
        if (var5 <= 0) {
            var5 = 1;
        }

        int var14 = (7 * (var5 + (10 * var2) + var3 - 528)) % 100;
        int var16 = var14 / 10;
        int var11 = var14 % 10;
        var11 = var11 * 10;
        var16 = var16 + var11;
        int var4 = 259 % var5;
        var4 = var4 % 100;
        var4 = var4 * 0x64;
        var4 = var4 + var16;

        int w4 = (var4 % 10);
        var4 = var4 / 10;
        int w3 = (var4 % 10);
        var4 = var4 / 10;
        int w2 = (var4 % 10);
        var4 = var4 / 10;
        int w1 = (var4 % 10);
        System.out.println("CODE: " + w1 + "" + w2 + "" + w3 + "" + w4);
        System.out.println("------------------");
        System.out.println("u-vovchika");

    }
}


