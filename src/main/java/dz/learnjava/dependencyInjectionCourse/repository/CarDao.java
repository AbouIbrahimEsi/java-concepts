package dz.learnjava.dependencyInjectionCourse.repository;

import dz.learnjava.dependencyInjectionCourse.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CarDao implements Dao<Car> {


    /**
     * For simplicity’s sake, the "cars" List acts like an in-memory database,
     * which is populated with a couple of User objects in the constructor.
     */
    private List<Car> cars = new ArrayList<>();

    public CarDao() {
        cars.add(new Car(1, "208", "Peageot", "Red"));
        cars.add(new Car(2, "Yaris", "Toyota", "Black"));
    }

    @Override
    public Optional<Car> get(long id) {
        return Optional.ofNullable(cars.get((int) id));
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void save(Car car) {
        cars.add(car);
    }

    @Override
    public void update(Car car, String[] params) {
        car.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        car.setColor(Objects.requireNonNull(
                params[1], "Color cannot be null"));
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }
}
