package be.jidoka.clean.code.meaningful.names.encodings.doinstead.infrastucture;

import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.Car;
import be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain.CarRepository;

public class MongoCarRepository implements CarRepository {

    @Override
    public void save(Car car) {
        // Implementation that saves a Car into a mongo database...
    }

}
