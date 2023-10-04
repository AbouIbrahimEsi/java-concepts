package dz.learnjava.dependencyInjectionCourse;

import dz.learnjava.dependencyInjectionCourse.denpendencies.EmailService;
import dz.learnjava.dependencyInjectionCourse.denpendencies.MotService;
import dz.learnjava.dependencyInjectionCourse.model.Car;
import dz.learnjava.dependencyInjectionCourse.repository.*;


import java.util.Optional;

public class CarDemo {

    private static Dao<Car> carDao;

    public static void main(String[] args) {

        /**
         * Amigoscode example
         */

        // Dependencies
        CarDao carDao1 = new CarDao();
        EmailService emailService = new EmailService();
        MotService motService = new MotService(emailService);

        // Inject the dependencies
        CarService carService = new CarService(carDao1, emailService, motService);
        // When using DI annotations, No need to instantiate the dependencies as above


        //-------------------------------------------------------------------------------


        /**
         * Baeldung example
         */

        carDao = new CarDao();
        Car car1 = getCar(0);
        System.out.println(car1);
        carDao.update(car1, new String[]{"308", "Blue"});

        Car car2 = getCar(1);
        carDao.delete(car2);
        carDao.save(new Car(1, "208", "Peageot", "Red"));

        carDao.getAll().forEach(car -> System.out.println(car.getName()));
    }

    private static Car getCar(long id) {
        Optional<Car> car = carDao.get(id);

        return car.orElseGet(
                () -> new Car(5, "non-existing car", "no-model", "no-color"));
    }
}
