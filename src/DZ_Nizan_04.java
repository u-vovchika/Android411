import java.util.Scanner;

public class DZ_Nizan_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int penny;
        System.out.print("Введите число от 1 до 99: ");
        penny = input.nextInt();
        if (penny >= 1 && penny <= 99) {
            System.out.print(penny);
            if((penny % 10) == 1 && (penny) != 11 )  System.out.print(" Копейка");
            else if(penny >= 5 && penny  <= 20)  System.out.print(" Копеек");
            else if((penny % 10) >= 2 && (penny % 10) <= 4 )  System.out.print(" Копейки");
            else if((penny % 10) >= 5 && (penny % 10) <= 9  || (penny % 10) == 0)  System.out.print(" Копеек");
        } else {
            if (penny < 1)
                System.out.print("Число не может быть меньше 1 ");
            if (penny > 99)
                System.out.print("Число не может быть больше 99 ");
            System.out.print("по заданию.");
        }
    }

}
