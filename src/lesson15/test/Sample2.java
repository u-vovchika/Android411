package lesson15.test;

interface Calc {
    int calculate(int x, int y);
}

public class Sample2 {
//    static int x = 10;
//    static int y = 20;

    public static void main(String[] args) {
        Calc operation = (int a,int b) -> {
            if(b == 0){
                return 0;
            }else{
                return a / b;
            }
        };
        System.out.println(operation.calculate(20,10));
        System.out.println(operation.calculate(20,0));

//        int x = 10;
//        int y = 20;
//        Calc operation = () -> {
//            //x = 30;
//            return x + y;
//        };
//        System.out.println(x);
//        System.out.println(operation.calculate());
    }
}
