package baseball;

import java.util.List;

public class Balls {

    private List<Integer> comBalls;

    public Balls(List<Integer> list) {
        this.comBalls = list;
    }

    public BallResultEnum play(int userBall, int position) {

        for (int i = 0; i < comBalls.size(); i++) {
            Ball ball = new Ball(comBalls.get(i), i+1);

            if (BallResultEnum.isStrike(ball.play(userBall, position))) {
                return BallResultEnum.STRIKE;
            }

            if (BallResultEnum.isBall(ball.play(userBall, position))) {
                return BallResultEnum.STRIKE;
            }
        }

        return BallResultEnum.NOTHING;
    }
}
