package be.jidoka.clean.code.exception.handling.application;

import be.jidoka.clean.code.exception.handling.domain.Employee;
import be.jidoka.clean.code.exception.handling.domain.EmployeeRepository;
import be.jidoka.clean.code.exception.handling.domain.NullEmployee;
import be.jidoka.clean.code.exception.handling.infrastucture.EmployeeReporter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeReporter employeeReporter;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeReporter employeeReporter) {
        this.employeeRepository = employeeRepository;
        this.employeeReporter = employeeReporter;
    }

    public void reportOnEmployeeWagers(List<Integer> employeeIds) {
        // All of the employees in this List are non-null!
        final List<Employee> employees = loadEmployees(employeeIds);
        reportOnWagersOf(employees);
    }

    private List<Employee> loadEmployees(List<Integer> employeeIds) {
        final List<Employee> employees = new ArrayList<>();

        // Obtain the Employees from some external source e.g. a database.
        for (Integer employeeId : employeeIds) {
            employees.add(loadEmployee(employeeId));
        }

        return employees;
    }

    private Employee loadEmployee(Integer employeeId) {
        // External service that may or may not produce nulls!
        final Employee loadedEmployee = employeeRepository.load(employeeId);

        // Ugly work-around for an external service returning nulls!
        if (loadedEmployee == null) {
            return new NullEmployee();
        } else {
            return loadedEmployee;
        }
    }

    private void reportOnWagersOf(List<Employee> employees) {
        for (Employee employee : employees) {
            reportOnWagerOf(employee);
        }
    }

    private void reportOnWagerOf(Employee employee) {
        // No need to check for null Employee objects and can safely call methods on it.
        final int employeeWager = employee.calculateWager();
        final String employeeFirstName = employee.getFirstName();
        final String employeeLastName = employee.getLastName();

        // Call some external reporting service that generates a PDF document.
        employeeReporter.generatePDFReportFor(employeeFirstName, employeeLastName, employeeWager);

        logNullEmployees(employee);
    }

    private void logNullEmployees(Employee employee) {
        // (Optional) check if an employee is actually a NullEmployee:
        if (employee.isNull()) {
            // LOGGER.info("Null employee detected" + employee);
        }
    }

}
