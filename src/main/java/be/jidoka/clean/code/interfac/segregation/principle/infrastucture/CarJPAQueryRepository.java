package be.jidoka.clean.code.interfac.segregation.principle.infrastucture;

import be.jidoka.clean.code.interfac.segregation.principle.domain.Car;
import be.jidoka.clean.code.interfac.segregation.principle.domain.CarQueryRepository;

import java.util.Collections;
import java.util.Set;

/**
 * Package private because client code does not need to know the implementation!
 */
class CarJPAQueryRepository implements CarQueryRepository {

    // @PersistenceContext
    // private EntityManager entityManager;

    @Override
    public Car findBy(Long Id) {
//        return entityManager.load(id);
        return null;
    }

    @Override
    public Set<Car> findAllBy(String owner) {
        // return entity.query(...);
        return Collections.emptySet();
    }

}
