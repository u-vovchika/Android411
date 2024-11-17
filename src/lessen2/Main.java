package lessen2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        System.out.print("Введите число:  ");
////        int num = input.nextInt();
////        System.out.println("Вы ввели число: " + num);
//
//        System.out.print("Имя: ");
//        String name = input.nextLine();
//        System.out.print("Возраст: ");
//        int age = input.nextInt();
//        System.out.print("Рост: ");
//        float height = input.nextFloat();
//        System.out.printf("Имя: %s. Возраст: %d. Рост: %.2f %n", name, age, height);
//        input.close();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите четыре числа:");
        System.out.print("1: ");
        int num1 = input.nextInt();
        System.out.print("2: ");
        int num2 = input.nextInt();
        System.out.print("3: ");
        int num3 = input.nextInt();
        System.out.print("4: ");
        int num4 = input.nextInt();
        System.out.printf("Результат: %.2f %n", (float)(num1 + num2) / (num3 + num4));


        input.close();


    }
}
