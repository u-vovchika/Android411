package Lesson13.DZ_interfase;

public class MainInterfase {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100,150);
        rectangle.printSize();

        rectangle.resizeWidth(250);
        rectangle.resizeHeight(300);
        rectangle.printSize();
    }
}
