package Lesson13.DZ_interfase;

interface ReSize {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements ReSize {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void printSize() {
        System.out.println("Width: " + width + "  Height: " + height);
    }

}
