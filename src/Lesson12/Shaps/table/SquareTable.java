package Lesson12.Shaps.table;

public class SquareTable extends Table {

    public SquareTable(int width, int height) {
        super(width, height);
    }

    public SquareTable(int width) {
        super(width);
    }

    @Override
    public void calcArea() {
        System.out.printf("Ширина: %d%nВысотв: %d%nПлощадь: %d%n%n",
                getWidth(),
                getHeight(),
                getWidth() * getHeight());
    }
}
