package lesson15.func;

import java.util.function.Function;

public class Lambda2 {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> (x) + " долларов";
        System.out.println(convert.apply(5));

        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.7));
    }

}
