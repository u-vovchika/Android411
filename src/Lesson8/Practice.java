package Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Practice {
    public static void main(String[] args) {
//        try {
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапозоне от 00 до 59. 2021-06-15Т01:09.";
//            String pattern = "[0-2][0-9]:[0-5][0-9]";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        } catch (PatternSyntaxException pse) {
//            System.out.println("неправильное регулярное выражение: " + pse.getMessage());
//            System.out.println("Описание: " + pse.getDescription());
//            System.out.println("Позиция: " + pse.getIndex());
//            System.out.println("Неправильный шаблон: " + pse.getPattern());
//        }


        //String s = "Я ищу совпадения в 2024 году. \nИ я их найду в 2 счета. 5910. Hel_lo. Ели[-ели].";
        //String pattern = "[^0-9]";   // Все кроме цифр
        //String pattern = ".";   //Любой символ, кроме новой строки (\n - перенос на другую строчку)

        //String pattern = "\\d"; // [0-9]  //Любая одна цифра, которая встретится
        //String pattern = "\\D"; // [^0-9]  //Любая одна не цифра, которая встретится

        //String pattern = "\\s"; // поиск пробельных символов
        //String pattern = "\\S"; // поиск не пробельных символов
        //String pattern = "\\w"; // [A-Za-z0-9_]
        //String pattern = "\\W"; // не [A-Za-z0-9_]

        //String pattern = "\\AЯ ищу совпадения"; //  поиск с начало строки
        //String pattern = "Ели\\[-ели].\\Z"; //  поиск в конце строки
        //String pattern = "совпадения\\B"; //
        //String pattern = "\\w+"; //
//        String pattern = "20*"; //
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + " ");
//        }


//        String s = "Цифры: 7, ++17, -42, 0013, 0.3";
//        //String pattern = "\\d+";   // 7 17 42 0013 0.3
//        //String pattern = "[+-]?[\\d.]+";   // 7 17 42 0013 0.3
//        String pattern = "[+-]?[\\d.]+";   // 7 17 42 0013 0.3
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//
//        while (matcher.find()){
//            System.out.print(matcher.group() + " ");
//        }

        // String s = "author=Пушкин А.С.; title = Евгений Онегин; price =200; year= 1831";
//        //String pattern = "\\w+\\s*=\\s*[А-я0-9 .]+";
//        String pattern = "\\w+\\s*=[^;]+";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }


        //String s = "12 сентября 2024 года 456789123";
//        String s = "+7 499 456-45-78, +74994564578, +7 (499) 456 45 78, 74994564578";
//        String pattern = "\\+?7\\d{10}";

//        String s = "I learning Java Hello";
//        //String pattern = "^\\w+\\s\\w+";
//        //String pattern = "\\w+\\s\\w+$";
//        String pattern = "\\w+\\s\\w+\\s\\w+\\s\\w+$";

        String s = "Java_master123";
        String pattern = "^[\\w-]{3,16}$";   //[A-Za-z0-9_-]
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}


/* Количество повторений
 + - от 1 до бесконечности
 * - от 0 до бесконечности
 ? - от 0 до 1
*/