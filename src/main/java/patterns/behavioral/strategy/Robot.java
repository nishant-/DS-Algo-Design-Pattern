package patterns.behavioral.strategy;

public class Robot {

    private RobotMoveStrategy robotMoveStrategy;

    public Robot(RobotMoveStrategy robotMoveStrategy) {
        this.robotMoveStrategy = robotMoveStrategy;
    }

    public void move() {
        System.out.println("moving with " + robotMoveStrategy.strategy() + " strategy");
    }

    public void setRobotMoveStrategy(RobotMoveStrategy robotMoveStrategy) {
        this.robotMoveStrategy = robotMoveStrategy;
    }

    public RobotMoveStrategy getRobotMoveStrategy() {
        return robotMoveStrategy;
    }
}
