package patterns.behavioral.strategy;


/**
 *  The strategy pattern (also known as the policy pattern) is a
 *  behavioral software design pattern that enables selecting an algorithm at runtime.
 *  Instead of implementing a single algorithm directly,
 *  code receives run-time instructions as to which in a family of algorithms to use.
 *  (https://en.wikipedia.org/wiki/Strategy_pattern)
 *
 *  Various moving strategies can be selected at runtime.
 *
 */
public class App {

    public static void main(String[] args) {

        Robot bot = new Robot(() -> RoboStrategy.DEFENSIVE);
        bot.move();

        System.out.println("Updating strategy to Aggressive");
        bot.setRobotMoveStrategy(() -> RoboStrategy.AGGRESIVE);
        bot.move();

        System.out.println("Updating strategy to Lazy");
        bot.setRobotMoveStrategy(() -> RoboStrategy.LAZY);
        bot.move();
    }

}
