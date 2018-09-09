package be.jidoka.clean.code.exception.handling.domain;

import be.jidoka.clean.code.exception.handling.Nullable;

import java.time.LocalDate;
import java.time.Period;

// Having to implement a Nullable interface is not strictly necessary.
public class Employee implements Nullable {

    private static final int BASE_SALARY = 1_000;

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Function function;
    private final LocalDate hiringDate;

    public Employee(Long id, String firstName, String lastName, Function function, LocalDate hiringDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.function = function;
        this.hiringDate = hiringDate;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Function getFunction() {
        return function;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public int calculateWager() {
        return BASE_SALARY * calculateYearsInCompany();
    }

    private int calculateYearsInCompany() {
        return Period.between(hiringDate, LocalDate.now()).getYears();
    }

    @Override
    public boolean isNull() {
        return false;
    }

}
