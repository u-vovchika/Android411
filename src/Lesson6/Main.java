package Lesson6;

import org.w3c.dom.css.CSSStyleRule;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String str1 = "Hello";
//        String str2 = "World";
//        str2 = str1 + "!";
//        String message = str1 +" "+ str2;
//        System.out.println(message);

//        char[] helloArray = {'П','р','и','в','е','т'};
//        String helloArray = new String(helloArray);
//        System.out.println(helloArray);

//        String str1 = "Hello";
//        int a = 5;
//        String message = str1 + " " + a;
//        System.out.println(message);

//        String str1 = "2";
//        int a = 5;
//        String message = str1 + a;
//        System.out.println(message);


//        int a = 5;
//        String message = "" + a;
//        System.out.println(message); // 5 - строка


//        String str1 = "2";
//        int a = 5;
//       // int b = Integer.parseInt(str1);
//        int message = Integer.parseInt(str1) + a;
//        System.out.println(message);


//        String str1 = "Hello";
//        int count = (str1 + 57).length();  // "Hello" + 57 => "Hello57".length()
//        System.out.println(count);

        // System.out.println(" ".length());  // = 1

//        String name = "Nikita";
////        String name2 = name.toLowerCase();
////        System.out.println(name2);
//        System.out.println(name.toLowerCase());
//        System.out.println(name);

//        String name = "Nikita";
//        String name2 = name.toLowerCase();
//        System.out.println(name2);

//        String s = "Я буду хорошим программистом";
//        char res = s.charAt(7); // s[7]
//        System.out.println(res);


//        String s = "я буду хорошим программистом";
//        System.out.println(s);
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch >= 'а' && ch <= 'я'){
//                result[ch - 'а']++;
//            }
//            for (int j = 0; j < result.length; j++) {
//                System.out.println((char) (i + 'а') + " = " + result[i]);
//
//            }
//        }

//        String s = "Я буду хорошим программистом";
//        System.out.println(s);
//        int[] result = new int['я' - 'а' + 1];
//        //System.out.println(Arrays.toString(result));
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch >= 'а' && ch <= 'я') {
//                result[ch - 'а']++;
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);
//        }

//        String s1 = "";
//        if(s1.length() == 0 || s1.isEmpty()){
//            System.out.println("Пустая строка");
//        }


//        String str1 = "Строка";
//        char[] res = str1.toCharArray();
//
//        System.out.println("Массив символов:");
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }

//        String path = "https://www.oracle.com/java/technologies/downloads/#jdk20-";
//        char[] chars = path.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i]== '/'){
//                chars[i] = '\\';
//            }
//        }
//        String res = new String(chars);
//        System.out.println(res);


//        String str1 = "I learning Java";
//
//        System.out.println(str1);
//        System.out.println(str1.indexOf('a'));
//        System.out.println(str1.lastIndexOf('a'));
//        System.out.println(str1.indexOf('a',5));
//        System.out.println(str1.lastIndexOf('a',5));


//        System.out.println("    Hello World ".trim());


//        String str = "I learning Java";
//        String str1 = str.substring(2, 10);
//        System.out.println(str1);
//        System.out.println("I learning Java".substring(2));


//        System.out.print("Введите два слова через пробел: ");
//        String str = input.nextLine();  // один два
////        String first = str.substring(0, str.indexOf(" "));  // от 0 до 4
////        System.out.println(first);
////
////        String second = str.substring(str.indexOf(" ") + 1);
////        System.out.println(second);
////        System.out.println(second + " " + first);
//        System.out.println(str.substring(str.indexOf(" ") + 1) + " " + str.substring(0, str.indexOf(" ")));


//        String str1 = "I learning Java";
//        String[] words = str1.split("a");
//        for (String word : words)
//            System.out.println(word);


//        System.out.print("Введите ФИО: ");
//        String str = input.nextLine();
//        String[] fio = str.split(" ");
//        System.out.println(Arrays.toString(fio));
//        System.out.println(fio[0]+" "+ fio[1].substring(0,1) + "."+ fio[2].substring(0,1)+".");
//        System.out.println(fio[0]+" "+ fio[1].charAt(0) + "."+ fio[2].charAt(0)+".");


//        // Строка -> акортС
//        String str = "Строка...";
//        System.out.print(str);
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(str.length() - 1 - i));
//        }

//        // Строка -> акортС
//        String str = "Строка...";
//        char[] res new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            res[i] = str.charAt(str.length() - 1 -i);
//        }
//        System.out.println(res);


//        String line = "Строка";
//        String result = "";
//        for (int i = line.length() - 1; i >= 0; i--) {
//            result += line.charAt(i);
//        }
//        System.out.println(result);


//        String line = "Строка";
//        String result = "";
//        for (int i = 0; i < line.length(); i++) {
//            result = line.charAt(i) + result;
//        }
//        System.out.println(result);

//        String res = String.join(":", "00", "23","30");
//        System.out.println(res);
//
//        String[] text = new String[]{"Я","буду", "хорошим", "программистом"};
//        String str = String.join(" && ", text);
//        System.out.println(str);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        System.out.println(text);
//        String[] array = text.split("Java");
//       // System.out.println(Arrays.toString(array));
//        String res = String.join("Android",array);
//        System.out.println(res);


//        String text = "Я изучаю Java. Мне нравится Java.";
//        text = text.replace("Java", "Android");
//        System.out.println(text);

//        String text = "Замените в этой строке все появления буквы 'o' на букву 'О', кроме первого и последнего вхождения";
//        text = text.replace("о", "O");
//        System.out.println(text);
//        System.out.println(text.indexOf('o', 5));


//        String text = "Замените в этой строке все появления буквы 'o' на букву 'О', кроме первого и последнего вхождения";
//        String text2 = "";
//        char x;
//        int pos1 = text.indexOf('о');               //// Индекс первого вхоэжения
//        int pos2 = text.lastIndexOf('о');        //// Индекс последниего вхождения
//        for (int i = 0; i < text.length(); i++) {
//            x = text.charAt(i);                     //// Индекс позиции
//            if (x == 'o' && i != pos1 && i != pos2) {
//                x = 'О';
//            }
//            text2 += x;
//        }
//        System.out.println("Исходная строка -> " + text);
//        System.out.println("Результирующая -> " + text2);


//       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        substring()— это метод, который позволяет взять часть строки, начиная с одного индекса и заканчивая другим. ///////
//       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        В Java метод indexOf используется для поиска позиции (индекса) первого вхождения подстроки или символа в строке. //
//        Если подстрока или символ не найдены, метод возвращает -1.                                                       //
//       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Метод lastIndexOf в Java используется для поиска индекса последнего вхождения символа или подстроки в строке.    //
//        Если символ или подстрока не найдены, метод возвращает -1.                                                       //
//       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Метод replace в Java используется для замены символов или подстрок в строке на другие символы или подстроки.     //
//        Это полезно, когда нужно изменить текст, например, заменить одно слово на другое или убрать ненужные символы.    //
//       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         equals используется для сравнения объектов на равенство.                                                 //
//         Он определяет, равны ли два объекта по содержимому,                                                      //
//         а не по ссылке (то есть, не по тому, указывают ли они на одно и то же место в памяти).                   //
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         equalsIgnoreCase – сравнивает данную строку с другой строкой, игнорируя регистр.                         //
//         Две строки считаются равными,                                                                            //
//         если они имеют одинаковую длину и соответствующие символы у двух строк равны, игнорируя регистр букв.    //                                                          //
//        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


//        String line = "Замените в этой строке все появления буквы 'o' на букву 'О', кроме первого и последнего вхождения";
//        String a = line.substring(0,line.indexOf("о")+1);
//        //System.out.println(a);
//        String b = line.substring(line.indexOf("о")+1,line.lastIndexOf("о"));
//        //System.out.println(b);
//        String c = line.substring(line.lastIndexOf("о"));
//        //System.out.println(c);
//        System.out.println(a +b.replace("о","О") + c);

////        int a = 5;
////        int b = 5;
//        String a = "Hello";
//        String b = "Hello";
//        String c = "Good-bye";
//        String d = "HELLO";
//        System.out.println(a + " == " + b + " -> " + a.equals(b));
//        System.out.println(a + " == " + c + " -> " + a.equals(c));
//        System.out.println(a + " == " + d + " -> " + a.equals(d));
//        System.out.println(a + " == " + d + " -> " + a.equalsIgnoreCase(d));


//        System.out.println("I learning Java".endsWith("Java"));
//        System.out.println("I learning Java".startsWith("I"));
//        System.out.println("I learning Java".contains("ing"));

//        System.out.print("Введите название документа: ");
//        String pach = input.nextLine();
//
//        if(pach.endsWith(".jpg") || pach.endsWith(".jpeg") || pach.endsWith(".png"))
//            System.out.println("Это изображение");
//        else if (pach.endsWith(".html"))
//            System.out.println("Это HTML - страница");
//        else if (pach.endsWith(".doc") || pach.endsWith(".docx"))
//            System.out.println("Это документ Word");
//        else
//            System.out.println("Неизвестный формат");

//        String s = "I learning Java";
////        String s = "АЯаяЁё";
//        int n;
////        n = s.codePointAt(0);
////        System.out.println(n);
////        n = s.codePointAt(1);
////        System.out.println(n);
////        n = s.codePointAt(2);
////        System.out.println(n);
////        n = s.codePointAt(3);
////        System.out.println(n);
////        n = s.codePointAt(4);
////        System.out.println(n);
////        n = s.codePointAt(5);
////        System.out.println(n);
//
//        n = s.codePointAt(0);
//        System.out.println(n);
//        n = s.codePointAt(4);
//        System.out.println(n);
//        n = s.codePointBefore(3);
//        System.out.println(n);

//        String s;
//        double d = 3.8596;
//        s = String.valueOf(d);
//        System.out.println(s);

//        double d = 102939939.939;
//        boolean b = true;
//        long l = 1232874;
//        char[] arr = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё' };
//
//        System.out.println("Возвращаемое значение: " + String.valueOf(d));
//        System.out.println("Возвращаемое значение: " + String.valueOf(b));
//        System.out.println("Возвращаемое значение: " + String.valueOf(l));
//        System.out.println("Возвращаемое значение: " + String.valueOf(arr));

//        String str = "1";
//        System.out.println("1 > 5 : " + str.compareTo("5"));  // отрицательное число
//        System.out.println("1 == 5 : " + str.compareTo("1"));  // 0
//        str = "7";
//        System.out.println("7 > 5 : " + str.compareTo("5"));  // Положительное число

//        String str = "a";
//        System.out.println("a > d : " + str.compareTo("d"));  // отрицательное число
//        System.out.println("a == a : " + str.compareTo("a"));  // 0
//        str = "t";
//        System.out.println("7 > t : " + str.compareTo("d"));  // Положительное число

//        String str = "Привет";  // 1055 > 1087
//        System.out.println("Привет > привет : " + str.compareTo("привет"));  // отрицательное число
//        System.out.println("Привет > привет : " + str.compareToIgnoreCase("привет"));  // 0


        String str = "11 23 44 55 23 22";
        String str1 = "11";
        String change = "!!!";
        if (str.contains(str1)) {
            str = str.replace(str1, change);
            System.out.println(str);
        }else {
            System.out.println("Нет элементов для проверки");
        }


    }
}
