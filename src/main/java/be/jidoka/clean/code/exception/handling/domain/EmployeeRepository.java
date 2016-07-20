package be.jidoka.clean.code.exception.handling.domain;

public interface EmployeeRepository {

    // External service that may or may not produce nulls!
    Employee load(Integer employeeId);

}
