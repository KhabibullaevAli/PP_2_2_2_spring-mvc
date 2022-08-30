package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService {
    List<Car> cars;

    public CarServiseImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("Honda", 180, 200));
        cars.add(new Car("Ford", 170, 250));
        cars.add(new Car("Renault", 175, 240));
        cars.add(new Car("Opel", 160, 230));
        cars.add(new Car("Fiat", 165, 255));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 1 || count > 4) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
