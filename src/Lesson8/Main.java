package Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 5918. Hel_lo. Ели[-ели]";
////        String pattern = "[12][0-9][0-9][0-9]";
////        String pattern = "[А-яЁё]";   //// "[А-ЯЁа-яё]"
////        String pattern = "[A-Za-z]";   //// "[А-ЯЁа-яё]"
////        String pattern = "[А-яЁё\\[\\]-]";   //// "[А-ЯЁа-яё]"
//        String pattern = "[^0-9]";   //// "[А-ЯЁа-яё]"
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
////        System.out.println(matcher.find());
//        while (matcher.find()){
////            System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
////            System.out.println(s.substring(matcher.start(), matcher.end()));
//            System.out.print(matcher.group() + " ");
//        }


        System.out.println("Удалите из строки повторяющиеся символы и все пробелы.");
        System.out.println();
        System.out.print("Исходная строка - ");
        StringBuilder sb = new StringBuilder("\" Текст с повторяющимися символами \"");
        System.out.println(sb);
        modifyStr(sb);
        System.out.print("Измененная строка - ");
        System.out.println(sb);
    }

    public static StringBuilder modifyStr(StringBuilder stBuild) {
        int pos;
        while ((pos = stBuild.indexOf(" ")) != -1){
            stBuild.deleteCharAt(pos);
            stBuild.insert(pos, "");
        }
        return stBuild;
    }




}
