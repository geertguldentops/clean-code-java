package be.jidoka.clean.code.meaningful.names.encodings.doinstead.infrastucture;

import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.Car;
import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.CarRepository;

// If you really need to encode something than encode the class and NOT the interface!
public class MongoCarRepository implements CarRepository {

    @Override
    public void save(Car car) {
        // Implementation depends on Spring to save a Car into a mongo (no-SQL) database...
    }

}
