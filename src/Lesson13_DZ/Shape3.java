package Lesson13_DZ;

abstract class Shape3 {
    abstract void draw();
}

class Ball extends Shape3 {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Фигура: шар      | Объем фигуры: "
                + (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}

class Cylinder extends Shape3 {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Фигура: цилиндр  | Объем фигуры: "
                + Math.PI * Math.pow(radius, 2) * height);
    }
}

class Pyramid extends Shape3 {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Фигура: пирамида | Объем фигуры: "
                + (1.0 / 3.0) * baseArea * height);
    }
}