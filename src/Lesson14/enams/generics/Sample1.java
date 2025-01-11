package Lesson14.enams.generics;

import java.awt.*;

public class Sample1 {
    public static void main(String[] args) {
        Point<Integer,String> pt = new Point<Integer, String>(1, 2, "point_1");
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getX() + " " + pt.getY());

        Point<Double, Integer> pt2 = new Point<>(10.5, 20.6, 1);
//        pt2.x = 15.7;
//        pt2.y = 10.5;
        System.out.println(pt2.getX() + " " + pt2.getY());

    }
}

class Point<Tt, V> {
    private V id;
    public Tt x, y;

    public Point(Tt x, Tt y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public Tt getX() {
        return x;
    }

    public Tt getY() {
        return y;
    }

    public V getId() {
        return id;
    }
}
