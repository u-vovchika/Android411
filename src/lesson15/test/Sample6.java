package lesson15.test;

interface Convertor<F,T>{
    T convert(F from);
}

public class Sample6 {
    public static void main(String[] args) {
        //Convertor<String ,Integer> convertor = (from) -> Integer.valueOf(from); // parseInt(String s)
        Convertor<String ,Integer> convertor = Integer::valueOf; // parseInt(String s)
        Integer converted = convertor.convert("123");
        System.out.println(converted);
    }
}
