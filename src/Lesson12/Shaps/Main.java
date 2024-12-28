package Lesson12.Shaps;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(3,"red");
        square.info();
        Rectangle rectangle = new Rectangle(7,3,4,"green");
        rectangle.info();
        Triangle triangle = new Triangle(5,"yellow");
        triangle.info();

//        Shaps[] shaps = new Shaps()[3];
//        shaps[0] = new Square(5,"red");
//        shaps[1] = new Rectangle(7,3,4,"red");
//        shaps[2] = new Triangle(5,"red");
//        for (int i = 0; i < shaps.length; i++) {
//            shaps.info();
//        }




    }
}
