package be.jidoka.clean.code.single.responsibility.principle.doinstead;

public class Employee {

	private final EmployeePolicy employeePolicy;
	private final EmployeeDatabaseGateway employeeDatabaseGateway;
	private final EmployeeReporter employeeReporter;

	public Employee(EmployeePolicy employeePolicy,
	                EmployeeDatabaseGateway employeeDatabaseGateway,
	                EmployeeReporter employeeReporter) {
		this.employeePolicy = employeePolicy;
		this.employeeDatabaseGateway = employeeDatabaseGateway;
		this.employeeReporter = employeeReporter;
	}

	public double calculatePay() {
		return employeePolicy.calculatePay();
	}

	public void save() {
		employeeDatabaseGateway.save();
	}

	public String describeEmployee() {
		return employeeReporter.describeEmployee();
	}

}
