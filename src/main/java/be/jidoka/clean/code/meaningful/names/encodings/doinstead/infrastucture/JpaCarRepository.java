package be.jidoka.clean.code.meaningful.names.encodings.doinstead.infrastucture;

import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.Car;
import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.CarRepository;

public class JpaCarRepository implements CarRepository {

    @Override
    public void save(Car car) {
        // Implementation depends on JPA to save a Car into a relational database...
    }

}
