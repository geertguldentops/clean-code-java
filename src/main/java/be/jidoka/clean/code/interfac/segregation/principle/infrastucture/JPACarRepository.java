package be.jidoka.clean.code.interfac.segregation.principle.infrastucture;

import be.jidoka.clean.code.interfac.segregation.principle.domain.Car;
import be.jidoka.clean.code.interfac.segregation.principle.domain.CarQueryRepository;
import be.jidoka.clean.code.interfac.segregation.principle.domain.CarRepository;

import java.util.Set;

// Implementation interface using Spring Data
public interface JPACarRepository extends CarRepository, CarQueryRepository {

    @Override
    Car save(Car car);

    @Override
    Car getBy(Long id);

    @Override
    Set<Car> findAllBy(String owner);

}
