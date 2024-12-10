package Lesson88.automobile;

public class Property {
    private String model;
    private int year;
    private String manufacturer;
    private int power;
    private String color;
    private int price;

    public Property(String model,
                    int year,
                    String manufacturer,
                    int power,
                    String color,
                    int price) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.power = power;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1995 && year <= 2024)
            this.year = year;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0)
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
