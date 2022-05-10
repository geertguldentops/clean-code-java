package be.jidoka.clean.code.exception.handling.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class MissingEmployeeTest {

	@Test
	void create_missing_employee() {
		var missingEmployee = new MissingEmployee();

		assertThat(missingEmployee.getId()).isEqualTo(-1);
		assertThat(missingEmployee.getFirstName()).isEqualTo("Not available");
		assertThat(missingEmployee.getLastName()).isEqualTo("Not available");
		assertThat(missingEmployee.getFunction()).isEqualTo(Function.NO_FUNCTION);
		assertThat(missingEmployee.getHiringDate()).isEqualTo(LocalDate.MAX);

		assertThat(missingEmployee.calculateWager()).isEqualTo(0);
	}

}