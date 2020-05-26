package cn.xpbootcamp.fizzbuzz;

public class Game {

    public String play(int num) {
        String result = "";
        if(num % 3 == 0) {
            result += "Fizz";
        }
        if(num % 5 == 0) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(num) : result;
    }
}
