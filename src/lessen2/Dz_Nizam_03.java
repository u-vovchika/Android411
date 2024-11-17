package lessen2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dz_Nizam_03 {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

//        System.out.println("Введите четыре числа:");
//        System.out.print("1: ");
//        int num1 = input.nextInt();
//        System.out.print("2: ");
//        int num2 = input.nextInt();
//        System.out.print("3: ");
//        int num3 = input.nextInt();
//        System.out.print("4: ");
//        int num4 = input.nextInt();
//        System.out.printf("Результат: %.2f %n", (float)(num1 + num2) / (num3 + num4));

//        System.out.print("Введите пятизначное число: ");
//        int num = input.nextInt();
//        int num1 = num / 10000;
//        int num2 = num / 1000 % 10;
//        int num3 = num / 100 % 10;
//        int num4 = num / 10 % 10;
//        int num5 = num  % 10;
//        int comp = num1 * num2 * num3 * num4 * num5;
//        System.out.println("Произведение цифр числа " + num + ": " + comp);
//        double arif = (double)(num1 + num2 + num3 + num4 + num5) / 5;
//        System.out.println("Среднее арифметическое числа " + num + ": "+ arif);
//
//        input.close();
//

//        int a = 5;
//        a += 10;  // a = a = 10
//        a -= 2;   // a = a - 2
//        System.out.println(a);

        //       int a, b, c, sum;
//        Scanner input = new Scanner(System.in);
        //      System.out.print("Введите 1 число: ");
//        a = input.nextInt();
//        System.out.print("Введите 1 число: ");
//        b = input.nextInt();
//        System.out.print("Введите 1 число: ");
//        c = input.nextInt();
//        sum = a + b + c;
//        System.out.print("Введите 1 число: ");
//        sum = input.nextInt();
//        System.out.print("Введите 2 число: ");
//        sum += input.nextInt();
//        System.out.print("Введите 3 число: ");
//        sum += input.nextInt();
//        System.out.println(sum);
//

//        int a = 8;
//        int b = 3;
//        System.out.println(a == b);  // false
//        System.out.println(a != b);  // true
//        System.out.println(a > b);   // true
//        System.out.println(a >= b);  // true
//        System.out.println(a < b);   // false
//        System.out.println(a <= b);  // false


//        boolean a1 = 5 > 6 || 4 < 6;  // false || true
//        System.out.println(a1);
//        boolean a2 = 5 > 6 && 4 < 6;  // false || true
//        System.out.println(a2);
//
//        boolean a2 = 5 > 6 && 4 < 6;  // false || true
//        System.out.println(a2);


    /*
      if( условие ){
          команда 1
      }удыу{
          команда 2
      }
     */

//        Scanner input = new Scanner(System.in);
//        int age;
//        System.out.print("Введите Возраст: ");
//        age = input.nextInt();
//        if (age >= 19) {
//            System.out.print("Доступ разрешен ");
//        } else {
//            System.out.print("Доступ запрещен: ");
//        }


//        int num1 = 17;
//        int num2 = 7;
//        if(num1 > num2) {
//            System.out.println("Первое число больше второго");
//        }
//        else if(num1 < num2){
//            System.out.println("Первое число меньше второго");
//        }else{
//            System.out.println("Первое число меньше второго");
//        }


//        int age = 25;
//        boolean isYoung = age >= 18;  // true
//        boolean isOld = age > 65;     // false
//        if(isYoung && !isOld){        // true && !false
//            System.out.println("Вы можете работать");
//        }else{
//            System.out.println("Работать не обязательно");
//        }


//        int age = 25;
//        if(!((age < 18) || (age > 65))){
//            System.out.println("Вы можете работать");
//        }else{
//            System.out.println("Работать не обязательно");
//        }

        //       Scanner input = new Scanner(System.in);
//        int a1, a2, a3, Var1;
//        System.out.print("Введите первую сторону: ");
//        a1 = input.nextInt();
//        System.out.print("Введите вторую сторону: ");
//        a2 = input.nextInt();
//        System.out.print("Введите третью сторону: ");
//        a3 = input.nextInt();
//        if(a1 == a2 && a1 == a3  && a2 == a3  ){
//            System.out.print("Равностороний: ");
//        }else if(a1 == a2 || a1 == a3  || a2 == a3){
//            System.out.print("Равнобедреный: ");
//        }else{
//            System.out.print("Разностороний: ");
//        }

//        int day, time;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if(day >= 1 && day <= 5){
//            System.out.print("Рабочий день\nВведите время: ");
//            time = input.nextInt();
//            if(time >=9 && time <=18){
//                System.out.println("Открыто: ");
//            }else{
//                System.out.println("Закрыто. Щткроется в 9-00");
//            }
//        }else if(day == 6 || day == 7){
//            System.out.println("Выходной день");
//        }else{
//            System.out.println("Такого дня недели не существует");
//        }

//        int n;
//        System.out.print("Введите кол-во ворон: ");
//        n = input.nextInt();
//        if (n >= 0 && n <= 9) {
//            System.out.print("На ветке ");
//            if (n == 1) {
//                System.out.println(n + " Ворона");
//            } else if (n >= 2 && n <= 4) {
//                System.out.println(n + " Вороны");
//            } else if (n >= 5 && n <= 9 || n == 0) {
//                System.out.println(n + " Ворон");
//            }
//        } else {
//            System.out.println("Ошибка ввода данных: ");
//        }

//       int n;
//       n = input.nextInt();
//        System.out.println(n % 10);

//        int day;
//        System.out.print("Введите день недели (цифрами): ");
//        day = input.nextInt();
//        if(day >= 1 && day <= 5){
//            System.out.print("Рабочий день ");
//            if(day == 1)System.out.print("Понедельник");
//            if(day == 2)System.out.print("Вторник");
//            if(day == 3)System.out.print("Среда");
//            if(day == 4)System.out.print("Четверг");
//            if(day == 5)System.out.print("Пятница");
//        }else if(day == 6 || day == 7){
//            System.out.print("Выходной день");
//            if(day == 6)System.out.print("Суббота");
//            if(day == 7)System.out.print("Воскресение");
//        }else{
//            System.out.println("Такого дня недели не существует");
//        }


//        int number, res;
//        number = 5;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);


//        Scanner input = new Scanner(System.in);
//        int age;
//        System.out.print("Введите возрасте: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 ? "Приятного просмотра" : "Вам еще рано смотреть этот фильм");


//        Scanner input = new Scanner(System.in);
//        int penny;
//        System.out.print("Введите число от 1 до 99: ");
//        penny = input.nextInt();
//        if (penny >= 1 && penny <= 99) {
//            System.out.print(penny);
//            if((penny % 10) == 1 && (penny) != 11 )  System.out.print(" Копейка");
//            else if(penny >= 5 && penny  <= 20)  System.out.print(" Копеек");
//            else if((penny % 10) >= 2 && (penny % 10) <= 4 )  System.out.print(" Копейки");
//            else if((penny % 10) >= 5 && (penny % 10) <= 9  || (penny % 10) == 0)  System.out.print(" Копеек");
//        } else {
//            if (penny < 1)
//                System.out.print("Число не может быть меньше 1 ");
//            if (penny > 99)
//                System.out.print("Число не может быть больше 99 ");
//            System.out.print("по заданию.");
//        }

//        int a = 20, b = 30;
//        System.out.println(a == b ? "a == b" : (a > b ? "a > b":"b > a"));
//
//
//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n); // 20

//        int a = 20, b = 7, c;
//        System.out.println(b == 0 ? "На ноль делить нельзя" : (float) a / b);

//        Scanner input = new Scanner(System.in);
//        int n;
//        System.out.print("\tВыбор цвета светофора\n1 - красный, 2 - желтый, 3 - зеленый ");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета светофора нет");
//        }

//        Scanner input = new Scanner(System.in);
//        int monch;
//        int numDey = 0;
//        int year;
//        System.out.print("\tВведите номер месяца\n1 - январь, 2 - февраль, 3 - март, 4 - апрель, 5 - май, 6 - июнь, 7 - июль, 8 - август, 9 - сентябрь, 10 - октябрь, 11 - ноябрь, 12 - декабрь ");
//        monch = input.nextInt();
//        switch (monch) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                numDey = 31;
//                break;
//
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDey = 30;
//                break;
//
//            case 2:
//                System.out.println("Введите год: ");
//                year = input.nextInt();
//                if(year % 4 == 0){
//                    numDey = 29;
//                }else {
//                    numDey = 28;
//                }
//                break;
//
//
//
//            default:
//                System.out.println("Такого месяца не существует");
//        }
//        if (monch >= 1 && monch <= 12)
//            System.out.println("Количество дней " + numDey);


//        Scanner input = new Scanner(System.in);
//        int monch;
//        System.out.print("Введите номер месяца: ");
//        monch = input.nextInt();
//        switch (monch) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Зима");
//                break;
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна");
//                break;
//
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето");
//                break;
//
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень");
//                break;
//
//            default:
//                System.out.println("Такого месяца не существует");
//        }


//        Scanner input = new Scanner(System.in);
//        int monch;
//
//        System.out.print("Введите номер месяца: ");
//        monch = input.nextInt();
//        String s = switch (monch) {
//            case 1, 2, 12 -> s = "Зима...";
//            case 3, 4, 5 -> s ="Весна...";
//            case 6, 7, 8 -> s = "Лето...";
//            case 9, 10, 11 -> s = "Осень...";
//            default -> s = "Такого месяца не существует.";
//        };
//        System.out.println(s);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите бал по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0) {
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет");
//        }

//
//        int i = 0;   // переменная счетчик
//        while (i < 5) {  // условие
//            System.out.println(i);
//            i++;  // шаг цикла
//        }
//


//        int i = 20;
//        while (i > 0) {
//            System.out.println(i);
//            i = i - 2;
//        }


//        Scanner input = new Scanner(System.in);
//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//
//        Scanner input = new Scanner(System.in);
//        int start, finish, sum = 0;
//        System.out.print("Введите начало диапозона: ");
//        start = input.nextInt();
//        System.out.print("Введите конец диапозона: ");
//        finish = input.nextInt();
//        while (start <= finish) {
//            if (start % 2 != 0)     // или start % 2 == 1
//                sum += start;
//            start++;
//
//        }
//        System.out.println("Сумма нечетных чисел: "+ sum);

//        Scanner input = new Scanner(System.in);
//        int i = 0;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i > 5);


//        Scanner input = new Scanner(System.in);
//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num < 0) {
//                sum += num;
//                count++;
//            }
//        } while (num != 0);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f", average);


//        Scanner input = new Scanner(System.in);
//        int number, copy, reverse_number = 0;
//        System.out.print("Введите число: ");
//        number = input.nextInt();  //321
//        copy = number;
//        do {
//            reverse_number *=10;
//            reverse_number += copy % 10;
//            copy /= 10;
//        } while (copy > 0);
//        System.out.println("Число " + number + (number == reverse_number ? " ":" не ") + "полиндром");


//        Scanner input = new Scanner(System.in);
//        int i = 0;
//        while (i < 10){
//            if(i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if(i == 5) break;
//            i++;
//        }
//        System.out.println("Цикл завершен");

//        Scanner input = new Scanner(System.in);
//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i == 5) break;
//            i++;
//        }

        //       Scanner input = new Scanner(System.in);
//        int n;
//        while (true) {
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0) break;
//
//        }

//        int n;
//        int proizv = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            if (n == 0) break;
//            if (proizv == 0) proizv++;
//
//            proizv *= n;
//        }
//        System.out.println("Проиведение чисел: " + proizv);


        //       Scanner input = new Scanner(System.in);
//        int i = 1;
//        while (i < 5) {
//            System.out.println("Внешний цикл: i = " + i);
//            int j = 1;
//            while (j < 4) {
//                System.out.println("\tВнутренний цикл: j = " + j);
//                j++;
//            }
//            i++;
//        }

//        Scanner input = new Scanner(System.in);
//        int i = 1;
//        while (i < 10) {
//            int j = 1;
//            while (j < 10) {
//                System.out.print(i + " * " + j + " = " + i * j + " \t\t");
//                j++;
//            }
//            System.out.println("\n");
//            i++;
//        }


//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                } else{
//                    System.out.print("-");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        //       Scanner input = new Scanner(System.in);
//        int count = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("-> ");
//            if (input.hasNextInt()) {
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Вы ввели чисел: " + count);


//        Scanner input = new Scanner(System.in);
//        int n;
//        System.out.print("Количество символов: ");
//        n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print("*");
//        }

        //// домашнее задание ////////////////////////////////////////////
//        Scanner input = new Scanner(System.in);
//        int n;
//        System.out.print("Количество символов: ");
//        n = input.nextInt();
//        String s;
//        System.out.print("Тип символа: ");
//        s = input.next();
//        int orient;
//        orient = input.nextInt();
//        if (orient == 0) {
//            System.out.print("Ориентация линии " + orient + " - горизонтальная");
//        } else if (orient == 1) {
//            System.out.print("Ориентация линии " + orient + " - вертикальная");
//        } else {
//            System.out.print("Нажмите 0 или 1");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            if (orient == 0) {
//                System.out.print(s + " ");
//            }
//            if (orient == 1) {
//                System.out.println(s);
//            }
//        }


//        Scanner input = new Scanner(System.in);
//        int n;
//        System.out.print("Введите целое число: ");
//        n = input.nextInt();
//        for (int i = 1; i <= n; i++){
//            if(n % i == 0)
//            System.out.print(i + " ");
//        }

//        Scanner input = new Scanner(System.in);

//        for (int i = 10; i < 100; i++) {
//            if (i / 10 == i % 10)  // 10    1 ==  0 -> не выводим число   // 11  1 == 1 -> выводим число
//                System.out.print(i + " ");
//        }
//

//        for (int i = 10; i < 100; i += 10) {
//
//                System.out.print(i + " ");
//        }

//        int a = 0;
//        for (int i = 5; i > 0; i--,a ++){
//            System.out.print("Шаг: " + a + " Значение: ");
//            System.out.println(i);
//        }

//        Scanner input = new Scanner(System.in);
//        int w, h;
//        System.out.print("Вывести Convert to Basic Latin: ");
//        w = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();

//        for (int i = 0; i <= 8; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 8; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int p = 1;
//        int sdvig = 12;
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < sdvig; j++) {
//                System.out.print(" ");
//            }
//            sdvig -= 2;
//            for (int j = 0; j < (p); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            p += 2;
//
//        }


        Scanner input = new Scanner(System.in);
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] +" ");
//        }
//        for (int i = array.length - 1; i >=0 ; i--) {
//            System.out.print(array[i] +" ");
//        }


//        int n , sum = 0;
//        System.out.print("n = ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] < 0){
//                sum = sum + array[i];
//            }
//        }
//        System.out.println("Сумма отриц элементов массива: " + sum);

//        int min;
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];  // min = 9
//        // [9, 5, 4, 6, 3]
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Мин значение: " + min);

//        // Дан массив чисел. Введите все элементы массива, которые больше предыдущего элемента
//        int count,n;
//        System.out.print("Введите элементы массива: ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] > (array[i - 1])){
//                count = array[i];
//                System.out.print(count + " ");
//            }
//        }

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//        for (int i = 0; i < a2.length; i++) {
//            System.out.print(a2[i] + " ");
//
//        }

//        double a = Math.random(); // [0;1)
//        System.out.println(a);
//
//        // (Mach.ranom() * ( max - min ) + min =>  (Mach.ranom() * ( 3 - 0 ) + 0 => Mach.ranom() * 3
//        double a = Math.random() * 3; // [0;3)
//        System.out.println(a);
//
//        // (Mach.ranom() * ( max - min ) + min =>  (Mach.ranom() * ( 7 - 2 ) + 2 => Mach.ranom() * 5 + 2
//        double b = Math.random() * 5 + 2; // [2;7)
//        System.out.println(b);

//        // (Mach.ranom() * ( max - min ) + min =>  (Mach.ranom() * ( 5 - (-5) ) + (-5) => Mach.ranom() * 10 + 5
//        double b = Math.random() * 10 - 5; // [-5;5)
//        System.out.println(b);

//        int a = (int) (Math.random() * 3);  // [0;3)
//        System.out.println(a);

//        int a = 3 + (int) (Math.random() * 2);  // [3;5)
//        System.out.println(a);

//        int a = (int) (Math.random() * (10 + 1)) - 5;  // [-5;5)
//        System.out.println(a);

        // [-2;5)
        // (Mach.ranom() * ( max - min ) + min => (Mach.ranom() * 7 - 2
//        int b = (int) (Math.random() * 7) - 2;
//        System.out.println(b);

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10);
//
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 12 + 2); // [2;14)
//        }
//        System.out.println(Arrays.toString(array));

//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 31 - 15); // [-15;16)
//        }
//        System.out.println(Arrays.toString(array));

//        int count = 0;
//        int sum = 0;
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);  // [10;50)
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] % 2 == 0) count ++;
//            if(array[i] % 2 != 0) sum += array[i];
//        }
//        System.out.println("Количество четных элементов: "+count);
//        System.out.println("Сумма нечетных элементов: "+sum);

//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        for (int x: numbers){  // int x = 10
//            System.out.print(x + " ");
//        }


//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String name: names) {
//            System.out.print(name + "\t");
//        }


//        int h = 7;
//        int w = h * 2 - 1;  // 13
//        int m = w / 2; // 6
//        for (int i = 0, l = m, r = m; i < h; i++, l--, r++) {
//            for (int j = 0; j < w; j++) {
//                if (j >= l && j <= r)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//
//        }


//        //// домашнее задание 08
//        // Предложите пользователю ввести начало и конец диапозона.
//        // Сохраните значения входящие в заданный диапозон в массив
//        int star,end;
//        System.out.print("Введите начало диапозона: ");
//        star = input.nextInt();
//        System.out.print("Введите конец диапозона: ");
//        end = input.nextInt();
//        int[] array = new int[end];
//        for (int i = star; i <= array.length; i++) {
//            System.out.print(i + " ");
//        }


//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        String[] cities2 = new String[cities.length +1];
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//
//
//
//
//
//
//        System.out.println(Arrays.toString(cities));


        //ArrayList
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1,"Красноярск");
//        System.out.println(cities);
//        System.out.println(cities.get(2));  //  аналог такого массива cities[2]
//        cities.set(2,"Курск");              // cities[2] = "Курск"
//        System.out.println(cities.size());
//
//
//        cities.remove(1);
//        cities.remove("Владивосток");

//        for (String city : cities) {
//            System.out.print(city + "\t");
//        }

//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i) + "\t");
//
//        }


//        System.out.println("\n"+cities.indexOf("Владивосток"));
//
//        if (cities.contains("Курск")) {
//            System.out.println("ArrayList содержит Курск");
//        }


//        int n,k;
//        //ArrayList<int> mas = new ArrayList<int>();
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//        System.out.println(mas);
//        System.out.print("Введите индекс: ");
//        k= input.nextInt();
//        mas.remove(k);
//        System.out.println(mas);


//        // Заполнить массив из 10 элементов случайными числами.
//        // Найти максимальный элемент массива и переместить в начало массива
//        int max,ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for (int m : mas){
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//            if(mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
////        ind = mas.indexOf(max);
////        mas.remove(ind);
//        mas.remove(mas.indexOf(max));
//        System.out.println(mas);
//        mas.add(0,max);
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }


//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33,44,55));
//        ArrayList<Integer> c = new ArrayList<>();
//
////        for (int i = 0; i < a.size(); i++) {
////            c.add(a.get(i));
////            c.add(b.get(i));
////        }
////        for (int i = a.size(); i < b.size(); i++) {
////            c.add(b.get(i));
////        }
//
//
//        for (int i = 0; i < b.size(); i++) {
//            if (i < a.size()){
//                c.add(a.get(i));
//            }
//            if (i < b.size()){
//                c.add(b.get(i));
//            }
//        }
//        System.out.println(c);


//        int[][] num = {
//                {0, 1, 2, 3},
//                {4, 5, 6, 7},
//                {8, 9, 10, 11}
//        };
////        System.out.println(num[1][3]);
////        for (int i = 0; i < num.length; i++) {
////            System.out.println(Arrays.toString(num[i]));
////        }
//
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(num[i][j]+"\t");
//            }
//            System.out.println();
//        }


//        int n = 5;
//        char[][] graph = new char[n][n];
////        for (int i = 0; i < graph.length; i++) {
////            System.out.println(Arrays.toString(graph[i]));
////        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                graph[i][j] = '*';
//                System.out.print(graph[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].length; j++) {
//                System.out.print(graph[i][j]+"\t");
//            }
//            System.out.println();
//        }


//        //////////////////////////////////////////////////////////////////////////////
//        // напишите программу, которая случайным образом заполняет двумерный
//        // список размерностью 3х4 цифрами от -20 до 30. Необходимо найти
//        // количество отрицательных элементов
//        //
//        // -18     4     -7
//        // -20     9     -3
//        // -18     -14   1
//        // 4       -8    -8
//        // Количество отрицательных элементов: 8
//
//        int n = 4, m = 3, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 31) - 20;
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//                if(mas[i][j] < 0) {
//                    count ++;
//                }
//
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);
//        /////////////////////////////////////////////////////////////////////////////////////


//        // найти строку в двухмерном массиве, имеющую минимальную сумму элементов
//        int n = 3, m = 5, count = 0, sun1 = 0, sum2 = 0, sum3 = 0, c = 0, pos = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 100);
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//                // сумма каждой строки
//                if (i == 0)
//                    sun1 += mas[i][j];
//                if (i == 1)
//                    sum2 += mas[i][j];
//                if (i == 2)
//                    sum3 += mas[i][j];
//
//                // ищем строки с минимальной суммой
//                if (sun1 < sum2) {
//                    c = sun1;
//                    pos = 1;
//                } else {
//                    c = sum2;
//                    pos = 2;
//                }
//                if (c > sum3) {
//                    c = sum3;
//                    pos = 3;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Сумма элемнтов 1 строки: " + sun1);
//        System.out.println("Сумма элемнтов 2 строки: " + sum2);
//        System.out.println("Сумма элемнтов 3 строки: " + sum3);
//        System.out.println("Строка с минимальной суммой элементов " + c + ", имеет номер " + pos);


//        // Зубчатый массив
//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("-> ");
//                mas[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j]+"\t");
//            }
//            System.out.println();
//        }

//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};

//        // int[][] mas = new int[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        int[][] mas = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] mas = new int[5][];
////        mas[0] = new int[1];
////        mas[1] = new int[2];
////        mas[2] = new int[3];
////        mas[3] = new int[4];
////        mas[4] = new int[5];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[i + 1];
//        }
//        int count = 0;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count ++;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] mas = new int[5][];
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[mas.length - i];
//        }
//        int count = 10;
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int n = 6;
//        int tp[][] = new int[n][];
//        for (int i = 0; i < tp.length; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
//            }
//        }
//        for (int i = 0; i < tp.length; i++) {
//            for (int j = 0; j < tp.length - i; j++) {
//                System.out.print("  ");
//
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "   ");
//            }
//            System.out.println();
//        }





    }

}
