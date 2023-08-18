package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Balls balls;

    @BeforeEach
    void beforeEach() {
        this.balls = new Balls(Arrays.asList(1,2,3));
    }

    @Test
    void balls로_현재공과위치값_NOTHING_테스트() {
        BallResultEnum ballResultEnum = balls.play(new Ball(4, 1));

        assertThat(ballResultEnum).isEqualTo(BallResultEnum.NOTHING);
    }

    @Test
    void balls로_현재공과위치값_BALL_테스트() {
        BallResultEnum ballResultEnum = balls.play(new Ball(1,2));

        assertThat(ballResultEnum).isEqualTo(BallResultEnum.BALL);
    }

    @Test
    void balls로_현재공과위치값_STRIKE_테스트() {
        BallResultEnum ballResultEnum = balls.play(new Ball(1,1));

        assertThat(ballResultEnum).isEqualTo(BallResultEnum.STRIKE);
    }

    @Test
    void 스트라이크1_볼2_테스트() {
        PlayResult playResult = balls.play(new Balls(Arrays.asList(1,3,2)));

        assertThat(playResult.strike).isEqualTo(1);
        assertThat(playResult.ball).isEqualTo(2);
    }

    @Test
    void 스트라이크0_볼2_테스트() {
        PlayResult playResult = balls.play(new Balls(Arrays.asList(4,3,2)));

        assertThat(playResult.strike).isEqualTo(0);
        assertThat(playResult.ball).isEqualTo(2);
    }

    @Test
    void 스트라이크3_볼0_테스트() {
        PlayResult playResult = balls.play(new Balls(Arrays.asList(1,2,3)));

        assertThat(playResult.strike).isEqualTo(3);
        assertThat(playResult.ball).isEqualTo(0);
    }
}
