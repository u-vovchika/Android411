import java.util.Scanner;

public class DZ_Nizam_11_2 {
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
            System.out.println("Площаь: " + place(a, b));
        }
        if (num == 2) { //triangle
            System.out.print("Основание: ");
            float a = input.nextInt();
            System.out.print("Высота: ");
            float b = input.nextInt();
            System.out.println("Площаь: " + (place(a, b))/2);
        }
        if (num == 3) {  // circle
            System.out.print("Радиус = ");
            float a = input.nextInt();
            float b = a;
            //radius *= radius;
            System.out.println("Площаь: " + (Math.PI *place(a,b)));
        }
        if (num <= 0 || num > 3) {
            System.out.println("Введите от 1 до 3 !!! ");
        }
    }


    public static float place(float a, float b) {
        float S = a * b;
        return S;
    }


}
