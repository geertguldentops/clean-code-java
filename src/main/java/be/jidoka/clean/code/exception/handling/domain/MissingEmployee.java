package be.jidoka.clean.code.exception.handling.domain;

import java.time.LocalDate;

// Not necessarily the best design to extend from a "real" employee.
// Null Object/Special case can also be implemented with an Abstract base class or interface!
public class MissingEmployee extends Employee {

    public MissingEmployee() {
        // Use reasonable defaults here --> reasonable depends on the domain!
        super(-1L, "Not available", "Not available", Function.NO_FUNCTION, LocalDate.MAX);
    }

    @Override
    public int calculateWager() {
        return 0;
    }

}
