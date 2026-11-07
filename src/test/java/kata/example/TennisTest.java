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
        assertThat(tennis.score(1, 1)).isEqualTo("Fifteen-All");

    }

    @Test
    void testPlayerOneScoresTwice_ShouldBeThirtyLove() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(2, 0)).isEqualTo("Thirty-Love");
    } ///tambien lo paso por defecto

    @Test
    void testPlayerTwoScoresTwice_ShouldBeLoveThirty() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(0, 2)).isEqualTo("Love-Thirty");
    }

    @Test
    void testScoreIsFortyAll_ShouldBeDeuce() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(3, 3)).isEqualTo("Deuce");
    }

    @Test
    void testPlayerOneAdvantageAfterDeuce_ShouldBeAdvantagePlayerOne() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(4, 3)).isEqualTo("Advantage Player 1");
    }

    @Test
    void testPlayerTwoAdvantageAfterDeuce_ShouldBeAdvantagePlayerTwo() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(3, 4)).isEqualTo("Advantage Player 2");
    }

    @Test
    void testPlayerOneWinsAfterAdvantage_ShouldBeWinPlayerOne() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(5, 3)).isEqualTo("Player 1 wins");
    }

    @Test
    void testPlayerTwoWinsAfterAdvantage_ShouldBeWinPlayerTwo() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(3, 5)).isEqualTo("Player 2 wins");
    }

    @Test
    void testPlayerOneWinsByTwoPoints_ShouldBeWinPlayerOne() {
        Tennis tennis = new Tennis();
        assertThat(tennis.score(4, 0)).isEqualTo("Player 1 wins");
    }
}
