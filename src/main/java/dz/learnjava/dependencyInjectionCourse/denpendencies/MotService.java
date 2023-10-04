package dz.learnjava.dependencyInjectionCourse.denpendencies;

// @Component
public class MotService {

    private EmailService emailService;

    // @Autowired
    public MotService(EmailService emailService) {
        this.emailService = emailService;
    }
}
