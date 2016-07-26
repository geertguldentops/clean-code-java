package be.jidoka.clean.code.interfac.segregation.principle.infrastucture;

import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.Car;
import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.CarRepository;

/**
 * Package private because client code does not need to know the implementation!
 */
class CarJPARepository implements CarRepository {

    // @PersistenceContext
    // private EntityManager entityManager;

    @Override
    public void save(Car car) {
        // entityManager.save(car);
    }

}
