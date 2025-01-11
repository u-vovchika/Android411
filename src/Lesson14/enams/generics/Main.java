package Lesson14.enams.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2,3,5,3,4};
        Double[] doubleArray = {3.3,2.2,1.1,4.4};
        Character[] charArray = {'G','e','n','e','r','i','c'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

    }

    public static <T> void printArray(T[] inputArray){
        for (T element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
