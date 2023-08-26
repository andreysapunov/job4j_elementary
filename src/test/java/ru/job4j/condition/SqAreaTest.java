package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2dot25() {
        double p = 6;
        double k = 1;
        double expected = 2.25;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

    @Test
    void whenP9K6Square2dot47() {
        double p = 9;
        double k = 6;
        double expected = 2.47;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

    @Test
    void whenP4K3Square0dot75() {
        double p = 4;
        double k = 3;
        double expected = 0.75;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }
    }