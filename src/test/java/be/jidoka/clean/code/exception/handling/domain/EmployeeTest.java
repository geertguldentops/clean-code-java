package be.jidoka.clean.code.exception.handling.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test
    void create_employee() {
        var employee = new Employee(2L, "Véronique", "Vervaert", Function.CTO, LocalDate.of(2014, 6, 21));

        assertThat(employee.getId()).isEqualTo(2L);
        assertThat(employee.getFirstName()).isEqualTo("Véronique");
        assertThat(employee.getLastName()).isEqualTo("Vervaert");
        assertThat(employee.getFunction()).isEqualTo(Function.CTO);
        assertThat(employee.getHiringDate()).isEqualTo(LocalDate.of(2014, 6, 21));
    }

    @Test
    void calculate_wager_for_employee_of_3_years() {
        var _3yearsAgo = LocalDate.now().minusYears(3);
        var employee = new Employee(3L, "John", "Doe", Function.CONSULTANT, _3yearsAgo);

        assertThat(employee.calculateWager()).isEqualTo(3_000);
    }

}