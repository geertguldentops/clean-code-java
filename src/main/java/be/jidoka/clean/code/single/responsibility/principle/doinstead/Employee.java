package be.jidoka.clean.code.single.responsibility.principle.doinstead;

public class Employee {

    private final EmployeePolicy employeePolicy;
    private final EmployeeGateway employeeGateway;
    private final EmployeeReporter employeeReporter;

    public Employee(EmployeePolicy employeePolicy,
                    EmployeeGateway employeeGateway,
                    EmployeeReporter employeeReporter) {
        this.employeePolicy = employeePolicy;
        this.employeeGateway = employeeGateway;
        this.employeeReporter = employeeReporter;
    }

    public double calculatePay() {
        return employeePolicy.calculatePay();
    }

    public void save() {
        employeeGateway.save();
    }

    public String describeEmployee() {
        return employeeReporter.describeEmployee();
    }
}
