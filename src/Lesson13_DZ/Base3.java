package Lesson13_DZ;

import Lesson13.*;

public class Base3 {
    public static void main(String[] args) {
        Shape3[] shape3s = new Shape3[3];
        shape3s[0] = new Ball(4.5);
        shape3s[0].draw();
        shape3s[1] = new Cylinder(2,2);
        shape3s[1].draw();
        shape3s[2] = new Pyramid(60,100);
        shape3s[2].draw();
    }
}
