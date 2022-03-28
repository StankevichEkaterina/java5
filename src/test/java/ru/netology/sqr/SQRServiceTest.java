package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'from over number, before over number', 200, 300, 3",
            "'from equals number, before equals number', 10, 99, 0",
            "'from less number, before equals number', 0, 99, 0",
            "'from less number, before less number ', 0, 10, 0",
            "'from over number, before over number', 99, 100000, 90"})
    void ShouldSquaresOfNumbersInTheRange(String testName, int from, int before, long expected) {
        SQRService service = new SQRService();
        int actual = service.bruteForceOfNumbers(from, before);
        assertEquals(expected, actual);
    }
}