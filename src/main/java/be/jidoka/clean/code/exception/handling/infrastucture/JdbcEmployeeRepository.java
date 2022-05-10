package be.jidoka.clean.code.exception.handling.infrastucture;

import be.jidoka.clean.code.exception.handling.domain.Employee;
import be.jidoka.clean.code.exception.handling.domain.EmployeeRepository;
import be.jidoka.clean.code.exception.handling.domain.MissingEmployee;

class JdbcEmployeeRepository implements EmployeeRepository {

	private final Database database;

	JdbcEmployeeRepository(Database database) {
		this.database = database;
	}

	@Override
	public Employee load(Integer employeeId) {
		// External service that may or may not produce nulls!
		var databaseEmployee = database.queryByPrimaryKey(employeeId);

		// Only exactly 1 null check for employee!
		if (databaseEmployee == null) {
			return new MissingEmployee();
		} else {
			return databaseEmployee;
		}
	}

}
