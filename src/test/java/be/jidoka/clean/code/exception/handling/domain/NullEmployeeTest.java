package be.jidoka.clean.code.exception.handling.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.fest.assertions.api.Assertions.assertThat;

public class NullEmployeeTest {

    @Test
    public void shouldAlwaysReturnTrueOnIsNullable() {
        final NullEmployee nullEmployee = new NullEmployee();

        assertThat(nullEmployee.isNull()).isTrue();
    }

    @Test
    public void shouldReturnNonNullDefaults() {
        final NullEmployee nullEmployee = new NullEmployee();

        assertThat(nullEmployee.getId()).isEqualTo(-1);
        assertThat(nullEmployee.getFirstName()).isEqualTo("Not available");
        assertThat(nullEmployee.getLastName()).isEqualTo("Not available");
        assertThat(nullEmployee.getFunction()).isEqualTo(Function.NO_FUNCTION);
        assertThat(nullEmployee.getHiringDate()).isEqualTo(LocalDate.MAX);

        assertThat(nullEmployee.calculateWager()).isEqualTo(0);
    }

}