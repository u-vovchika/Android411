package Lesson14.enams;

enum SpeedVehicle {
    CAR(65),
    TRUCK(55),
    AIRPLANE(600),
    TRAIN(70),
    BOAT(55);

    private final int speed;

    SpeedVehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

}

public class TransportVehicle {
    public static void main(String[] args) {
        System.out.println("С использованием enum выведите скорости транспортных средств:");
        System.out.println();
        System.out.println("Скорость самолета составляет 600 миль в час");
        System.out.println();
        System.out.println("Скорости транспортных средств:");
        for (SpeedVehicle speedVehicle : SpeedVehicle.values()) {
            System.out.println(speedVehicle.name() + " типичная скорость составляет " + speedVehicle.getSpeed() + "миль в час");
        }
    }
}
