package kata.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(3)).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(1)).isEqualTo("1");
    }


    @Test
    void shouldReturnFizzMult3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(18)).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(5)).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnBuzzMult5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(20)).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void shouldReturnFizzBuzzMult15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.execute(30)).isEqualTo("FizzBuzz");
    }


}