package Lesson88.rect;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,15);
        rect1.setLength(3);
        rect1.setWidth(9);
        System.out.println("Длина прямоугольника: " + rect1.getLength());
        System.out.println("Ширина прямоугольника: " + rect1.getWidth());
        System.out.println("Площадь треугольника: " +rect1.getArea());
        System.out.println("Периметр треугольника: " +rect1.getPerimeter());
        System.out.printf("Гипотенуза треугольника: %.2f%n", rect1.getHypotenus());
        rect1.getPainting(3,9);
    }

}
