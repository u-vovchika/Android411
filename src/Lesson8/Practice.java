package Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
    public static void main(String[] args) {
        String  s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапозоне от 00 до 59. 2021-06-15Т01:09.";
        String pattern = "[0-2][0-9]:[0-5][0-9]";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }




    }
}
