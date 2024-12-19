package lesson9;

public class Sample {
    public static void main(String[] args) {
        Outer out = new Outer("Внешний");
        System.out.println(out.name);
       // Outer.Inner in = new Outer.Inner("Внутренний")
        System.out.println(out.inner.innerName);
        System.out.println(Outer.Inner.age);
        Outer.Inner.info();
        out.inner.func();

    }
}

class Outer{
    String name;
    Inner inner;

    public Outer(String name) {
        this.name = name;
        inner = new Inner("Внутренний");
    }


    class Inner {
        static  int age;
        String innerName;

        static {
            age = 18;
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public static void  info(){
            System.out.println("Статический метод");
        }

        public void func(){

            System.out.println("Метод во вложеном классе");
        }
    }
}
