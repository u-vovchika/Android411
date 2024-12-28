package Lesson12.Shaps;


public abstract class Shaps {
    private String color;

    public Shaps(String color) {
        this.color =
                color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void info();

    public abstract void dray();


}
