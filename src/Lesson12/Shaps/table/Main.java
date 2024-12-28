package Lesson12.Shaps.table;

public class Main {
    public static void main(String[] args) {
        SquareTable t1 = new SquareTable(20,
                10);
        t1.calcArea();

        SquareTable t2 = new SquareTable(20);
        t2.calcArea();

        RoundTable t3 = new RoundTable(20);
        t3.calcArea();
    }
}
