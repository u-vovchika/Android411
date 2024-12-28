package Lesson13;

public class Base {
    public static void main(String[] args) {
        Shape[] geom = new Shape[3];
        geom[0] = new Line(5,"red",1,2,3,4);
        geom[1] = new Rectangle(2,"yellow",5,10);
        geom[2] = new Triangle(3,"green",4,10);

        for (Shape g: geom){
            g.draw();
            if(g instanceof MathShape){
                double s = ((MathShape)g).getSquare();
                System.out.println("Площадь: " + s);
            }
        }

        Shape g = new Rectangle(2,"yellow",5,10);
        g.draw();
        MathShape g1 = new Rectangle(2,"yellow",5,10);
        g1.getSquare();




        //System.out.println(geom[2] instanceof MathShape);
    }
}
