import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {

    private final int sum = 3_000_000;
    private final double rate = 13.9;
    private final int loanPeriod = 60;

    @Test
    @DisplayName("Проверка ежемесячного платежа")
    void testSumPerMonth(){
        int expected = 69_649;
        int actual = CreditCalculator.sumPerMonth(sum, rate, loanPeriod);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка полной суммы возврата")
    void testFullSumReturn(){
        int expected = 4_178_959;
        int actual = CreditCalculator.fullSumReturn(sum, rate, loanPeriod);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка суммы переплаты")
    void testOverPaySum(){
        int expected = 1_178_959;
        int actual = CreditCalculator.overPaySum(sum, rate, loanPeriod);
        Assertions.assertEquals(expected, actual);
    }
}
