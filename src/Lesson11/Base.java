package Lesson11;

public class Base {
    public static void main(String[] args) {
        Manage obj1 = new Manage();
        System.out.print("Зарплата менеджера: ");
        printSalary(obj1);

        Secretary obj2 = new Secretary();
        System.out.print("Зарплата секретаря: ");
        printSalary(obj2);
    }

    public static void printSalary(Employee obj){
        System.out.println(obj.salary());
    }
}

class Employee{
    public static int base = 10000;

    public int salary(){
        return base;
    }
}

class Manage extends Employee{
    @Override
    public int salary() {
        return base + 20000;
    }
}
class Secretary extends Employee{
    @Override
    public int salary() {
        return super.salary() + 10000;
    }
}
