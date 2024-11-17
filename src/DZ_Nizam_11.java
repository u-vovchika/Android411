import java.util.Scanner;

public class DZ_Nizam_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Напишите метод нахождения площади фигур");
        System.out.println();
        System.out.print("1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        num = input.nextInt();
        if (num == 1) { //rect
            System.out.print("Высота: ");
            float a = input.nextInt();
            System.out.print("Ширина: ");
            float b = input.nextInt();
            System.out.println("Площаь: " + rect(a, b));
        }
        if (num == 2) { //triangle
            System.out.print("Основание: ");
            float a = input.nextInt();
            System.out.print("Высота: ");
            float b = input.nextInt();
            System.out.println("Площаь: " + triangle(a, b));
        }
        if (num == 3) {  // circle
            System.out.print("Радиус = ");
            float radius = input.nextInt();
            //radius *= radius;
            System.out.println("Площаь: " + (Math.PI *circle(radius)));
        }
        if (num <= 0 || num > 3) {
            System.out.println("Введите от 1 до 3 !!! ");
        }
    }


    public static float rect(float a, float b) {
        float S = a * b;
        return S;
    }

    public static float triangle(float a, float b) {
        float S = a * b / 2;
        return S;
    }

    public static float circle(float a) {
        float S = a * a;
        return S;
    }

}
