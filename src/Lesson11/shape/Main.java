package Lesson11.shape;

public class Main {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];
        s[0] = new Circle();
        s[1] = new Triangle();
        s[2] = new Square();

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].draw());
            System.out.println(s[i].erase());
        }
    }
}


class Shape{
    public String draw(){
        return "Рисуем фигуру";
    }

    public String erase(){
        return "Стираем фигуру";
    }
}


class Circle extends Shape{
    @Override
    public String draw() {
        return "Рисуем круг";
    }

    @Override
    public String erase() {
        return "Стираем круг";
    }
}

class Triangle extends Shape{
    @Override
    public String draw() {
        return "Рисуем треугольник";
    }

    @Override
    public String erase() {
        return "Стираем треугольник";
    }
}

class Square extends Shape {
    @Override
    public String draw() {
        return "Рисуем квадрат";
    }

    @Override
    public String erase() {
        return "Стираем квадрат";
    }
}