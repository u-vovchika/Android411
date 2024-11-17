import java.util.Scanner;
public class DZ_Nizam_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Вычисление площади фигур");
        System.out.println();
        System.out.println("Выбор фигуры:");
        System.out.println("1 - треугольник");
        System.out.println("2 - прямоугольник");
        System.out.print("3 - круг\n: ");
        num = input.nextInt();
        if (num == 1) {
            System.out.print("Введите сторону a = ");
            float a = input.nextInt();
            System.out.print("Введите сторону b = ");
            float b = input.nextInt();
            System.out.print("Введите сторону c = ");
            float c = input.nextInt();
            float p = (a + b + c) / 2;
            float A = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(A);
        }
        if (num == 2) {
            System.out.print("Введите сторону a = ");
            float a = input.nextInt();
            System.out.print("Введите сторону b = ");
            float b = input.nextInt();
            System.out.print(a * b);
        }
        if (num == 3) {
            System.out.print("Введите радиус = ");
            float radius = input.nextInt();
            radius *= radius;
            System.out.printf("%f", Math.PI * radius);
        }
        if (num <= 0 || num > 3) {
            System.out.println("Введите от 1 до 3 !!! ");
        }
    }
}
