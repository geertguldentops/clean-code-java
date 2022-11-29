package be.jidoka.clean.code.interfac.segregation.principle.application;

import be.jidoka.clean.code.interfac.segregation.principle.domain.Car;
import be.jidoka.clean.code.interfac.segregation.principle.domain.CarRepository;

public class CarLeaseService {

    private final CarRepository carRepository;

    public CarLeaseService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // Starts-up a new transaction if non exist so far.
    // @Transactional
    public void save(Car car) {
        // Very easy to use interface, only 1 method!
        // Business logic related to leasing car
        carRepository.save(car);
    }

}
