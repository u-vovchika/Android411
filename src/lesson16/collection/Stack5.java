package lesson16.collection;

import java.util.Stack;

public class Stack5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Виктор");
        stack.push("Игорь");
        stack.push("Михаил");
        stack.push("Ирина");
        stack.add(3,"Катя");
        System.out.println(stack);
        stack.remove(2);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}