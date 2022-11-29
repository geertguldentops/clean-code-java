package be.jidoka.clean.code.interfac.segregation.principle.domain;

import java.util.Set;

public interface CarQueryRepository {

    Car getBy(Long id);

    Set<Car> findAllBy(String owner);

}
