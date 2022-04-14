package pro.sky.skyprocalculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprocalculator.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.skyprocalculator.CalculatorTestConstants.*;


public class CalculatorParameterizedTests {

    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculationForTests")
    public void shouldGenerateCorrectResultOfSummable(int num1, int num2) {
        Assertions.assertEquals(num1 + num2, out.summable(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideCalculationForTests")
    public void shouldGenerateCorrectResultOfSubtract(int num1, int num2) {
        Assertions.assertEquals(num1 - num2, out.subtract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideCalculationForTests")
    public void shouldGenerateCorrectResultOfIncrease(int num1, int num2) {
        Assertions.assertEquals(num1 * num2, out.increase(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideCalculationForTests")
    public void shouldGenerateCorrectResultOfSplit(int num1, int num2) {
        Assertions.assertEquals(num1 / num2, out.split(num1, num2));
    }

    public static Stream<Arguments> provideCalculationForTests() {
        return Stream.of(
                Arguments.of(THREE, TWO),
                Arguments.of(FIVE, ONE),
                Arguments.of(TWO, TWO),
                Arguments.of(FIVE, ONE),
                Arguments.of(FOUR, TWO)
        );
    }
}



