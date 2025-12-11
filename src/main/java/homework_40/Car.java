package homework_40;

import lombok.Getter;

@Getter
public class Car {

    private final int yearOfManufacture;
    private final double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{year=" + yearOfManufacture +
                ", engine=" + engineCapacity +
                '}';
    }
}
