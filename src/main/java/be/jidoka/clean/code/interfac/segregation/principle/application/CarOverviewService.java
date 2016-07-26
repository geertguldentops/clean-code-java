package be.jidoka.clean.code.interfac.segregation.principle.application;

import be.jidoka.clean.code.interfac.segregation.principle.domain.Car;
import be.jidoka.clean.code.interfac.segregation.principle.domain.CarQueryRepository;

import java.util.Set;

public class CarOverviewService {

    private final CarQueryRepository carQueryRepository;

    public CarOverviewService(CarQueryRepository carQueryRepository) {
        this.carQueryRepository = carQueryRepository;
    }

    public Set<Car> showCars(String name) {
        // Doesn't compile! There is no save method on the carQueryRepository!
        // This is good since now we can't accidentally save a car while we are querying it.
        
        // carQueryRepository.save(car);

        return carQueryRepository.findAllBy(name);
    }

}
