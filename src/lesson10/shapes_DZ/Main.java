package lesson10.shapes_DZ;

public class Main {
    public static void main(String[] args) {
        Box3D box3d = new Box3D(
                5.0,
                3.0,
                2.0);
        System.out.print("Объект Box3D {");
        System.out.print("Ширина = " + box3d.getWidth());
        System.out.print(", Высота = " + box3d.getHeight());
        System.out.println(", Глубина = " + box3d.getDeep() + "}");
        System.out.println("Объем: " + box3d.volume());
        System.out.println();
        System.out.println("Новые значения");
        box3d.setWidth(10.0);
        box3d.setHeight(5.0);
        box3d.setDeep(7.0);
        System.out.println("Ширина: " + box3d.getWidth());
        System.out.println("Высота: " + box3d.getHeight());
        System.out.println("Глубина: " + box3d.getDeep());
        System.out.print("Объект Box3D {");
        System.out.print("Ширина = " + box3d.getWidth());
        System.out.print(", Высота = " + box3d.getHeight());
        System.out.println(", Глубина = " + box3d.getDeep() + "}");
        System.out.println("Объем: " + box3d.volume());


    }
}
