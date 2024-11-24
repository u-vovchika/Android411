package Lesson6;

public class DZ_Nizam_16 {
    public static void main(String[] args) {


        //String str = "лидер Венере не вредил";
        //String str = "Могу добавить";
        String str = "лазер резал";
        System.out.print(str + ": ");
        str = str.replaceAll("\\s", "");
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            str1 += str.charAt(i);
        }
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
