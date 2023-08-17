package baseball;

import java.util.Objects;

public class Ball {

    private final BallNumber ball;

    private final int position;

    public Ball(int ball, int position) {
        this.ball = new BallNumber(ball);
        this.position = position;
    }

    public BallResultEnum play(Ball userBall) {

        if (this.equals(userBall)) {
            return BallResultEnum.STRIKE;
        }

        if (ball.equals(userBall.ball)) {
            return BallResultEnum.BALL;
        }

        return BallResultEnum.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball1 = (Ball) o;
        return position == ball1.position && Objects.equals(ball, ball1.ball);
    }

}
