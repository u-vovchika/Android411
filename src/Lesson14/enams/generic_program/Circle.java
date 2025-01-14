package Lesson14.enams.generic_program;

//public class Circle extends Figure{
public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
