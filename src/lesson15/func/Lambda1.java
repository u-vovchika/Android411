package lesson15.func;

import java.util.Locale;
import java.util.function.Predicate;

public class Lambda1 {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-7));

//        Predicate<String> isPalindrome = str -> {
//            str = str.toLowerCase();
//            String reversed = new StringBuilder(str).reverse().toString();
//            return str.equals(reversed);
//        };
//
//        String word1 = "Мадам";
//        boolean res = isPalindrome.test(word1);
//        System.out.println(word1 + " это палиндром: " + res);
//
//        String word2 = "радар";
//        boolean res2 = isPalindrome.test(word2);
//        System.out.println(word2 + " это палиндром: " + res2);


        Predicate<Integer> isSimple = num -> {
            if (num < 2) return false;
            for (int i = 2; i < num; i++) {
                System.out.println("i = " + i);
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Число простое: " + isSimple.test(7));
        System.out.println("Число простое: " + isSimple.test(12));


    }


}
