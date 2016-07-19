package be.jidoka.clean.code.meaningful.names.encodings.avoid.infrastucture;

import be.jidoka.clean.code.meaningful.names.encodings.avoid.domain.Car;
import be.jidoka.clean.code.meaningful.names.encodings.avoid.domain.ICarRepository;

// If you really need to encode something than encode the class and NOT the interface! Or better yet...
public class CarRepository implements ICarRepository {

    @Override
    public void save(Car car) {
        // Implementation depends on JPA to save a Car into a relational database...
    }

}
