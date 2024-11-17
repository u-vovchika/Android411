import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DZ_Nizam_09 {
    public static void main(String[] args) {

        System.out.println("Задача возвести каждый элемент в квадрат:");
        int[][] num = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int m;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] *= num[i][j];
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
