package lesson9.dz_area;

public class DZ_Area {

    private static int count;

    public static float triangle1(float a, float b, float c) {
        count++;
        return (a + b + c) / 2;

    }

    public static float triangle2(float a, float b) {
        count++;
        return (a * b) / 2;
    }

    public static int square(int a) {
        count++;
        return a * a;
    }

    public static int rectangle(int a, int b) {
        count++;
        return a * b;

    }

    public static int getCount() {
        return count;
    }
}
