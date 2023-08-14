package baseball;

import util.BallResultEnum;

import java.util.Objects;

public class Ball {

    private int comBall;

    private int comLocation;

    public Ball(int comBall, int comLocation) {
        this.comBall = comBall;
        this.comLocation = comLocation;
    }

    public BallResultEnum play(int ball, int location) {

        if (equals(new Ball(ball, location))) {
            return BallResultEnum.strike;
        }

        if (ball == comBall && location != comLocation) {
            return BallResultEnum.ball;
        }

        return BallResultEnum.nothing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return comBall == ball.comBall && comLocation == ball.comLocation;
    }

}
