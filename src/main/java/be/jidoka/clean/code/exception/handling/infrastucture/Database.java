package be.jidoka.clean.code.exception.handling.infrastucture;

import be.jidoka.clean.code.exception.handling.domain.Employee;

public interface Database {

	// External service that may or may not produce nulls!
	Employee queryByPrimaryKey(Integer employeeId);

}
