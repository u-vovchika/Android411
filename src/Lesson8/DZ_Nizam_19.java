package Lesson8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DZ_Nizam_19 {
    public static void main(String[] args) {

        System.out.println("Валидация номера телефона:");
        String s = "+7 499 456-45-78, +74994564578, +7(499) 456 45 78, 7 (499) 456-45-78,";
        //String pattern = "\\+?7[\\, ]?[(]?[0-9][0-9][0-9][)]?[\\, ]?[0-9][0-9][0-9][\\, -]?[0-9][0-9][\\, -]?[0-9][0-9]";
        String pattern = "(\\+?7[\\, ]?)([(]?[0-9][0-9][0-9][)]?)([\\, ]?[0-9][0-9][0-9])([\\, -]?[0-9][0-9])([\\, -]?[0-9][0-9])";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

        while (matcher.find()){
            System.out.print(matcher.group(1));
            System.out.print(matcher.group(2));
            System.out.print(matcher.group(3));
            System.out.print(matcher.group(4));
            System.out.print(matcher.group(5));
            System.out.println();

        }


    }
}
