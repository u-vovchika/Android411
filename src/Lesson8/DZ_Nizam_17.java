package Lesson8;

public class DZ_Nizam_17 {
    public static void main(String[] args) {
        System.out.println("Удалите из строки повторяющиеся символы и все пробелы.");
        System.out.println();
        System.out.print("Исходная строка - ");
        StringBuilder sb = new StringBuilder("\" Текст с повторяющимися символами \"");
        StringBuilder duplicates = new StringBuilder(sb);
        System.out.println(sb);
        //System.out.println(duplicates);
        int n = 0;
        modifyStr(sb, duplicates," ", "");
        System.out.print("Измененная строка - ");
        System.out.println(sb);

    }

    public static StringBuilder modifyStr(StringBuilder stBuild,StringBuilder doubBuild, String oldStr, String newStr) {
        int pos, res;
        pos = stBuild.indexOf(oldStr);
        for (int i = 0; i < stBuild.length(); i++) {
            pos = stBuild.indexOf(oldStr);
            res = doubBuild.indexOf(oldStr);
            if (pos != -1 || res == pos ) {
                stBuild.deleteCharAt(pos);
            }
        }
        return stBuild;
    }


}
