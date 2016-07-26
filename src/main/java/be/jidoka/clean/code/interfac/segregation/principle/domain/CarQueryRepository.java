package be.jidoka.clean.code.interfac.segregation.principle.domain;

import java.util.Set;

public interface CarQueryRepository {

    Car findBy(Long Id);

    Set<Car> findAllBy(String owner);

}
