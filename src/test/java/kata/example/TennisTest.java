package kata.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {

    @Test
    void shouldReturnLoveLove_OnStart() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(0, 0)).isEqualTo("Love-Love");

    }
    @Test
    void testPlayerOneScoresOnce_ShouldBeFifteenLove() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(1, 0)).isEqualTo("Fifteen-Love");

    }

    @Test
    void testPlayerTwoScoresOnce_ShouldBeLoveFifteen() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(0, 1)).isEqualTo("Love-Fifteen");

    } ///paso este test sin empezarlo, por el switch que he metido

    @Test
    void testBothPlayersScoreOnce_ShouldBeFifteenAll() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(1, 1)).isEqualTo("FifteenAll");

    }
}
