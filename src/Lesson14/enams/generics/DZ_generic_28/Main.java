package Lesson14.enams.generics.DZ_generic_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int num = input.nextInt();
        Integer[] numArray = new Integer[num];
        for (int i = 0; i < num; i++) {
            System.out.print("-> ");
            numArray[i] = input.nextInt();
        }

        System.out.print("Введите количество элементов массива строк: ");
        int str = input.nextInt();
        String[] strArray = new String[str];
        input.nextLine();
        for (int i = 0; i < str; i++) {
            System.out.print("-> ");
            strArray[i] = input.nextLine();
        }
        System.out.print("Массив: ");
        printArray(numArray);

        System.out.print("Массив: ");
        printArray(strArray);

        input.close();

    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
