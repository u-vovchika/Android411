package Lesson88.automobile;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** Данные автомобиля **********");
        Property prop1 = new Property (
                "",
                0,
                "",
                0,
                "",
                0);
        prop1.setModel("X7 M50i");
        prop1.setYear(2022);
        prop1.setManufacturer("BMW");
        prop1.setPower(530);
        prop1.setColor("white");
        prop1.setPrice(10790000);
        System.out.println("Название модели: " + prop1.getModel());
        System.out.println("Год выпуска: " + prop1.getYear());
        System.out.println("Производитель: " + prop1.getManufacturer());
        System.out.println("Мощность двигателя: " + prop1.getPower() + " л.с.");
        System.out.println("Цвет машины: " + prop1.getColor());
        System.out.println("Цена: " + prop1.getPrice());

    }
}
