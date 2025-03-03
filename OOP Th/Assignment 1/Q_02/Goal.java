package Q_02;

public class Goal {
    private int x;
    private int y;

    boolean isGoalReached(int ballX, int ballY) {
        return (this.x == ballX && this.y == ballY);
    }
}