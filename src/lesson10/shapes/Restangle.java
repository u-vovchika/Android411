package lesson10.shapes;

public class Restangle extends Figure {
    private int width;
    private int height;

    public Restangle(int width, int height, String color) {
        super(color);
//        this.width = width;
//        this.height = height;
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0){
            throw new IllegalArgumentException("Требуется положительное число");
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
    }

    public int area() {
        return width * height;
    }
}
