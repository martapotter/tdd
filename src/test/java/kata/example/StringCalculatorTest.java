package kata.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @Test
    void shouldReturnZeroWhenInputIsEmpty() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("")).isEqualTo(0);
    }

    @Test
    void shouldReturnNumWhenInputIsOneNUm() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("1")).isEqualTo(1);
    }

    @Test
    void shouldReturnSumWithComma() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("1,1")).isEqualTo(2);
    }

    @Test
    void shouldReturnSumWithCommaMultNums() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("1,1,2")).isEqualTo(4);
    } //Pasa directamente


    @Test
    void shouldReturnSumWithN() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("1\n1")).isEqualTo(2);
    }

    @Test
    void shouldSupportDelimiters() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("//;\n1;1")).isEqualTo(2);
    }
}
