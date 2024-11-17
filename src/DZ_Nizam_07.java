
public class DZ_Nizam_07 {
    public static void main(String[] args) {
//        int p = 1;
//        int sdvig = 12;
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < sdvig; j++) {
//                System.out.print(" ");
//            }
//            sdvig -= 2;
//            for (int j = 0; j < (p); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            p += 2;
//    }

        int mas[] = {
                0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0,
                0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0,
                0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        };
        for (int j = 0; j < mas.length; j++) {
            if(j % 13 == 0) System.out.println();
            if (mas[j] == 0) System.out.print("  ");
            if (mas[j] == 1) System.out.print("* ");
        }


    }
}
