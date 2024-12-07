package Lesson8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 5918. Hel_lo World. Ели[-ели]. 200000000000000000";
        //String s = "Суворова Виктория, Россия, г. Сочи,     +7 999 555 77 33";
        String s = "05-03-1987 // Дата рождения";
        String s2 = s.replaceAll("\\s//.*","").replaceAll("-",".");
        System.out.println("Дата рождения: " + s2);



//        //String [] arr = s.split("\\.");
//        String [] arr = s.split(",\\s*");
//        System.out.println(Arrays.toString(arr));
//        for (String temp:arr){
//            System.out.println(temp);
//        }




        //String s = "Goods - 500$";
        //String s = "Java,\njava,\nJAVA";
        //String s = "<body>пример жадного соответствия регулярных выражений</body>";
        //String s = "Егорова Алиса Александровна";
        //String s = "Word2016, PS6, AI5";
        //String s = "abc";
        //String s = "Ольга и Виталий отлично учатся";
        //String s = "int = 4, float= 4.0f, double  = 8.0";
        //String s = "127.0.0.1";
//        String s = "192.168.255.255";
////        String pattern = "[12][0-9][0-9][0-9]";
////        String pattern = "[А-яЁё]";   //// "[А-ЯЁа-яё]"
////        String pattern = "[A-Za-z]";   //// "[А-ЯЁа-яё]"
////        String pattern = "[А-яЁё\\[\\]-]";   //// "[А-ЯЁа-яё]"
////        String s = "Цифры: 7, ++17, -42, 0013, 0.3";
////        //String pattern = "\\d+";   // 7 17 42 0013 0.3
////        //String pattern = "[+-]?[\\d.]+";   // 7 17 42 0013 0.3
//
//        //System.out.println("Исходная строка: " + s);
//        //String pattern = "я";
//        //String pattern = "\\d+ #поиск цифр";
//        //String pattern = "one.\\w+";
//        //String pattern = "500$";
//        //String pattern = "(?im)^java";
//        //String pattern = "<.*?>";
//        //String pattern = "А.+?а";
//        //String pattern = "([a-z]+)(\\d*)";
//        //String pattern = "(.(.(.)))";
//        //String pattern = "Петр[А-я]]Ольга|Виталий";
//        //String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//        String pattern = "(\\d{1,3}\\.){3}\\d{1,3}";
//        //String pattern = "20*";
//        //Pattern regex = Pattern.compile(pattern,Pattern.COMMENTS);
//        //Pattern regex = Pattern.compile(pattern,Pattern.DOTALL);
//        //Pattern regex = Pattern.compile(pattern,Pattern.MULTILINE);
//        //Pattern regex = Pattern.compile(pattern,Pattern.LITERAL);
//        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
////        matcher.find();
////        System.out.println(matcher.groupCount());
////        for (int i = 0; i < matcher.groupCount()+1; i++) {
////            System.out.println(i + ": " + matcher.group(i));
////
////        }
//
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }


//        System.out.println("Удалите из строки повторяющиеся символы и все пробелы.");
//        System.out.println();
//        System.out.print("Исходная строка - ");
//        StringBuilder sb = new StringBuilder("\" Текст с повторяющимися символами \"");
//        System.out.println(sb);
//        modifyStr(sb);
//        System.out.print("Измененная строка - ");
//        System.out.println(sb);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите дату в формате dd-mm-YYYY: "); // 18-10-2024
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[0-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }



    }

//    public static StringBuilder modifyStr(StringBuilder stBuild) {
//        int pos;
//        while ((pos = stBuild.indexOf(" ")) != -1){
//            stBuild.deleteCharAt(pos);
//            stBuild.insert(pos, "");
//        }
//        return stBuild;
//    }




}
