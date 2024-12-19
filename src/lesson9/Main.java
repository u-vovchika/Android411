package lesson9;

public class Main {
    public static void main(String[] args) {
        Calculayion obj = new Calculayion();
        // перегрузка методов
        //  1. по количеству параметров
        obj.calculate(1, 2);
        obj.calculate(1, 2, 3);
        //  2. по типам параметров
        obj.calculate(2.5, 3.4);

        //  3. по порядку указания параметров
        obj.calculate(2.5, 2);
        obj.calculate(2, 2.5);
    }
}

class Calculayion {
    public void calculate(int a, int b) {
        System.out.println("Сумма двух целых чисел: " + (a + b));
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Сумма двух целых чисел: " + (a + b + c));
    }

    public void calculate(double a, double b) {
        System.out.println("Сумма двух вещественных чисел: " + (a + b));
    }

    public void calculate(double a, int b) {
        System.out.println("В результате вещественных чисел: " + (a + b));
    }

    public void calculate(int a, double b) {
        System.out.println("В результате целое число: " + (int)(a + b));
    }
}