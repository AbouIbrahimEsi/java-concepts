package dz.learnjava.dependencyInjectionCourse;

import dz.learnjava.dependencyInjectionCourse.denpendencies.EmailService;
import dz.learnjava.dependencyInjectionCourse.denpendencies.MotService;
import dz.learnjava.dependencyInjectionCourse.repository.*;

//@Component
public class CarService {
    //private CarDao carDao = new CarDao(); // Don't use it never
    private CarDao carDao;
    private EmailService emailService;
    private MotService motService;

    // Injection in constructor level
    // @Autowired Or @Inject
    public CarService(CarDao carDao,
                      EmailService emailService,
                      MotService motService) {
        this.carDao = carDao;
        this.emailService = emailService;
        this.motService = motService;
    }






}
