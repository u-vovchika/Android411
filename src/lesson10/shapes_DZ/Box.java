package lesson10.shapes_DZ;

public class Box {
    protected double width;
    protected double height;

    public Box(double width, double height) {
//        this.width = width;
//        this.height = height;
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0)
        this.height = height;
    }
}