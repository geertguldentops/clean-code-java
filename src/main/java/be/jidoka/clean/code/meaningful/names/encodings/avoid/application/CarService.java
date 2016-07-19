package be.jidoka.clean.code.meaningful.names.encodings.avoid.application;

import be.jidoka.clean.code.meaningful.names.encodings.avoid.domain.Car;
import be.jidoka.clean.code.meaningful.names.encodings.avoid.domain.ICarRepository;

public class CarService {

    private final ICarRepository iCarRepository;

    public CarService(ICarRepository iCarRepository) {
        this.iCarRepository = iCarRepository;
    }

    public void createCar(Car car) {
        // Call important domain logic here.

        // Why do we need to know that ICarRepository is an interface?
        iCarRepository.save(car);
    }

}
