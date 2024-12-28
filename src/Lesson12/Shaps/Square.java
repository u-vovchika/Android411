package Lesson12.Shaps;

public class Square extends Shaps {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void info() {
//        System.out.println("=== Квадрат ===\nСторона: " + side +
//                "\nЦвет: " + getColor() + "\nПлощадь: " + getArea() +
//                "\nПериметр: " = getPerimeter());

        System.out.println("=== Квадрат ===\nСторона: " + side +
                "\nЦвет: " + getColor() + "\nПлощадь: " + getArea() +
                "\nПериметр: " + getPerimeter());
        dray();

    }

    @Override
    public void dray() {

    }
}
