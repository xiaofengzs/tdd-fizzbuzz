package cn.xpbootcamp.fizzbuzz;

public class Game {
    public String playGame(int number) {
        String result = "";
        if(number % 3 == 0)
            result += "Fizz";
        if(number % 5 ==0)
            result += "Buzz";
        if(number % 7 ==0)
            result += "Whizz";
        return result;
    }
}
