package common;


import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String[] args) {

        Stream<Integer> intStream = Stream.iterate(1 , x -> x + 1 ).limit(100);

        intStream.forEach(x -> {
            if(x % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(x % 5 == 0) {
                System.out.println("Buzz");
            }
            else if(x % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(x);
            }
        });

    }
}
