package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToSixThenTwelwe() {
        int start = 1;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testFirstMetod() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}