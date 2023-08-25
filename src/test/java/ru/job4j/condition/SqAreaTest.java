package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        double p = 6;
        double k = 1;
        double expected= 2.25;
        double out = SqArea.square (p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }
    }