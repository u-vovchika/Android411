package lesson9.numbers;

public class Numbers {
    public static int max(int a, int b, int c, int d) {
        int mx = a;
        if(b > mx) mx = b;
        if(c > mx) mx = c;
        if(d > mx) mx = d;
        return mx;
    }
    public static int min(int... num) {
        int mn = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]<mn){
                mn = num[i];
            }
        }
        return mn;
    }

    public static double average(int a, int b, int c, int d){
        return (a + b + c + d) /4.0;
    }
    public static int factorial(int n){
        int fact = 1 ;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }




}
