package cn.xpbootcamp.fizzbuzz;

public class Game {
    public String playGame(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
