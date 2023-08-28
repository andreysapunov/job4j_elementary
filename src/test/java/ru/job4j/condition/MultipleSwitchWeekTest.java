package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void number3OfDayWednesday() {
        String name = "Среда";
        String excepted = "3";
        String out = MultipleSwitchWeek.numberOfDay(name);
        assertThat(out).isEqualTo(excepted);
    }
}