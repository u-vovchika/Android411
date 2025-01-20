package lesson15.test;

interface Calc2<T> {
    T calculate(T x, T y);
}

public class Sample3 {
    public static void main(String[] args) {
        Calc2<Integer> operation1 = (a, b) -> a + b;
        Calc2<String> operation2 = (a, b) -> a + b;

        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("Hello ", "World!"));
    }
}
