package patterns.behavioral.strategy;

public enum RoboStrategy {

    DEFENSIVE("Defensive"), AGGRESIVE("Aggressive"), LAZY("Lazy");

    private final String strategy;

    RoboStrategy(String strategy) {
        this.strategy  = strategy;
    }
}
