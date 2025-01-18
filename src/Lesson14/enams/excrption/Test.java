package Lesson14.enams.excrption;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String first = imput.nextLine();

        System.out.print("Введите второе число: ");
        String second = imput.nextLine();

        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
        } catch (NumberFormatException e){
            System.out.println("Одно или оба значения некорректны!");
        }

        System.out.println("Результат: " + (a + b));
    }

}
