package Lesson6;

import java.util.Arrays;

public class DZ_Nizam_15 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Дана строка - ");
        String s = "Hello, World";
        System.out.println(s);
        int[] result = new int['z' - 'a' + 1];
        int[] result2 = new int['Z' - 'A' + 1];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[ch - 'a']++;
                count++;
            }
        }
        System.out.print("Количество строчных букв - " + count + ",  ");
        count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch2 = s.charAt(i);
            if (ch2 >= 'A' && ch2 <= 'Z') {
                result2[ch2 - 'A']++;
                count++;
            }
        }
        System.out.println("Количество прописных букв - " + count);
    }
}