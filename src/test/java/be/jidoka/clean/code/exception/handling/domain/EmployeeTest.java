package be.jidoka.clean.code.exception.handling.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void shouldAlwaysReturnFalseOnIsNullable() {
        final Employee employee = new Employee(1L, "Joske", "Vermeulen", Function.CONSULTANT, LocalDate.of(2014, 6, 21));

        assertThat(employee.isNull()).isFalse();
    }

    @Test
    public void shouldCreateEmployeeOnNewEmployee() {
        final Employee employee = new Employee(1L, "Joske", "Vermeulen", Function.CONSULTANT, LocalDate.of(2014, 6, 21));

        assertThat(employee.getId()).isEqualTo(1L);
        assertThat(employee.getFirstName()).isEqualTo("Joske");
        assertThat(employee.getLastName()).isEqualTo("Vermeulen");
        assertThat(employee.getFunction()).isEqualTo(Function.CONSULTANT);
        assertThat(employee.getHiringDate()).isEqualTo(LocalDate.of(2014, 6, 21));
    }

    @Test
    public void shouldReturn3000OnCalculateWagerForEmployeeWorkingFor2Years() {
        final Employee employee = new Employee(1L, "Joske", "Vermeulen", Function.CONSULTANT, LocalDate.of(2014, 6, 21));

        assertThat(employee.calculateWager()).isEqualTo(3_000);
    }

}