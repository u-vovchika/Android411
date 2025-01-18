package Lesson14.enams.excrption;

public class Test2 {
    public static void main(String[] args) {
        int number[] = {4, 8, 16, 32, 64, 128};
        int denominator[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + denominator[i] + " = " + number[i] / denominator[i]);
            } catch (ArithmeticException e){
                System.out.println("На 0 делить нельзя");
            }

        }
    }
}
