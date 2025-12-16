package homework_40;

import java.util.*;

public class Main {
    public static void main() {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2005, 2.0));
        cars.add(new Car(2012, 1.6));
        cars.add(new Car(1999, 3.0));
        cars.add(new Car(2020, 1.8));


        cars.sort(Comparator.comparing(Car::getYearOfManufacture));

        System.out.println("Sorted by year:");
        System.out.println(cars);


        Set<Car> carSet = new TreeSet<>(Comparator.comparing(Car::getEngineCapacity));

        carSet.addAll(cars);

        System.out.println("TreeSet sorted by engine capacity:");
        System.out.println(carSet);
    }
}

