package lesson10.shapes;

public class Main {
    public static void main(String[] args) {
        Restangle rect = new Restangle(10, 20, "green");
//        rect.setWidth(20);
//        rect.setHeight(5);
        System.out.println("Ширина: " + rect.getWidth());
        System.out.println("Высота: " + rect.getHeight());
        System.out.println("Цвет: " + rect.getColor());
        System.out.println("Площадь: " + rect.area());
    }
}
