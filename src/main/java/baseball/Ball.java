package baseball;

public class Ball {

    private int comBall;

    private int comPosition;

    public Ball(int comBall, int comPosition) {
        this.comBall = comBall;
        this.comPosition = comPosition;
    }

    public BallResultEnum play(int ball, int location) {

        if (equals(new Ball(ball, location))) {
            return BallResultEnum.STRIKE;
        }

        if (ball == comBall && location != comPosition) {
            return BallResultEnum.BALL;
        }

        return BallResultEnum.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return comBall == ball.comBall && comPosition == ball.comPosition;
    }

}
