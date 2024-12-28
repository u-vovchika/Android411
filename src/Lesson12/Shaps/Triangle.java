package Lesson12.Shaps;

public class Triangle extends Shaps {
    private int side;

    public Triangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * side * side) / 4;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("\n=== разносторонний треугольник ===" +
                "\nСторона: " + side +
                "\nЦвет: " + getColor() +
                "\nПлощадь: " + getArea() +
                "\nПериметр: " + getPerimeter());
        dray();
    }

    @Override
    public void dray() {
//        //int copy = (int) side;
//        for (int i = 0; i <= side; i++) {
//            for (int j = 0; j < side; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(" *  ");
//            }
//            System.out.println();
//
//        }

        for (int i = 0; i <= side; i++) {
            for (int j = i; j < side; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }

    }
}
