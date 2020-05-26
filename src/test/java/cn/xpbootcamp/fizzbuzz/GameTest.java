package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void should_say_number_given_a_number_when_play() {
        Game game = new Game();

        String got = game.play(1);

        assertEquals("1", got);
    }

    @Test
    void should_say_Fizz_given_a_number_is_multiple_of_three_when_play() {
        Game game = new Game();

        String got = game.play(3);

        assertEquals("Fizz", got);
    }

    @Test
    void should_say_Buzz_given_a_number_is_multiple_of_five_when_play() {
        Game game = new Game();

        String got = game.play(5);

        assertEquals("Buzz", got);
    }

    @Test
    void should_say_Whizz_given_a_number_is_multiple_of_seven_when_play() {
        Game game = new Game();

        String got = game.play(7);

        assertEquals("Whizz", got);
    }

    @Test
    void should_say_FizzBuzz_given_a_number_is_multiple_of_three_and_five_when_play() {
        Game game = new Game();

        String got = game.play(15);

        assertEquals("FizzBuzz", got);
    }

    @Test
    void should_say_FizzWhizz_given_a_number_is_multiple_of_three_and_seven_when_play() {
        Game game = new Game();

        String got = game.play(21);

        assertEquals("FizzWhizz", got);
    }

    @Test
    void should_say_BuzzWhizz_given_a_number_is_multiple_of_five_and_seven_when_play() {
        Game game = new Game();

        String got = game.play(35);

        assertEquals("BuzzWhizz", got);
    }

    @Test
    void should_say_FizzBuzzWhizz_given_a_number_is_multiple_of_three_and_five_and_seven_when_play() {
        Game game = new Game();

        String got = game.play(105);

        assertEquals("FizzBuzzWhizz", got);
    }
}
