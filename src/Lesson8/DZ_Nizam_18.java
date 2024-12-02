package Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ_Nizam_18 {
    public static void main(String[] args) {
        System.out.println("Найти адрес электронной почты.");
        System.out.println("Текст:");
        String s = "123456@i.ru, 123_456@ru.mame.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";
        System.out.println(s);
        String pattern = "[\\w-А-я0-9.]{1,}@[a-z]+.[a-z]+.?[a-z]+?[^\\, ]?";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        System.out.print("\n[");
        while (matcher.find()) {
            System.out.print("'" + matcher.group() + "',  ");
        }
        System.out.print("]");
    }
}
