import java.util.Scanner;

public class DZ_Nizam_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Вычислить количество отрицательных чисел в массиве:");
        System.out.println();
        int[] n = {-44, -3, 8, -11, 1, -66};
        System.out.print("Массив: ");
        bytesArray(n);
        int count = data(0, n);
        System.out.println("n = " + count);
    }
    //// Рекурсия - это метод, который возвращает сам себя
    public static void bytesArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int data(int i, int[] arr) {
        if (i == arr.length)
            return 0;
        int count = (arr[i] < 0) ? 1 : 0;
        return count + data(i + 1, arr);
    }


}
