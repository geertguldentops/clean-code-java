package be.jidoka.clean.code.exception.handling.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test
    void shouldAlwaysReturnFalse_onIsNullable() {
        var employee = new Employee(1L, "Joske", "Vermeulen", Function.CONSULTANT, LocalDate.of(2014, 6, 21));

        assertThat(employee.isNull()).isFalse();
    }

    @Test
    void shouldCreateEmployee_onNewEmployee() {
        var employee = new Employee(1L, "Joske", "Vermeulen", Function.CONSULTANT, LocalDate.of(2014, 6, 21));

        assertThat(employee.getId()).isEqualTo(1L);
        assertThat(employee.getFirstName()).isEqualTo("Joske");
        assertThat(employee.getLastName()).isEqualTo("Vermeulen");
        assertThat(employee.getFunction()).isEqualTo(Function.CONSULTANT);
        assertThat(employee.getHiringDate()).isEqualTo(LocalDate.of(2014, 6, 21));
    }

    @Test
    void shouldReturn3000O_oCalculateWager_withEmployeeWasHired3YearsAgo() {
        var employee = new Employee(1L, "Joske", "Vermeulen", Function.CONSULTANT, LocalDate.now().minusYears(3));

        assertThat(employee.calculateWager()).isEqualTo(3_000);
    }

}