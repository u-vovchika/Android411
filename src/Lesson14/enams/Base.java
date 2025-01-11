package Lesson14.enams;

import java.util.regex.Pattern;

enum RegEx {
    UPPER("[A-Z]+"),
    LOWER("[a-z]+"),
    NUMER("[+-]?[0-9]]+");

    private final Pattern pattern;

    RegEx(final String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public boolean test(final String input) {
        return pattern.matcher(input).matches();
    }
}

public class Base {
    public static void main(String[] args) {
        System.out.println(RegEx.UPPER.test("ABC"));
        System.out.println(RegEx.LOWER.test("abc"));
        System.out.println(RegEx.NUMER.test("+79053"));
    }
}
