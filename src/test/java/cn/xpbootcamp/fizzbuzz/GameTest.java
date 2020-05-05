package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void should_return_Fizz_when_input_multiple_of_3() {
        String got = game.playGame(6);

        assertEquals(got, "Fizz");
    }

    @Test
    void should_return_Buzz_when_input_multiple_of_5() {
        String got = game.playGame(10);

        assertEquals(got, "Buzz");
    }

    @Test
    void should_return_Whizz_when_input_multiple_of_7() {
        String got = game.playGame(14);

        assertEquals(got, "Whizz");
    }

    @Test
    void should_return_FizzBuzz_when_input_multiple_of_3_and_5() {
        String got = game.playGame(15);

        assertEquals(got, "FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_when_input_multiple_of_3_and_7() {
        String got = game.playGame(21);

        assertEquals(got, "FizzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_when_input_multiple_of_5_and_7() {
        String got = game.playGame(35);

        assertEquals(got, "BuzzWhizz");
    }

    @Test
    void should_return_FizzBuzzWhizz_when_input_multiple_of_3_and_5_and_7() {
        String got = game.playGame(105);

        assertEquals(got, "FizzBuzzWhizz");
    }
}
