package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;

    public Balls(List<Integer> list) {
        this.balls = makeBall(list);
    }

    public List<Ball> makeBall(List<Integer> comBalls) {

        List<Ball> ballList = new ArrayList<>();

        for (int i = 0; i < comBalls.size(); i++) {
            ballList.add(new Ball(comBalls.get(i), i+1));
        }

        return ballList;
    }

    public BallResultEnum play(Ball userBall) {
        return balls.stream()
                .map(ball -> ball.play(userBall))
                .filter(BallResultEnum::isNotNothing)
                .findFirst()
                .orElse(BallResultEnum.NOTHING);
    }
}
