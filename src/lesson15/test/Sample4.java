package lesson15.test;

interface StringFunc {
    String func(String n);
}

public class Sample4 {
    public static void main(String[] args) {
        String inStr = "Лямбда выражения в Java";
        System.out.println("Это исходная строка: " + inStr);
        String outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Это развернутая строка: " + stringOp(reverse, inStr));
    }

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }


}
