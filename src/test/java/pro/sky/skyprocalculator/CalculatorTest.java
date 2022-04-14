package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculator.service.impl.CalculatorServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.skyprocalculator.CalculatorTestConstants.*;

public class CalculatorTest {

    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn5AfterAdding3And2() {
        assertEquals(FIVE, out.summable(THREE, TWO));
    }

    @Test
    public void shouldReturn5AfterAdding1And4() {
        assertEquals(FIVE, out.summable(ONE, FOUR));
    }

    @Test
    public void shouldReturn4AfterSubtract1From5() {
        assertEquals(FOUR, out.subtract(FIVE, ONE));
    }

    @Test
    public void shouldReturn3AfterSubtract0From3() {
        assertEquals(THREE, out.subtract(THREE, ZERO));
    }

    @Test
    public void shouldReturn4AfterIncrease2By2() {
        assertEquals(FOUR, out.increase(TWO, TWO));
    }

    @Test
    public void shouldReturn1AfterIncrease1By1() {
        assertEquals(ONE, out.increase(ONE, ONE));
    }

    @Test
    public void shouldReturn2AfterSplit4By2() {
        assertEquals(TWO, out.split(FOUR, TWO));
    }

    @Test
    public void shouldReturn3AfterSplit3By1() {
        assertEquals(THREE, out.split(THREE,ONE));
    }

    @Test
    public void shouldThrowZeroDivisionExceptionAfterSplitBy0() {
        assertThrows(ZeroDivisionException.class, () -> out.split(FIVE, ZERO));
    }
}
