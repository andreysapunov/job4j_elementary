package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
    double expected = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = 2;
    int y2 = 0;
    double out = Point.distance(x1, y1, x2, y2);
    assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when63to12then509() {
        double expected = 5.09;
        int x1 = 6;
        int y1 = 3;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to26then223() {
        double expected = 2.23;
        int x1 = 1;
        int y1 = 8;
        int x2 = 2;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when23to72then509() {
        double expected = 5.09;
        int x1 = 2;
        int y1 = 3;
        int x2 = 7;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}