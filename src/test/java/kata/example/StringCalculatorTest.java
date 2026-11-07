package kata.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @Test
    void shouldReturnZeroWhenInputIsEmpty() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.add("")).isEqualTo(0);
    }

}
