import java.util.Scanner;

public class DZ_Nizam_08 {
    public static void main(String[] args) {
        //// домашнее задание 08
        // Предложите пользователю ввести начало и конец диапозона.
        // Сохраните значения входящие в заданный диапозон в массив
        Scanner input = new Scanner(System.in);
        int star, end;
        System.out.print("Введите начало диапозона: ");
        star = input.nextInt();
        System.out.print("Введите конец диапозона: ");
        end = input.nextInt();
        int[] array = new int[end];
        if (star > end) {
            System.out.println("Начало диапозона должно быть меньше конца диапозона !!!!!");
        } else {
            for (int i = star; i <= array.length; i++) {
                System.out.print(i + " ");
            }
        }

    }
}
