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
}