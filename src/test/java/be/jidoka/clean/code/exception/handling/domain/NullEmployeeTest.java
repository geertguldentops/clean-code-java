package be.jidoka.clean.code.exception.handling.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class NullEmployeeTest {

    @Test
    void shouldAlwaysReturnTrue_onIsNullable() {
        var nullEmployee = new NullEmployee();

        assertThat(nullEmployee.isNull()).isTrue();
    }

    @Test
    void shouldReturnNonNullDefaults_onBuildNullEmployee() {
        var nullEmployee = new NullEmployee();

        assertThat(nullEmployee.getId()).isEqualTo(-1);
        assertThat(nullEmployee.getFirstName()).isEqualTo("Not available");
        assertThat(nullEmployee.getLastName()).isEqualTo("Not available");
        assertThat(nullEmployee.getFunction()).isEqualTo(Function.NO_FUNCTION);
        assertThat(nullEmployee.getHiringDate()).isEqualTo(LocalDate.MAX);

        assertThat(nullEmployee.calculateWager()).isEqualTo(0);
    }

}