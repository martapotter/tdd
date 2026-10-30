package kata.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {

    @Test
    void shouldReturnLoveLove_OnStart() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(0, 0)).isEqualTo("LoveLove");

    }



}
