import java.util.Scanner;
public class DZ_Nizam_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Количество символов: ");
        n = input.nextInt();
        String s;
        System.out.print("Тип символа: ");
        s = input.next();
        int orient;
        orient = input.nextInt();
        if (orient == 0) {
            System.out.print("Ориентация линии " + orient + " - горизонтальная");
        }
        else if (orient == 1) {
            System.out.print("Ориентация линии " + orient + " - вертикальная");
        }
        else{
            System.out.print("Нажмите 0 или 1");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (orient == 0){
                System.out.print(s+" ");
            }
            if (orient == 1){
                System.out.println(s);
            }
        }
    }
}
