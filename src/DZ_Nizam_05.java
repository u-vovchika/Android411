//package lessen2;

import java.util.Scanner;

public class DZ_Nizam_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Hr = 0;
        System.out.print("Введите количество часов: ");
        Hr = input.nextInt();

        switch ((Hr >= 0) && (Hr < 6) ? 1 :
                (Hr >= 6) && (Hr < 13) ? 2 :
                (Hr >= 13) && (Hr < 17) ? 3 :
                (Hr >= 17) && (Hr < 24) ? 4 :0){
            case 1  -> System.out.println("Доброй ночи");
            case 2  -> System.out.println("Доброе утро");
            case 3  -> System.out.println("Добрый день");
            case 4  -> System.out.println("Добрый вечер");
            default -> System.out.println("Введено некорректное значение");

        }



    }
}
