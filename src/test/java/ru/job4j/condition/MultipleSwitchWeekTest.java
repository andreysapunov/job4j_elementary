package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void number3OfDayWednesday() {
        String name = "Wednesday";
        int excepted = 3;
        int out = MultipleSwitchWeek.numberOfDay(name);
        assertThat(out).isEqualTo(excepted);
    }
}