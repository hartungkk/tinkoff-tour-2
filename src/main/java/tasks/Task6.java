package tasks;

import java.util.stream.Stream;

public class Task6 {

    public static void main(String[] args) {

        Stream<String> fizzBuzz = Stream.iterate(1, i -> i + 1).limit(100)
                .map(i -> {
                    if (i % 15 == 0) return "fizzbuzz";
                    else if (i % 3 == 0) return "fizz";
                    else if (i % 5 == 0) return "buzz";
                    else return "" + i;
                });

        fizzBuzz.forEach(System.out::println);
    }
}
