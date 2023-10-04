package dz.learnjava.dependencyInjectionCourse.repository;

//public class JpaCarDao implements Dao<Car> {

//    private EntityManager entityManager;
//
//    // standard constructors
//
//    @Override
//    public Optional<Car> get(long id) {
//        return Optional.ofNullable(entityManager.find(Car.class, id));
//    }
//
//    @Override
//    public List<Car> getAll() {
//        Query query = entityManager.createQuery("SELECT e FROM Car e");
//        return query.getResultList();
//    }
//
//    @Override
//    public void save(Car car) {
//        executeInsideTransaction(entityManager -> entityManager.persist(car));
//    }
//
//    @Override
//    public void update(Car car, String[] params) {
//        car.setName(Objects.requireNonNull(params[0], "Name cannot be null"));
//        car.setModel(Objects.requireNonNull(params[1], "Model cannot be null"));
//        executeInsideTransaction(entityManager -> entityManager.merge(car));
//    }
//
//    @Override
//    public void delete(Car car) {
//        executeInsideTransaction(entityManager -> entityManager.remove(car));
//    }
//
//    private void executeInsideTransaction(Consumer<EntityManager> action) {
//        EntityTransaction tx = entityManager.getTransaction();
//        try {
//            tx.begin();
//            action.accept(entityManager);
//            tx.commit();
//        }
//        catch (RuntimeException e) {
//            tx.rollback();
//            throw e;
//        }
//    }


//}
