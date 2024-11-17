import java.util.Scanner;

public class DZ_Nizam_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Создайте закрашеный квадрат со стороной n");
        System.out.println();
        int n, m;
        System.out.print("n = ");
        n = input.nextInt();
        m = n * 2;
        square(n, m);
    }

    public static void square(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == (n - 1)) {
                    System.out.print("=");
                }
                if (i != 0 && i != (n - 1)) {
                    if (j == 0 || j == (m - 1)) {
                        System.out.print("=");
                    } else {
                        if (j % 2 == 0)
                            System.out.print("/");
                        else
                            System.out.print("\\");
                    }
                }
            }
            System.out.println();
        }
    }
}
