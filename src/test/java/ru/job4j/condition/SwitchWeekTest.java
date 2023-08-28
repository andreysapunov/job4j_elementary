package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void nameOfDay1itMonday() {
    int day = 1;
    String excepted = "Понедельник";
    String out = SwitchWeek.nameOfDay(day);
    assertThat(out).isEqualTo(excepted);
    }

    @Test
    void nameOfDay6itSaturday() {
        int day = 3;
        String excepted = "Суббота";
        String out = SwitchWeek.nameOfDay(day);
        assertThat(out).isEqualTo(excepted);
    }
}