package cn.xpbootcamp.fizzbuzz;

public class Game {

    public String play(int num) {
        String result = "";
        if(num % 3 == 0) {
            result += "Fizz";
        }
        return result.isEmpty() ? String.valueOf(num) : result;
    }
}
