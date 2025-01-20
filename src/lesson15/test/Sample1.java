package lesson15.test;

interface Printable{
    //void print(String st);
    void print();
}


public class Sample1 {
    public static void main(String[] args) {
        //Printable printable = s -> System.out.println(s);  // s - один параметр. Можно круглые скобки не ставить
        Printable printable = () -> System.out.println("Hello, Java!");
        printable.print();
    }
}
