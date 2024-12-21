package lesson10.shapes_DZ;

public class Box3D extends Box {
    private double deep;

    public Box3D(double width, double height, double deep) {
        super(width, height);
        //this.deep = deep;

        setDeep(deep);

    }

    public double getDeep() {
        return deep;
    }

    public void setDeep(double deep) {
        this.deep = deep;
    }

    public double volume(){

        return deep * width * height;
    }
}
