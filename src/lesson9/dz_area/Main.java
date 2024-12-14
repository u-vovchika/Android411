package lesson9.dz_area;

import lesson9.numbers.Numbers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника по формуле Герона (3,4,5): " + DZ_Area.triangle1(3, 4, 5));
        System.out.println("Площадь треугольника через основание и высоту (6,7): " + DZ_Area.triangle2(6, 7));
        System.out.println("Площадь квадрата (7): " + DZ_Area.square(7));
        System.out.println("Площадь прямоугольника (2,6): " + DZ_Area.rectangle(2, 6));
        System.out.println("Количество подсчетов площади: " + DZ_Area.getCount());

    }
}
