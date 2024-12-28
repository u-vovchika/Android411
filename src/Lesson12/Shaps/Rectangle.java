package Lesson12.Shaps;

public class Rectangle extends Shaps {
    private int width;
    private int height;

    public Rectangle(int side , int width, int height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("\n=== Прямоугольник ===\nШирина: "  +
                "\nВысота: " + height +
                "\nЦвет: " + getColor() +
                "\nПлощадь: " + getArea() +
                "\nПериметр: " + getPerimeter());
        dray();

    }

    @Override
    public void dray() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

            }

        }
    }
}
