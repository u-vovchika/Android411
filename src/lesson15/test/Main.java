package lesson15.test;

interface CalcInterface{  // функциональный интерфейс
    int calculate(int a,int b);
}

//class Calc implements CalcInterface {
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}

public class Main {
    public static void main(String[] args) {

        int x = 5, y = 3;
//        CalcInterface sum = new Calc();
        CalcInterface sum = (a, b) -> (a + b);  // Лямбда выражение
        CalcInterface sab = (a, b) -> (a - b);  // Лямбда выражение
        CalcInterface mul = (a, b) -> (a * b);  // Лямбда выражение
//        CalcInterface sum = new CalcInterface() {
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a + b);
//            }
//        };
        int res = sum.calculate(x, y);
        int res2 = sab.calculate(x, y);
        int res3 = mul.calculate(x, y);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }
}




//public class Main {
//    public static void main(String[] args) {
//
//        int x = 5, y = 3;
//        Calc sum = new Calc();
//        sum.calculate(x, y);
////        CalcElse mul = new CalcElse();
////        mul.calculate(x, y);
//        Calc mul = new Calc() {
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a * b);
//            }
//        };
//        mul.calculate(x, y);
//    }
//}

//class Calc {
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}
//
////class CalcElse extends Calc {
////    @Override
////    public void calculate(int a, int b) {
////        System.out.println(a * b);
////    }
////}
