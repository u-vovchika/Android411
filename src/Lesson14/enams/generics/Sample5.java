package Lesson14.enams.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers);
        System.out.println(reverseList(numbers));

        ArrayList<String> colors =new ArrayList<>(Arrays.asList("Red","Green","Orange"));
        System.out.println(colors);
        System.out.println(reverseList(colors));
    }
        public static <T> ArrayList<T> reverseList(ArrayList<T> originalList) {
            ArrayList<T> newArray = new ArrayList<>();
            for (int i = originalList.size() - 1; i >= 0; i--) {
                newArray.add(originalList.get(i)); // newArray = originalList[i]
            }
            return newArray;
        }


}

