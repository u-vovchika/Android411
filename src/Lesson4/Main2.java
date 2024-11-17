package Lesson4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("На каком вы этаже: ");
//        int n1 = input.nextInt();
//        elevator(n1);6
//

        int[] mas = {1, 3, 5, 7, 9};
        System.out.println(sumList(0, mas));


   //     System.out.println(toStr(253, 16));

    }

//    public static String toStr(int n, int base) { // n = 25
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
//        if (n < base) //  254 < 10
//            return convert[n];
//        else
//            return toStr(n / base, base) + convert[n % base];  // toStr(254 / 16, 10) + convert[25 % 16] => convert[5]
//        // => "E" + "5"
//
//    }






    //// Рекурсия - это метод, который возвращает сам себя
    public static int sumList(int i, int[] arr) {
        if (i == (arr.length - 1))       //// обязательное условие, чтобы выйти из цикла
            return arr[i];
        return arr[i] + sumList(i + 1, arr);  //// Вызывает сам себя до тех пор, пока не сработает условие
    }


//    public static int sumList(int[] arr) {
//        int sum = 0;
//        for (int i: arr){
//            sum += i;
//        }
//        return sum;
//    }
//
//
//    public static void elevator(int n) {
//        if (n == 0) {
//            System.out.println("Вы в подвале");
//            return;
//        }
//        System.out.println("=> " + n);
//        elevator(n - 1);
//        System.out.print(n + " ");
//
//    }


}
