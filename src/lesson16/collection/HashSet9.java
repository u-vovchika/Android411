package lesson16.collection;

import java.util.*;

public class HashSet9 {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbers();
            checkDublicates(numbers);
        }catch (Dublicate_Number_Exception e){
            System.out.println("Ошибка. " + e.getMessage());
        }

    }

    public static List<Integer> readNumbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Кол-во чисел: ");
        int count = input.nextInt();

        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("-> ");
            int num = input.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void checkDublicates(List<Integer> numbers) throws Dublicate_Number_Exception{
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : numbers){
            if(uniqueNumbers.contains(num)){
                throw new Dublicate_Number_Exception("Обнаружен повторяющийся номер : " + num);
            }
            uniqueNumbers.add(num);
        }
    }

}

class Dublicate_Number_Exception extends Exception{
    public Dublicate_Number_Exception(String message){
        super(message);
    }
}