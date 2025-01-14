package Lesson14.enams.generic_program;

//public class Rectangle extends Figure{
public class Rectangle implements Figure{
    private double width, height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
